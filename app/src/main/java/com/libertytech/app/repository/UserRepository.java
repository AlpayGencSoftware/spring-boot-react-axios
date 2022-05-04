package com.libertytech.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libertytech.app.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
