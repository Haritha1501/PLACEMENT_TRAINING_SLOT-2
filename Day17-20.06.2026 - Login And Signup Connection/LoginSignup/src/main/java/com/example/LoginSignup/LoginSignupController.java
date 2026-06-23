package com.example.LoginSignup;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginSignupController {
    private LoginSignupRepository repo;

    public LoginSignupController(LoginSignupRepository repo) {
        this.repo = repo;
    }


    @GetMapping("/getpswd/{user}")
    public String getPass(@PathVariable String user) {

        Map<String, LoginSignupEntity> map = repo.findAll()
                .stream()
                .collect(Collectors.toMap(
                        LoginSignupEntity::getUsername,
                        entity -> entity
                ));

        LoginSignupEntity record = map.get(user);
        if(record == null) {
            return "Record not found";
        }
        return record.getPassword();
    }
    public String getPassword(String username){
        List<LoginSignupEntity> list = repo.findAll();
        Map<String, LoginSignupEntity> map = new HashMap<>();

        for(LoginSignupEntity user : list){
            map.put(user.getUsername(), user);
        }

//        List<LoginSignupEntity> list = repo.findAll();
//        return list.get(username)
    }

//    @PostMapping("/login")
//    public String login(@RequestBody UserLogin login){
//        if("hari".equals(login.getUsername()) && "81189".equals(login.getPassword())) {
//            return "Hello bro, From Back End, you are successfully found !";
//        }else{
//            return "Hey dude, I am so sorry, We can't find you. Try other usernames and passwords";
//        }
//    }
//
//    static class UserLogin{
//        private String username;
//        private String password;
//
//        public String getUsername(){
//            return username;
//        }
//        public void setUsername(String username){
//            this.username = username;
//        }
//        public String getPassword(){
//            return password;
//        }
//        public void setPassword(String password){
//            this.password = password;
//        }
//    }
}
