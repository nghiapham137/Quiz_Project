package com.quiz.services.question;

import com.quiz.entities.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface QuestionService {

    Page<Question> findAll(Pageable pageable);

    Page<Question> findAllByTitleContaining(String title,Pageable pageable);

    Page<Question> findAllByQuestionType(Integer questionType,Pageable pageable);

    Page<Question> findAllByScore(int score,Pageable pageable);

    Page<Question> findAllByLevel(int level,Pageable pageable);

    Page<Question> findAllByIsActive(boolean isActive,Pageable pageable);
}
