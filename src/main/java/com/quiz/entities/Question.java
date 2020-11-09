package com.quiz.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer questionType;
    private int score;
    private int level;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private boolean isActive;
    @ManyToOne
    private AppSubject appSubject;
}
