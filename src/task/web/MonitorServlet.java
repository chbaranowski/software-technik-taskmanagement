package task.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MonitorServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		StringBuilder html = new StringBuilder();
		html.append("<html>");
		html.append("<body>");
		html.append("<p>OK</p>");
		html.append("</body>");
		html.append("</html>");
		resp.getWriter().append(html);
	}

}
