package io.star.service;

import io.star.models.User;

public interface UserService {

	User login(String username, String password);
    User get(String username);
}
