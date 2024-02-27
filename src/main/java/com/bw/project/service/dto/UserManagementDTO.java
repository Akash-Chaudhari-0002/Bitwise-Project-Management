package com.bw.project.service.dto;

import com.bw.project.entity.enumeration.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserManagementDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;
    private boolean isDeleted;
    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
}
