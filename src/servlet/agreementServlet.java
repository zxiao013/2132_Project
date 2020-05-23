package servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.agreement_info;
import dao.agreementdetailDao;

public class agreementServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		agreementdetailDao a_d = new agreementdetailDao();

		String gID = req.getParameter("Guest Id");
		int g_id = Integer.parseInt(gID);
		String hID = req.getParameter("Property Id");
		int h_id = Integer.parseInt(hID);

		String startDate = req.getParameter("start_date");
		Date start = Date.valueOf(startDate);

		String endDate = req.getParameter("end_date");
		Date end = Date.valueOf(endDate);

		String signingDate = req.getParameter("signing_date");
		Date signing = Date.valueOf(signingDate);

		agreement_info a_i = new agreement_info(g_id, h_id, signing, start, end);

		a_d.createBooking(a_i);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
