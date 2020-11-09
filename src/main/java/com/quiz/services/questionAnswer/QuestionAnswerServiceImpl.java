package com.quiz.services.questionAnswer;

import com.quiz.entities.Question_Answer;
import com.quiz.repositories.IQuestionAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionAnswerServiceImpl implements IQuestionAnswerService {
    @Autowired
    private IQuestionAnswerRepository questionAnswerRepository;
    @Override
    public Iterable<Question_Answer> findAll() {
        return questionAnswerRepository.findAll();
    }
}
