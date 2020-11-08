package com.quiz.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

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
    private Group group;
    @ManyToMany(mappedBy = "exams")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<Question> questions;

}
