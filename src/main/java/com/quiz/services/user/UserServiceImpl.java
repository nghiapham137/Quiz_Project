package com.quiz.services.user;

import com.quiz.entities.App_User;
import com.quiz.entities.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserService userService;

    @Override
    public void remove(Long id) {
        userService.remove(id);
    }

    @Override
    public Optional<App_User> findById(Long id) {
        return userService.findById(id);
    }
}
