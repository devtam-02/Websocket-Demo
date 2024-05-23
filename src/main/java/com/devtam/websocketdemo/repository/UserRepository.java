package com.devtam.websocketdemo.repository;

import com.devtam.websocketdemo.user.Status;
import com.devtam.websocketdemo.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    List<User> findAllByStatus(Status status);
}
