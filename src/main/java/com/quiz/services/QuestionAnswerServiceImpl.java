package com.quiz.services;

import com.quiz.entities.QuestionAnswer;
import com.quiz.repositories.IQuestionAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionAnswerServiceImpl implements IQuestionAnswerService {
    @Autowired
    private IQuestionAnswerRepository questionAnswerRepository;
    @Override
    public Iterable<QuestionAnswer> findAll() {
        return questionAnswerRepository.findAll();
    }
}
