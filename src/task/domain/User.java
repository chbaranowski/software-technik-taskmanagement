package task.domain;

import java.io.Serializable;
import java.util.Collection;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;

	/**
	 * @uml.property name="task"
	 * @uml.associationEnd multiplicity="(0 -1)" aggregation="shared"
	 *                     inverse="user:task.domain.Task"
	 */
	private Collection<Task> task;

	private String username;

	public int getId() {
		return id;
	}

	/**
	 * Getter of the property <tt>task</tt>
	 * 
	 * @return Returns the task.
	 * @uml.property name="task"
	 */
	public Collection<Task> getTask() {
		return task;
	}

	public String getUsername() {
		return username;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Setter of the property <tt>task</tt>
	 * 
	 * @param task
	 *            The task to set.
	 * @uml.property name="task"
	 */
	public void setTask(Collection<Task> task) {
		this.task = task;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
