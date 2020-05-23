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
@WebServlet(urlPatterns = "/login_success_admin")

public class login_success_adminServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		if(action.equals("update")) {
			req.getRequestDispatcher("login_success_employee.jsp").forward(req, resp);
		}else if(action.equals("create role")) {
			req.getRequestDispatcher("login_success_employee.jsp").forward(req, resp);
		}
	}
}
