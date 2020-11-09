package com.quiz.controllers;

import com.quiz.entities.App_User;
import com.quiz.services.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<App_User> updateQuestion(@PathVariable("id") Long id) {
        App_User user = userService.findById(id).get();
        if (user == null){
            System.out.println("Unable to delete. user with id" + id + "not fount");
            return new ResponseEntity<App_User>(HttpStatus.NOT_FOUND);
        }
        userService.remove(id);
        return new ResponseEntity<App_User>(HttpStatus.NO_CONTENT);
    }
}
