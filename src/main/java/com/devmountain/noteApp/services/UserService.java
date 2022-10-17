package com.devmountain.noteApp.services;

import com.devmountain.noteApp.dtos.UserDto;

import javax.transaction.Transactional;
import java.util.List;

public interface UserService {

    // These services are used to execute CRUD SQL call using transactional and methods have been defined here
    @Transactional
    List<String> addUser(UserDto userDto);

    List<String> userLogin(UserDto userDto);
}
