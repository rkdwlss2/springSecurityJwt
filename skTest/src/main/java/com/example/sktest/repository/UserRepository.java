package com.example.sktest.repository;

import com.example.sktest.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
    public Users findByUsername(String user);
}
