package com.quiz.services;

import com.quiz.entities.AppUser;

import java.util.Optional;

public interface IUserService {
    AppUser save(AppUser user);
    Iterable<AppUser> findAll();
    Optional <AppUser> findById(Long id);
}