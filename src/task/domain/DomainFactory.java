package task.domain;

interface DomainFactory {
	
	static DomainFactory instance = new DomainFactoryImpl();
	
	TaskRepository createTaskRepository();
	
	UserRepository createUserRepository();
	
	TaskService createTaskService();

}
