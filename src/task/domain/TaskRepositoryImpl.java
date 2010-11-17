package task.domain;

import java.sql.Date;
import java.util.Collection;

class TaskRepositoryImpl implements TaskRepository {
	
	private static TaskRepositoryImpl instance = new TaskRepositoryImpl();
	
	private TaskRepositoryImpl() {
	}
	
	public static TaskRepositoryImpl getInstance(){
		return instance;
	}

	@Override
	public void deleteTask(Task task) {
		throw new RuntimeException("Not Impl");
	}
	

	@Override
	public Collection<Task> findAllTasksForUser(User user, Date olderThenDate) {
		throw new RuntimeException("Not Impl");
	}

	@Override
	public Task findTaskById(int id) {
		new Task();
		throw new RuntimeException("Not Impl");
	}

	@Override
	public void insertTask(Task task) {
		throw new RuntimeException("Not Impl");
	}

	@Override
	public void updateTask(Task task) {
		throw new RuntimeException("Not Impl");
	}

}
