package com.firstproj.RESTAPI.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstproj.RESTAPI.entity.Users;
import com.firstproj.RESTAPI.payload.UserDto;
import com.firstproj.RESTAPI.repository.UserRepository;
import com.firstproj.RESTAPI.service.UserService;

@Service

public class UserServiceImpl implements UserService{
	@SuppressWarnings("unused")
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDto createUser(UserDto userDto) {
		//userDto is not an entity of user
		Users user= userDtoToEntity(userDto);
		USers savedUserRepository.save(user);
		return null;
	}
	@SuppressWarnings("unused")
	private Users userDtoToEntity(UserDto userDto) {
		Users users= new Users();
		Users.setName(userDto.getName());
		Users.setemail(userDto.getEmail());
		Users.setpassword(userDto.getpassword());
		return users;
	}
	
	@Override
	public void createrUser(UserDto userDto) {
		// TODO Auto-generated method stub
		
	}

}
