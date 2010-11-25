package task.web;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

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

public class OverviewServlet extends HttpServlet {

	TaskFacade taskFacade = TaskDomainFactory.instance.createTaskFacade();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		String username = (String)session.getAttribute("username");
		if (username != null) {
			String template = IOUtils.toString(getClass().getResourceAsStream("overview.html"));
			User user = new User();
			user.setUsername(username);
			StringBuilder builder = new StringBuilder();
			Collection<Task> tasks = taskFacade.findAllTasksForUser(user);
			for (Task task : tasks) {
				builder.append("<tr>");
				builder.append("<td>");
				builder.append(task.getTitel());
				builder.append("</td>");
				builder.append("<td>");
				builder.append(task.getDescription());
				builder.append("</td>");
				builder.append("<td>");
				builder.append("</td>");
				builder.append("<tr>");
			}
			String response = template.replace("${tasks}", builder.toString());
			resp.getWriter().print(response);
		} else {
			resp.sendRedirect("login");
		}
	}

}
