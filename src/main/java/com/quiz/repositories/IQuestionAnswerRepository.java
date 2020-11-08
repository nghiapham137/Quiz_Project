package com.quiz.repositories;

import com.quiz.entities.Question_Answer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IQuestionAnswerRepository extends PagingAndSortingRepository<Question_Answer, Long> {
}
