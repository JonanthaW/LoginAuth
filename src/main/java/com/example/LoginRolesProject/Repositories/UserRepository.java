package com.example.LoginRolesProject.Repositories;

import com.example.LoginRolesProject.Entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findByUsername(String email);
}
