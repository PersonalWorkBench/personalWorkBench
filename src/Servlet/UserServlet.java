package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
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
		//UserModel usermodel = new UserModel();
		String status = request.getParameter("status");
		if(status.equals("login")) {
			UserImpl uesrImpl = new UserImpl();
			String account = request.getParameter("account");
			String pass = request.getParameter("pass");
			int login=uesrImpl.userModel(account,pass);
			switch(login) {
			case 0:
				response.sendRedirect("login.jsp?login=false");
				request.setAttribute("redirect", "redirect");
				break;
			case 1:
				session.setAttribute("account",account); //remember User ID
				request.getRequestDispatcher("/User/admin.jsp").forward(request, response);
				break;
			case 2:
				request.getRequestDispatcher("/index.jsp").forward(request, response);
				break;
			
			}
			
			

			}
		}
	}


