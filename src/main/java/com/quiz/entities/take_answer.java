package com.quiz.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class take_answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    @Column(columnDefinition = "TEXT")
    private String content;
    @ManyToOne
    private take take;
    @ManyToOne
    private Question_Answer question_answer;

}
