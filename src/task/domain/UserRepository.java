package task.domain;

interface UserRepository {
	
	void insertUser(User user);
	
	void updateUser(User user);
	
	void delelteUser(User user);
	
	User findUserById(int id);
	
	User findUserByUsername(String username);

}
