package com.quiz.repositories;

import com.quiz.entities.Question;
<<<<<<< HEAD
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IQuestionRepository extends PagingAndSortingRepository<Question,Long> {

    Page<Question> findAll(Pageable pageable);

    Page<Question> findAllByTitleContaining(String title,Pageable pageable);

    Page<Question> findAllByQuestionType(Integer questionType,Pageable pageable);

    Page<Question> findAllByScore(int score,Pageable pageable);

    Page<Question> findAllByLevel(int level,Pageable pageable);

    Page<Question> findAllByIsActive(boolean isActive,Pageable pageable);
=======
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IQuestionRepository extends PagingAndSortingRepository<Question, Long> {
>>>>>>> ff6196f588206159fe3150d4681008d2314d8060
}
