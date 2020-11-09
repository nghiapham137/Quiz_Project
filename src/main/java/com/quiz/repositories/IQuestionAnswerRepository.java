package com.quiz.repositories;

import com.quiz.entities.QuestionAnswer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IQuestionAnswerRepository extends PagingAndSortingRepository<QuestionAnswer, Long> {
}
