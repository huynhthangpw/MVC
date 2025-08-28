package io.star.service.impl;

import io.star.dao.UserDao;
import io.star.dao.impl.UserDaoImpl;
import io.star.models.User;
import io.star.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao = new UserDaoImpl();

	@Override
	public User login(String username, String password) {
		// gọi DAO để lấy user theo username
		User user = this.get(username);

		// nếu user tồn tại và mật khẩu trùng khớp thì trả về
		if (user != null && password.equals(user.getPassWord())) {
			return user;
		}

		// sai thì return null
		return null;
	}

	@Override
	public User get(String username) {
		return userDao.get(username);
	}
}
