package com.quiz.repositories;

import com.quiz.entities.App_User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IUserRepository extends PagingAndSortingRepository<App_User, Long> {
}
