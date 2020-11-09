package com.quiz.repositories;

import com.quiz.entities.AppUser;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IUserRepository extends PagingAndSortingRepository<AppUser,Long> {
}
