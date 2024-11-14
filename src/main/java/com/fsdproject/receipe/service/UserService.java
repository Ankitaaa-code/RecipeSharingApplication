package com.fsdproject.receipe.service;

import com.fsdproject.receipe.exception.UserException;
import com.fsdproject.receipe.model.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;

}
