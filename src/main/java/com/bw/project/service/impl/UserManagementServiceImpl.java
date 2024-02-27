package com.bw.project.service.impl;

import com.bw.project.entity.UserManagement;
import com.bw.project.repository.UserManagementRepository;
import com.bw.project.service.UserManagementService;
import com.bw.project.service.dto.UserManagementDTO;
import com.bw.project.service.mapper.UserManagementMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Service
public class UserManagementServiceImpl implements UserManagementService {

    private final Logger log = LoggerFactory.getLogger(UserManagementServiceImpl.class);
    private final UserManagementRepository userManagementRepository;

    private final UserManagementMapper userManagementMapper;

    public UserManagementServiceImpl(UserManagementRepository userManagementRepository, UserManagementMapper userManagementMapper) {
        this.userManagementRepository = userManagementRepository;
        this.userManagementMapper = userManagementMapper;
    }

    @Override
    public UserManagementDTO addNewUser(UserManagementDTO userManagementDTO) {
        log.debug("Request to add new UserManagement : {}", userManagementDTO);
        userManagementDTO.setCreatedAt(new Date());
        userManagementDTO.setUpdatedAt(new Date());

        UserManagement userManagement = userManagementMapper.toEntity(userManagementDTO);
        userManagement = userManagementRepository.save(userManagement);
        return userManagementMapper.toDto(userManagement);
    }

    @Override
    public List<UserManagementDTO> getAllUsers() {
        log.debug("Request to get all UserManagement");
        return userManagementRepository.findAll().stream().map(userManagementMapper::toDto).toList();
    }
}
