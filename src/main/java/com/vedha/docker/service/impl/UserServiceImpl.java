package com.vedha.docker.service.impl;

import com.vedha.docker.dto.UserDTO;
import com.vedha.docker.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<UserDTO> getUsers() {

        List<UserDTO> userDTOS = new ArrayList<>();

        userDTOS.add(new UserDTO(1, "Vedha", "22"));
        userDTOS.add(new UserDTO(2, "Vijay", "50"));
        userDTOS.add(new UserDTO(3, "Vjs", "40"));

        return userDTOS;
    }
}
