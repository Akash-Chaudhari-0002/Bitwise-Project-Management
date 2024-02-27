package com.bw.project.repository;

import com.bw.project.entity.UserManagement;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserManagementRepository extends MongoRepository<UserManagement, String> {
}
