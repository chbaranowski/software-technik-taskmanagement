package task.domain;

import java.util.Collection;
import java.util.HashMap;

class TaskRepositoryImpl implements TaskRepository {
	
	private static TaskRepositoryImpl instance = new TaskRepositoryImpl();
	
	private HashMap<User, HashMap<Integer, Task>> userTasks = new HashMap<User, HashMap<Integer,Task>>();
	
	private int lastId = 0;
	
	private TaskRepositoryImpl() {
	}
	
	public static TaskRepositoryImpl getInstance(){
		return instance;
	}

	@Override
	public void deleteTask(Task task) {
		HashMap<Integer, Task> tasks = userTasks.get(task.getUser());
		tasks.remove(task.getId());
	}
	

	@Override
	public Collection<Task> findAllTasksForUser(User user) {
		HashMap<Integer, Task> tasks = userTasks.get(user);
		if(tasks == null){
			userTasks.put(user, new HashMap<Integer, Task>());
			tasks = userTasks.get(user);
		}
		return tasks.values();
	}

	@Override
	public Task findTaskById(User user, int id) {
		HashMap<Integer, Task> tasks = userTasks.get(user);
		return tasks.get(id);
	}

	@Override
	public void insertTask(Task task) {
		task.setId(lastId++);
		HashMap<Integer, Task> tasks = userTasks.get(task.getUser());
		tasks.put(task.getId(), task);
	}

	@Override
	public void updateTask(Task task) {
		
	}

}
