package com.quiz.controllers;

import com.quiz.entities.AppUser;
import com.quiz.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService service;


    @PostMapping(value = "/create",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppUser> create_User(@RequestBody AppUser app_user){
        AppUser user = service.save(app_user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    @GetMapping(value = "/showAll")
    public ResponseEntity<Iterable<AppUser>> findAll(){
        return new ResponseEntity<>(service.findAll(),HttpStatus.OK);
    }
    @PutMapping(value = "/edit/{id}",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppUser> update(@RequestBody AppUser app_user, @PathVariable Long id){
        System.out.println("Updating Question " + id);
        if (!service.findById(id).isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        app_user.setId(id);
        return new ResponseEntity<>(service.save(app_user),HttpStatus.OK);
    }
}
