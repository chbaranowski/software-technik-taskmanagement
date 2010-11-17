package task.domain;

class TaskDomainFactoryImpl implements TaskDomainFactory {

	@Override
	public TaskFacade createTaskFacade() {
		return new TaskFacadeImpl();
	}

}
