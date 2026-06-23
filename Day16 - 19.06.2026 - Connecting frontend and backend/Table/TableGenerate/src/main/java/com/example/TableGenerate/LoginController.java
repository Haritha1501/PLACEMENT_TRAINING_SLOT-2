package com.example.TableGenerate;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestBody UserLogin login){
        if("hari".equals(login.getUsername()) && "81189".equals(login.getPassword())) {
            return "Hello bro, From Back End, you are successfully found !";
        }else{
            return "Hey dude, I am so sorry, We can't find you. Try other usernames and passwords";
        }
    }

    static class UserLogin{
        private String username;
        private String password;

        public String getUsername(){
            return username;
        }
        public void setUsername(String username){
            this.username = username;
        }
        public String getPassword(){
            return password;
        }
        public void setPassword(String password){
            this.password = password;
        }
    }
}
