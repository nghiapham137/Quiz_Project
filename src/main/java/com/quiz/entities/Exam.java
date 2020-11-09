package com.quiz.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String examName;
    private String examCode;
    private Integer examType;
    private int score;
    private Timestamp startedAt;
    private Timestamp finishedAt;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    @ManyToOne
    private UserGroup userGroup;

}
