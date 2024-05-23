package com.devtam.websocketdemo.service;

import com.devtam.websocketdemo.repository.UserRepository;
import com.devtam.websocketdemo.user.Status;
import com.devtam.websocketdemo.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public void saveUser(User user){
        user.setStatus(Status.ONLINE);
        userRepository.save(user);
    }
    public void disconnect(User user){
        var storeUser = userRepository.findById(user.getNickName()).orElse(null);
        if (storeUser != null){
            storeUser.setStatus(Status.OFFLINE);
            userRepository.save(storeUser);
        }
    }
    public List<User> findConnectedUsers(){
        return userRepository.findAllByStatus(Status.ONLINE);
    }

}
