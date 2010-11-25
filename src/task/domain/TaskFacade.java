package task.domain;

import java.util.Collection;

public interface TaskFacade {
	
	void createTask(Task task);
	
	void createBatchTasks(Collection<Task> tasks);
	
	void updateTask(Task task);
	
	void deleteTask(Task task);
	
	Task findTaskById(User user, int id);
	
	Collection<Task> findAllTasksForUser(User user);
	
	void insertUser(User user);
	
	void updateUser(User user);
	
	void delelteUser(User user);
	
	User findUserById(int id);
	
	User findUserByUsername(String username);

}
