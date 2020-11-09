package com.quiz.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

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
    private App_Subject appSubject;
}
