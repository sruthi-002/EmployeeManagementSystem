package com.example.demo.Service;

import com.example.demo.Model.User;
import com.example.demo.Repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User add(User user) {
        return userRepo.save(user);
    }

    public List<User> all() {
        return userRepo.findAll();
    }

    public User edit(User user) {
        return userRepo.save(user);
    }
}
