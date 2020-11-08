package com.quiz.services.question;

import com.quiz.entities.Question;
import com.quiz.repositories.IQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    IQuestionRepository iQuestionRepository;


    @Override
    public Page<Question> findAll(Pageable pageable) {
        return iQuestionRepository.findAll(pageable);
    }

    @Override
    public Page<Question> findAllByTitleContaining(String title, Pageable pageable) {
        return iQuestionRepository.findAllByTitleContaining(title,pageable);
    }

    @Override
    public Page<Question> findAllByQuestionType(Integer questionType, Pageable pageable) {
        return iQuestionRepository.findAllByQuestionType(questionType, pageable);
    }

    @Override
    public Page<Question> findAllByScore(int score, Pageable pageable) {
        return iQuestionRepository.findAllByScore(score, pageable);
    }

    @Override
    public Page<Question> findAllByLevel(int level, Pageable pageable) {
        return iQuestionRepository.findAllByLevel(level, pageable);
    }

    @Override
    public Page<Question> findAllByIsActive(boolean isActive, Pageable pageable) {
        return iQuestionRepository.findAllByIsActive(isActive, pageable);
    }
}
