package com.vedha.docker.service;

import com.vedha.docker.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> getUsers();
}
