package com.quiz.entities;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
public class User {
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
    private Group group;
    @Transient
    private MultipartFile avatar;
    @ManyToOne
    private User_Role user_role;



}
