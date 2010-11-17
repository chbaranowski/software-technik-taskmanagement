package task.domain;

class DomainFactoryImpl implements DomainFactory {

	@Override
	public TaskRepository createTaskRepository() {
		return TaskRepositoryImpl.getInstance();
	}

	@Override
	public UserRepository createUserRepository() {
		return UserRepositoryImpl.getInstance();
	}

	@Override
	public TaskService createTaskService() {
		return null;
	}

}
