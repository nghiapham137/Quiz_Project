package com.quiz.entities;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @Column(columnDefinition = "TEXT")
    private String password;
    private int age;
    private String address;
    private String email;
    @Column(columnDefinition = "TEXT")
    private String image;
    private Timestamp createAt;
    private Timestamp dob;
    @ManyToOne
    private UserGroup userGroup;
    @Transient
    private MultipartFile avatar;
    @ManyToOne
    private UserRole user_role;



}
