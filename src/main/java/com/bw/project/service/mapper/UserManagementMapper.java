package com.bw.project.service.mapper;

import com.bw.project.entity.UserManagement;
import com.bw.project.service.dto.UserManagementDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface UserManagementMapper extends EntityMapper<UserManagementDTO, UserManagement> {
}
