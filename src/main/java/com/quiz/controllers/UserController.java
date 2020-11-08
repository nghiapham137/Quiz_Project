package com.quiz.controllers;

import com.quiz.entities.App_User;
import com.quiz.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl service;


    @PostMapping(value = "/create",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<App_User> create_User(@RequestBody App_User app_user){
        App_User user = service.save(app_user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    @GetMapping(value = "/showAll")
    public ResponseEntity<Iterable<App_User>> findAll(){
        return new ResponseEntity<>(service.findAll(),HttpStatus.OK);
    }
    @PutMapping(value = "/edit/{id}",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<App_User> update(@RequestBody App_User app_user,@PathVariable Long id){
        if (!service.findById(id).isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        app_user.setId(id);
        return new ResponseEntity<>(service.save(app_user),HttpStatus.OK);
    }
}
