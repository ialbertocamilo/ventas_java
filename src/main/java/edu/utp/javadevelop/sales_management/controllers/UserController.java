package edu.utp.javadevelop.sales_management.controllers;


import edu.utp.javadevelop.sales_management.models.Users;
import edu.utp.javadevelop.sales_management.services.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.*;

import javax.websocket.MessageHandler;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController()
@RequestMapping(path = "/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/register")
    public Users save(@RequestBody Users user) {
        return userService.save(user);
    }

    @RequestMapping("/getAll")
    public List<Users> getAllUsers() {
        return userService.getAll();
    }

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody Users user){

        var username=user.getUsername();
        var password= user.getPassword();
        return new ResponseEntity<Object>("gaa", HttpStatus.OK);
    }
}
