package com.vedha.docker.controller;

import com.vedha.docker.dto.UserDTO;
import com.vedha.docker.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping(
            value = {"user", "users"},
            consumes = {MediaType.ALL_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<List<UserDTO>> testUser() {

        List<UserDTO> users = userService.getUsers();

        return ResponseEntity.ok().body(users);
    }
}
