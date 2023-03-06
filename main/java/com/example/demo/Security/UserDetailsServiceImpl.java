//package com.example.demo.Security;
//
//import com.example.demo.Model.User;
//import com.example.demo.Repo.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    @Autowired
//    private UserRepo userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user =userRepository.findByUsername(username);
//        if(user==null) {
//            throw new UsernameNotFoundException("Could not find User");
//        }
//        return new MyUserDetails(user);
//    }
//
//}