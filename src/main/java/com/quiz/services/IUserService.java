package com.quiz.services;

import com.quiz.entities.App_User;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

public interface IUserService {
    App_User save(App_User user);
    Iterable<App_User> findAll();
    Optional <App_User> findById(Long id);
}
