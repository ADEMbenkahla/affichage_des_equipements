package com.sfm.stage.service;


import java.util.List;

import com.sfm.stage.dto.UserDto;
import com.sfm.stage.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
    void deleteById(long id);
}