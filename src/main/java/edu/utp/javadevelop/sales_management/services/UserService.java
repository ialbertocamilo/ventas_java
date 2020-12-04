package edu.utp.javadevelop.sales_management.services;

import edu.utp.javadevelop.sales_management.models.Users;
import edu.utp.javadevelop.sales_management.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public Users save(Users user) {
        return userRepository.save(user);
    }


    public List<Users> getAll(){
        return userRepository.findAll();
    }
}
