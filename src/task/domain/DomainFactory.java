package task.domain;

interface DomainFactory {
	
	static DomainFactory instance = null;
	
	TaskRepository createTaskRepository();
	
	UserRepository createUserRepository();
	
	TaskService createTaskService();

}
