package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("")
    private User add(@RequestBody User user)
    {
        return userService.add(user);
    }
    @GetMapping("")
    private List<User> all()
    {
        return userService.all();
    }
    @PutMapping("")
    private User edit(@RequestBody User user)
    {
        return userService.edit(user);
    }
}
