package com.example.SpringAPI.api.service;

import com.example.SpringAPI.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService(){
        userList = new ArrayList<>();
        User user1 = new User(1,  "firstUser",  1,  "firstUser@gmail.com");
        User user2 = new User( 2, "secondUser",  2,  "secondUser@gmail.com");
        User user3 = new User(3, "thirdUser",3,  "thirdUser@gmail.com");
        User user4 = new User( 4,  "fourthUser", 4,  "fourthUser@gmail.com");
        User user5 = new User( 5,  "fifthUser",5, "fifthUser@gmail.com");
        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public Optional<User> getUser(Integer id){
        Optional optional = Optional.empty();
        for(User user: userList){
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return  optional;

    }
}
