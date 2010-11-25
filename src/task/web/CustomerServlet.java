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

import task.domain.Task;
import task.domain.TaskDomainFactory;
import task.domain.TaskFacade;
import task.domain.User;

public class CustomerServlet extends HttpServlet {

	TaskFacade taskFacade = TaskDomainFactory.instance.createTaskFacade();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		String username = (String) session.getAttribute("username");
		if (username != null) {
			InputStream loginHtmlPage = getClass().getResourceAsStream("edit.html");
			ServletOutputStream outputStream = resp.getOutputStream();
			IOUtils.copy(loginHtmlPage, outputStream);
		} else {
			resp.sendRedirect("login");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String username = (String) session.getAttribute("username");
		if (username != null) {
			User user = new User();
			user.setUsername(username);
			Task task = new Task();
			task.setUser(user);
			task.setTitel(req.getParameter("title"));
			task.setDescription(req.getParameter("description"));
			taskFacade.createTask(task);
			resp.sendRedirect("overview");
		} else {
			resp.sendRedirect("login");
		}
	}

}
