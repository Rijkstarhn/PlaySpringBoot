package com.raypractice.employeeapi;

//import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    // TODO: why we don't need this?
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public List<User> GetUsers() {
//    public String GetUsers() {
        int x = 0;
        return userRepository.findAll();
//        return "Hello World!";
    }

    @GetMapping("/{id}")
    public User GetUser(@PathVariable String id) {
        return userRepository.findById(id).orElse(null);
    }

    @PostMapping("/")
    public User postUser(@RequestBody User user) {
        int y = 1;
        return userRepository.save(user);
    }

    @PutMapping("/")
    public User updateUser(@RequestBody User user) {
        User oldUser = userRepository.findById(user.getId()).orElse(null);
        oldUser.setEmail(user.getEmail());
        oldUser.setName(user.getName());
        oldUser.setPassword(user.getPassword());
        return oldUser;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {
        userRepository.deleteById(id);
        return id;
    }
}
