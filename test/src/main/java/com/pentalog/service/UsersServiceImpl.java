package com.pentalog.service;

import com.pentalog.User;
import com.pentalog.repository.UsersRepositoryImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UsersServiceImpl {
    @Resource
    UsersRepositoryImpl usersRepository;

    public User createUser(String fname, String lname, String date){
        User newUser = new User(fname, lname, date);
        return usersRepository.create(newUser);
    }
}
