package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.hosts_info;
import dao.hostdetailsDao;
@WebServlet(urlPatterns = "/signin_hosts")
public class signin_hostsServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		hostdetailsDao  g_d = new hostdetailsDao();
		String action = req.getParameter("action");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		int id=Integer.parseInt(req.getParameter("id"));
		String address=req.getParameter("address");
		String email=req.getParameter("email");
		int phone=Integer.parseInt(req.getParameter("phone"));
		
		hosts_info hosts = new hosts_info(name,password,id);
		
		hosts_info host = new hosts_info(id,name,address,email,phone,password);
		
		
		HttpSession session = req.getSession();
		if (action.equals("signin")) {
			g_d.createHostssDetailsInfo(host);
			req.getRequestDispatcher("login.html").forward(req, resp);
			
		}

	
	
	
	
	}

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
}

