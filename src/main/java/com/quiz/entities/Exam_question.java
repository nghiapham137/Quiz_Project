package com.quiz.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Exam_question {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  Long id;

    @ManyToOne
    private Exam exam;

    @ManyToOne
    private Question question;
}
