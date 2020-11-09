package com.quiz.services;

import com.quiz.entities.Question;

import java.util.Optional;

public interface IQuestionService {
    Iterable<Question> findAll();
    Optional<Question> findById(Long id);
    Question save(Question question);
}
