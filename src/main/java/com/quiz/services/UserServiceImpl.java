package com.quiz.services;

import com.quiz.entities.App_User;
import com.quiz.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public App_User save(App_User user) {
        return userRepository.save(user);
    }

    @Override
    public Iterable<App_User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<App_User> findById(Long id) {
        return userRepository.findById(id);
    }
}
