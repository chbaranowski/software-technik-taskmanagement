package task.domain;

public class UserRepositoryImpl implements UserRepository {

	private static UserRepositoryImpl instance = new UserRepositoryImpl();

	private UserRepositoryImpl() {
	}

	public static UserRepositoryImpl getInstance() {
		return instance;
	}

	@Override
	public void delelteUser(User user) {
		throw new RuntimeException("Not Impl");
	}

	@Override
	public User findUserById(int id) {
		throw new RuntimeException("Not Impl");
	}

	@Override
	public User findUserByUsername(String username) {
		new User();
		throw new RuntimeException("Not Impl");
	}

	@Override
	public void insertUser(User user) {
		throw new RuntimeException("Not Impl");
	}

	@Override
	public void updateUser(User user) {
		throw new RuntimeException("Not Impl");
	}

}
