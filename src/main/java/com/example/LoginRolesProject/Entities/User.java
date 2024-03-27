package com.example.LoginRolesProject.Entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Table(name = "Users")
@Entity
@Data
public class User  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer Id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

}
