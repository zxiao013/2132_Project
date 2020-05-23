package servlet;
import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.guests_info;
import bo.hosts_info;
import dao.guestdetailsDao;
import dao.hostdetailsDao;
@WebServlet(urlPatterns = "/signin_guests")
public class signin_guestsServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		guestdetailsDao  g_d = new guestdetailsDao();
		String action = req.getParameter("action");
		String password = req.getParameter("password");
		String firstname=req.getParameter("first name");
		String lastname=req.getParameter("last name");
		int id;
		//=Integer.parseInt(req.getParameter("id"));
		String birth=req.getParameter("birth");
		String address=req.getParameter("address");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String fullname = req.getParameter("full name");

				if(req.getParameter("id") == "") {
			id = 3;
		}else {
			id =Integer.parseInt(req.getParameter("id"));
		}
		
		
		guests_info guests = new guests_info(firstname,lastname,fullname,id,birth,address,email,phone,password);

		
		
		
		HttpSession session = req.getSession();
		if (action.equals("signin")) {
			//System.out.println(g_d.createGuestsDetailsInfo(guests));
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
