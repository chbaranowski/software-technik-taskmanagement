package task.domain;

public interface TaskDomainFactory {
	
	static TaskDomainFactory instance = new TaskDomainFactoryImpl();
	
	TaskFacade createTaskFacade();
	
}
