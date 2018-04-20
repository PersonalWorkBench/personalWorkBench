package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Impl.AdminImpl;
import Model.UserModel;

@WebServlet("/adminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String status = request.getParameter("status");
		if(status.equals("query")) {
			String account = request.getParameter("account");
			AdminImpl adminImpl = new AdminImpl();
			ArrayList<UserModel> queryAccount = adminImpl.queryAccount(account);
			request.setAttribute("queryaccount", queryAccount);
			request.getRequestDispatcher("./Admin/adminAccount.jsp").forward(request, response);
		}
	}

}
