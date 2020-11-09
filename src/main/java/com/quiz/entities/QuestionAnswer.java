package com.quiz.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class QuestionAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean isCorrect;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    @Column(columnDefinition = "TEXT")
    private String content;
    private boolean isActive;
    @ManyToOne
    private Question question;
}
