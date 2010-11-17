package task.domain;

import java.util.Collection;

public interface TaskService {

	void createTask(Task task);
	
	void createBatchTasks(Collection<Task> tasks);
	
}
