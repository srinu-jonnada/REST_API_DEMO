package com.firstproj.RESTAPI.service;

import com.firstproj.RESTAPI.payload.UserDto;
public interface UserService {
	public void createrUser(UserDto userDto);

	UserDto createUser(UserDto userDto);
}
