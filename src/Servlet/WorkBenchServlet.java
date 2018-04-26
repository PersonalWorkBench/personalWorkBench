package Servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import Impl.WorkBenchImpl;
import Model.WorkBenchModel;


@WebServlet("/workBenchServlet")
public class WorkBenchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public WorkBenchServlet() {
        super();

    }


	public void init(ServletConfig config) throws ServletException {

	}

	public void destroy() {

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		HttpSession session =request.getSession();
		
		String status = request.getParameter("status");
		if(status.equals("signin")) {
			WorkBenchModel workbenchmodel = new WorkBenchModel();
			workbenchmodel.setWorkBenchName(request.getParameter("workBenchName"));
			workbenchmodel.setWorkBenchIntroduction(request.getParameter("workBenchIntroducton"));
			workbenchmodel.setTaxNumber(request.getParameter("taxNumber"));
			WorkBenchImpl workbenchimpl = new WorkBenchImpl();
			boolean workbenchsignin = workbenchimpl.wokrbenchsignin(workbenchmodel);
			if(workbenchsignin == true) { // if signin suss, will insert combined table in the same time;
				int userID = (int)session.getAttribute("userID");
				int workBenchID = workbenchimpl.workbenchID(request.getParameter("workBenchName"));
				workbenchimpl.combinedID(userID, workBenchID);
				request.getRequestDispatcher("../WorkBech/workBenchAdmin.jsp").forward(request, response);
			}else {
				System.out.println("signin unsuss");
				request.getRequestDispatcher("workBenchSign.jsp").forward(request, response);
			}
		}
	}

}
