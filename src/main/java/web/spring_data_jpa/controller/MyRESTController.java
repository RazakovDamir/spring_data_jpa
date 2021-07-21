package web.spring_data_jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.spring_data_jpa.entity.User;
import web.spring_data_jpa.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public List<User> showAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        User user = userService.getUser(id);
        return user;
    }

    @PostMapping("/users")
    public User addNewUser(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id) {
        User user = userService.getUser(id);
        userService.deleteUser(id);
        return "User with ID = " + id + " was deleted";
    }

    @GetMapping("/users/name/{name}")
    public List<User> showAllUsersByName (@PathVariable String name) {
        List<User> users = userService.findAllByName(name);
        return users;

    }

}
