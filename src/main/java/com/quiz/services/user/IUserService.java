package com.quiz.services.user;

import com.quiz.entities.App_User;
import com.quiz.entities.Question;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public interface IUserService {
    void remove(Long id);

    Optional<App_User> findById(Long id);
}
