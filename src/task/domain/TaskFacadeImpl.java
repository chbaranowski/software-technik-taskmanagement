package task.domain;

import java.sql.Date;
import java.util.Collection;

class TaskFacadeImpl implements TaskFacade {

	/**
	 * @uml.property name="taskRepository"
	 * @uml.associationEnd multiplicity="(1 -1)" aggregation="shared"
	 *                     inverse="user:task.domain.TaskRepository"
	 */
	private TaskRepository taskRepository = DomainFactory.instance.createTaskRepository();
	
	/**
	 * @uml.property name="userRepository"
	 * @uml.associationEnd multiplicity="(1 -1)" aggregation="shared"
	 *                     inverse="user:task.domain.UserRepository"
	 */
	private UserRepository userRepository = DomainFactory.instance.createUserRepository();
	
	/**
	 * @uml.property name="taskService"
	 * @uml.associationEnd multiplicity="(1 -1)" aggregation="shared"
	 *                     inverse="user:task.domain.TaskService"
	 */
	private TaskService taskService = DomainFactory.instance.createTaskService();

	public void createTask(Task task) {
		taskRepository.insertTask(task);
	}

	public void createBatchTasks(Collection<Task> tasks) {
		taskService.createBatchTasks(tasks);
	}

	public void updateTask(Task task) {
		taskRepository.updateTask(task);
	}

	public void deleteTask(Task task) {
		taskRepository.deleteTask(task);
	}

	public Task findTaskById(User user, int id) {
		return taskRepository.findTaskById(user, id);
	}

	public Collection<Task> findAllTasksForUser(User user) {
		return taskRepository.findAllTasksForUser(user);
	}

	public void insertUser(User user) {
		userRepository.insertUser(user);
	}

	public void updateUser(User user) {
		userRepository.updateUser(user);
	}

	public void delelteUser(User user) {
		userRepository.delelteUser(user);
	}

	public User findUserById(int id) {
		return userRepository.findUserById(id);
	}

	public User findUserByUsername(String username) {
		return userRepository.findUserByUsername(username);
	}

}
