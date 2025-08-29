package com.web_api.controller;

import com.web_api.model.User;
import com.web_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping()
    public List<User> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(Integer id){
        repository.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody User user){
        repository.save(user);
    }
}
