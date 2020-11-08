package com.quiz.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class Take {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer status;
    private int score;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp startedAt;
    private Timestamp finishedAt;
    @ManyToOne
    private App_User appUser;
    @ManyToOne
    private Exam exam;
}
