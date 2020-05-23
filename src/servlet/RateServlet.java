package servlet;
import java.io.IOException;
import java.sql.Date;

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
import bo.property_info;
import bo.review_rating_info;
import dao.propertydetailsDao;
import dao.review_ratingdetailsDao;


@WebServlet(urlPatterns = "/Rate")
public class RateServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		String p_id = req.getParameter("Property Id");
		String clean = req.getParameter("Clean");
		String convenience = req.getParameter("Convenience");
		String communication = req.getParameter("communication");
		String p_address = req.getParameter("Property_address");
		double rating = Double.parseDouble(req.getParameter("Rating"));
		review_rating_info rate = new review_rating_info(p_address,rating,communication,clean,convenience);
		review_ratingdetailsDao  r_d = new review_ratingdetailsDao();
		if(action.equals("rate")) {
			System.out.println("make sure you book the property");
			r_d.createRate(rate);
			req.getRequestDispatcher("login_success_guestsServlet.jsp").forward(req, resp);
			return;
		}
	}
	

}
