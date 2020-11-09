package com.quiz.services;

import com.quiz.entities.Question_Answer;

public interface IQuestionAnswerService {
    Iterable<Question_Answer> findAll();
}
