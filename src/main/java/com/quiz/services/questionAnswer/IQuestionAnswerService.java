package com.quiz.services.questionAnswer;

import com.quiz.entities.Question_Answer;

public interface IQuestionAnswerService {
    Iterable<Question_Answer> findAll();
}
