package com.devtam.websocketdemo.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class User {
    private String nickName;
    private String fullName;
    private Status status;
}
