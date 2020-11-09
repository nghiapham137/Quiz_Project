package com.quiz.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ExamQuestion {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  Long id;

    @ManyToOne
    private Exam exam;

    @ManyToOne
    private Question question;
}
