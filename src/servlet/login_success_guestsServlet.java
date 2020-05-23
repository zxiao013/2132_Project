package servlet;

import java.io.IOException;




import java.math.BigInteger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

import bo.admin_info;
import bo.employee_info;
import bo.guests_info;
import bo.hosts_info;
import dao.admindetailsDao;
import dao.employeedetailsDao;
import dao.guestdetailsDao;
import dao.hostdetailsDao;

@WebServlet(urlPatterns = "/login_success_guests")
public class login_success_guestsServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		
		
		if(action.equals("search")) {
			req.getRequestDispatcher("search_guests.jsp").forward(req, resp);
			return;
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	


}
