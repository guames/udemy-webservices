package com.ga.udemy.restful.service;

import com.ga.udemy.restful.repository.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int usersCount = 3;

    static {
        users.add(new User(1L,"Gustavo",new Date()));
        users.add(new User(2L,"João",new Date()));
        users.add(new User(3L,"Roberto",new Date()));
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if(user.getId() == null){
            user.setId((long) ++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(Long id){
        for (User user: users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

}
