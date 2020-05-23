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


@WebServlet(urlPatterns = "/login")
public class loginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		guestdetailsDao g_d = new guestdetailsDao();
		String action = req.getParameter("action");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String role = req.getParameter("role");
		String[] country = req.getParameterValues("country");
		String[] city = req.getParameterValues("city");

		int id;
		if (req.getParameter("id") == "") {
			id = 3;

		} else {
			id = Integer.parseInt(req.getParameter("id"));

		}
		guests_info guests = new guests_info(name, password, id);

		hostdetailsDao h_d = new hostdetailsDao();

		hosts_info hosts = new hosts_info(name, password, id);

		employeedetailsDao e_d = new employeedetailsDao();

		employee_info employee = new employee_info(name, id, password);

		admin_info admin = new admin_info(name, id, password);

		admindetailsDao a_d = new admindetailsDao();

		HttpSession session = req.getSession();
		if (action.equals("login")) {
			if (role.equals("Guests")) {
				if (g_d.findPersonInfo(guests) == true) {
					// System.out.println("true");
					req.getRequestDispatcher("login_success_guests.html").forward(req, resp);
					// resp.sendRedirect("login_success_guests.html");
					return;
				} else {
					System.out.println("We did not find you, please signin");
					System.out.println("If you select the wrong role, Please go back the page.");
					req.getRequestDispatcher("signin_general.jsp").forward(req, resp);
					return;
				}
			}

			if (role.equals("Hosts")) {
				if (h_d.findPersonInfo(hosts) == true) {
					req.getRequestDispatcher("login_success_hosts.jsp").forward(req, resp);
					// resp.sendRedirect("login_success_guests.html");
					return;
				} else {
					System.out.println("We did not find you, please signin");
					System.out.println("If you select the wrong role, Please go back the page.");
					req.getRequestDispatcher("signin_general.jsp").forward(req, resp);
					return;
				}
			}

			if (role.equals("Employee")) {
				if (e_d.findEmployeeInfo(employee) == true) {
					req.getRequestDispatcher("login_success_employee.jsp").forward(req, resp);
					return;
				}
				System.out.println("We did not find you, please signin");
				System.out.println("If you select the wrong role, Please go back the page.");
				req.getRequestDispatcher("signin_general.jsp").forward(req, resp);
				return;
			}

			if (role.equals("Admin")) {
				if (a_d.findperson(admin) == true) {
					req.getRequestDispatcher("login_success_admin.jsp").forward(req, resp);
					// resp.sendRedirect("login_success_guests.html");
					return;
				}
				System.out.println("We did not find you, please signin");
				System.out.println("If you select the wrong role, Please go back the page.");
				req.getRequestDispatcher("signin_general.jsp").forward(req, resp);
				return;
			}

		}

		if (action.equals("signin")) {
			req.getRequestDispatcher("signin_general.jsp").forward(req, resp);
			return;

		}
		

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
}
