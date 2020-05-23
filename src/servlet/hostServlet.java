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
import dao.propertydetailsDao;

@WebServlet(urlPatterns = "/login_success_hosts")
public class hostServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		propertydetailsDao p_d= new propertydetailsDao();
		String h_id= req.getParameter("id");
		int id= Integer.parseInt(h_id);
		String roomType= req.getParameter("roomType");
		String p_address= req.getParameter("address");
		String type= req.getParameter("type"); 
		String date= req.getParameter("date");
		Date dates= Date.valueOf(date);
		
		property_info p_i= new property_info(id, roomType, p_address, type, dates);
		String action= req.getParameter("action");
		if(action.equals("checkProperty")) {
			if(p_d.findProperty(p_i)) {
				req.getRequestDispatcher("/checkProperty.jsp").forward(req, resp);
			}
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
}
