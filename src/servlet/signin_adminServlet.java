package servlet;
import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.admin_info;
import bo.guests_info;
import bo.hosts_info;
import dao.admindetailsDao;
import dao.guestdetailsDao;
import dao.hostdetailsDao;
@WebServlet(urlPatterns = "/signin_admin")
public class signin_adminServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		int id=Integer.parseInt(req.getParameter("id"));;

		
		String action = req.getParameter("action");
		admindetailsDao a_d = new admindetailsDao();
		admin_info admin = new admin_info(name,id,password);
		if(action.equals("signin")) {
			a_d.createadminDetailsInfo(admin);
			req.getRequestDispatcher("login.html").forward(req, resp);
		}
		
		
		
		
		
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doPost(req, resp);
	}

}
