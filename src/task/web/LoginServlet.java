package task.web;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		Object username = session.getAttribute("username");
		if (username != null) {
			resp.sendRedirect("overview");
		} else {
			InputStream loginHtmlPage = getClass().getResourceAsStream(
					"login.html");
			ServletOutputStream outputStream = resp.getOutputStream();
			IOUtils.copy(loginHtmlPage, outputStream);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.setAttribute("username", req.getParameter("username"));
		resp.sendRedirect("overview");
	}

}
