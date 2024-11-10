package com.project.codeClash.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "lu_user")
@Setter
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_user_id")
    private int id;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "lastname", nullable = false)
    private String lastName;

    @Column(name = "country")
    private String country;

    @Column(name = "dob", nullable = false)
    private Date dob;

    @Column(name = "rank", nullable = false, length = 10)
    private String rank;

    @Column(name = "is_premium_user", nullable = true)
    private boolean isPremiumUser;

    @Column(name = "last_login", nullable = true, columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime lastLogin;

    @Column(name = "security_role", nullable = false, length = 20)
    private String securityRole;

    @ManyToOne
    @JoinColumn(name = "fk_user_role_id", referencedColumnName = "pk_user_role_id")
    private LuUserRole role; 

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    // Default constructor
    public User() {}

}
