package com.bw.project.service;

import com.bw.project.service.dto.UserManagementDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserManagementService {

    UserManagementDTO addNewUser(UserManagementDTO userManagementDTO);

    List<UserManagementDTO> getAllUsers();
}
