package com.quiz.repositories;

import com.quiz.entities.Question;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IQuestionRepository extends PagingAndSortingRepository<Question, Long> {
}
