package Servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Impl.UserImpl;
import Model.UserModel;


@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;  
    public UserServlet() {
        super();      
    }
	public void init(ServletConfig config) throws ServletException {	
	}
	public void destroy() {	
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session =request.getSession();
		UserModel usermodel = new UserModel();
		UserImpl userImpl = new UserImpl();
		String status = request.getParameter("status");
		if(status.equals("login")) {                              //帳號登入Servlet
			
			String account = request.getParameter("account");
			String pass = request.getParameter("pass");
			int login=userImpl.lognin(account,pass);
			switch(login) {   //0為帳號密碼錯誤 //1為管理者登入 2為使用者正常登
			case 0:
				response.sendRedirect("User/login.jsp?login=false");
				request.setAttribute("redirect", "redirect");
				break;
			case 1:
				session.setAttribute("userID",account); //remember User ID
				request.getRequestDispatcher("/Admin/admin.jsp").forward(request, response);
				break;
			case 2:
				session.setAttribute("userID",account); //remember User ID
			 	request.getRequestDispatcher("/index.jsp").forward(request, response);
				break;
			}
		}
		if(status.equals("signin")) {        //帳號註冊Servlet
			usermodel.setUserID(request.getParameter("account"));
			usermodel.setUserPass(request.getParameter("pass"));
			usermodel.setName(request.getParameter("name"));
			usermodel.setPersonalID(request.getParameter("personalID"));
			usermodel.setNumber(request.getParameter("number"));
			usermodel.setDate(request.getParameter("date"));
			usermodel.setSex(request.getParameter("sex"));
			usermodel.setAddress(request.getParameter("address"));
			usermodel.setPersonalPic(request.getParameter("personalPic"));
			boolean signin=userImpl.signin(usermodel);
			if(signin == true) {
				System.out.println("sign in suss");
			}
		
		}
		if(status.equals("profileExchange")) { //密碼更換
			//String account= (String)session.getAttribute("userID");
			String account ="0001";
			
			String oldPass= request.getParameter("oldPass");
			String newPass= request.getParameter("newPass");
			System.out.println(oldPass +"  new:" + newPass);
			boolean checkoldPass = userImpl.oldPassSearch(account,oldPass);
			if(checkoldPass == true) {
				userImpl.newPassChange(account , newPass);
				System.out.println("Exchange suss");	
			}
		}else {
			System.out.println("Exchange unsuss");
		}
		
		
		}
	}


