package com.bw.project.controller;

import com.bw.project.service.UserManagementService;
import com.bw.project.service.dto.UserManagementDTO;
import com.bw.project.service.impl.UserManagementServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserManagementResource {

    private final Logger log = LoggerFactory.getLogger(UserManagementServiceImpl.class);

    private final UserManagementService userManagementService;

    public UserManagementResource(UserManagementService userManagementService) {
        this.userManagementService = userManagementService;
    }

    @PostMapping("/user-management")
    public UserManagementDTO addNewUser(@RequestBody UserManagementDTO userManagementDTO) {
        return userManagementService.addNewUser(userManagementDTO);
    }

    @GetMapping("/user-management")
    public List<UserManagementDTO> getAllUsers() {
        return userManagementService.getAllUsers();
    }
}
