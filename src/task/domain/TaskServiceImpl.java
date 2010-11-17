package task.domain;

import java.util.Collection;

public class TaskServiceImpl implements TaskService {
	

	/**
	 * @uml.property name="userRepository"
	 * @uml.associationEnd multiplicity="(1 -1)" aggregation="shared"
	 *                     inverse="user:task.domain.UserRepository"
	 */
	private UserRepository userRepository = DomainFactory.instance.createUserRepository();
	
	/**
	 * @uml.property name="taskRepository"
	 * @uml.associationEnd multiplicity="(1 -1)" aggregation="shared"
	 *                     inverse="user:task.domain.TaskRepository"
	 */
	private TaskRepository taskRepository = DomainFactory.instance.createTaskRepository();
	
	@Override
	public void createTask(Task task) {
		throw new RuntimeException("Not Impl");
	}

	@Override
	public void createBatchTasks(Collection<Task> tasks) {
		throw new RuntimeException("Not Impl");
	}

}
