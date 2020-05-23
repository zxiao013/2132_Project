package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name = "signin_general" , urlPatterns = "/signin_general")
public class signinGeneralServlet extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		String role = req.getParameter("role");
	


		
		if (action.equals("confirm")){
			if(role.equals("Guests") ) {
					
				req.getRequestDispatcher("signin_guests.jsp").forward(req, resp);
				
				return;
			}
			else if(role.equals("Employee")) {
				req.getRequestDispatcher("signin_employee.jsp").forward(req, resp);
				
				return;	
			}
			else if(role.equals("Hosts")) {
				req.getRequestDispatcher("signin_hosts.jsp").forward(req, resp);
				
				return;	
			}
			else if (role.equals("Admin")) {
				req.getRequestDispatcher("signin_admin.jsp").forward(req, resp);
				
				return;	
			}
		}
			

	}
	
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
}
