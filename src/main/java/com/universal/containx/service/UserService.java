package com.universal.containx.service;

import com.universal.containx.dto.ProfileCompletionDto;
import com.universal.containx.dto.UserDto;
import com.universal.containx.model.User;

/**
 *  .
 */
public interface UserService {
    /**
     * Register a new user
     *
     * @param userDto
     * @return
     * @throws Exception 
     */
    UserDto signup(UserDto userDto) throws Exception;

    /**
     * Search an existing user
     *
     * @param email
     * @return
     */
    UserDto findUserByEmail(String email);

    /**
     * Update profile of the user
     *
     * @param userDto
     * @return
     */
    UserDto updateProfile(UserDto userDto);

    /**
     * Update password
     *
     * @param newPassword
     * @return
     */
    UserDto changePassword(UserDto userDto, String newPassword);
    
    ProfileCompletionDto getProfileCompletion(UserDto userDto);

	User FindByusername(String username);
	
	void SetLoginHistory();
}
