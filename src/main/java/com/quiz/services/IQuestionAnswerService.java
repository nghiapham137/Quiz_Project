package com.quiz.services;

import com.quiz.entities.QuestionAnswer;

public interface IQuestionAnswerService {
    Iterable<QuestionAnswer> findAll();
}
