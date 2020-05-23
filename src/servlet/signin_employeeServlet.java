package servlet;
import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.employee_info;
import bo.guests_info;
import bo.hosts_info;
import dao.employeedetailsDao;
import dao.guestdetailsDao;
import dao.hostdetailsDao;
@WebServlet(urlPatterns = "/signin_employee")
public class signin_employeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		employeedetailsDao  e_d = new employeedetailsDao();
		String action = req.getParameter("action");
		String password = req.getParameter("password");
		int id=Integer.parseInt(req.getParameter("id"));
		int b_id=Integer.parseInt(req.getParameter("branch id"));
		String position = req.getParameter("position");
		int salary  = Integer.parseInt(req.getParameter("salary"));
		String name = req.getParameter("name");
		String b_info = req.getParameter("basicinfo");
		

		employee_info e_i = new employee_info(id,b_info, position,salary,name, b_id,  password);
	
		if(action.equals("signin")) {
			e_d.createEmployeeDetailsInfo(e_i);
			req.getRequestDispatcher("login.html").forward(req, resp);
			return;
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
}
