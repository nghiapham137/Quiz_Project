package com.quiz.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class TakeAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    @Column(columnDefinition = "TEXT")
    private String content;
    @ManyToOne
    private AppTake appTake;
    @ManyToOne
    private QuestionAnswer question_answer;

}
