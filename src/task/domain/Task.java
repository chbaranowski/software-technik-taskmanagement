package task.domain;

import java.io.Serializable;
import java.util.Date;

public class Task implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date creationDate;

	private String description;

	private int id;

	private String titel;

	/**
	 * @uml.property name="user"
	 * @uml.associationEnd multiplicity="(1 1)" inverse="task:task.domain.User"
	 */
	private User user = new task.domain.User();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public String getDescription() {
		return description;
	}

	public int getId() {
		return id;
	}

	public String getTitel() {
		return titel;
	}

	/**
	 * Getter of the property <tt>user</tt>
	 * 
	 * @return Returns the user.
	 * @uml.property name="user"
	 */
	public User getUser() {
		return user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	/**
	 * Setter of the property <tt>user</tt>
	 * 
	 * @param user
	 *            The user to set.
	 * @uml.property name="user"
	 */
	public void setUser(User user) {
		this.user = user;
	}

}
