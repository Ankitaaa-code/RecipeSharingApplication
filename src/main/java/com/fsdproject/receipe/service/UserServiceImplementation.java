package com.fsdproject.receipe.service;


import java.util.Optional;

import com.fsdproject.receipe.exception.UserException;
import com.fsdproject.receipe.model.User;
import com.fsdproject.receipe.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.fsdproject.receipe.config.JwtProvider;

@Service
public class UserServiceImplementation implements UserService {


	private UserRepository userRepository;
	private JwtProvider jwtProvider;
	private PasswordEncoder passwordEncoder;

	
	public UserServiceImplementation(
			UserRepository userRepository,
			JwtProvider jwtProvider,
			PasswordEncoder passwordEncoder) {
		
		this.userRepository = userRepository;
		this.jwtProvider = jwtProvider;
		this.passwordEncoder = passwordEncoder;
		
		
	}
	

	
	
	
	



	
	@Override
	public User findUserProfileByJwt(String jwt) throws UserException {
		String email=jwtProvider.getEmailFromJwtToken(jwt);
		
		System.out.println("email"+email);
		
		Optional<User> user=userRepository.findByEmail(email);
		
		if(user.isEmpty()) {
			throw new UserException("user not exist with email "+email);
		}
		System.out.println("email user "+user.get().getEmail());
		return user.get();
	}
	

	



}
