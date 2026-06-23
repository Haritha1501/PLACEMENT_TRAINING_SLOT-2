package com.example.Project2ConnectDb;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class ConnectController {

//        @GetMapping("/hello")
//        public String sayHello() {
//            return "Hello from Spring Boot backend!";
//        }

    private final ConnectRepository repo;
    public ConnectController(ConnectRepository repo) {
        this.repo = repo;
    }
    @GetMapping("/getAllRecord")
    public List<ConnectEntity> getAllStudents() {
        return repo.findAll();
    }
    @GetMapping("/getInputRecord/{num}")
    public String getInputRecord(@PathVariable int num) {
        List<ConnectEntity> list = repo.findAll();
        return list.get(num-1).getText();
    }
    @GetMapping("/hello")
    public String sayHello(){
        List<ConnectEntity> list = repo.findAll();
        if(list.isEmpty()){
            repo.save(new ConnectEntity("Hello From Backend and DB!"));
            return "Hello from Backend and DB!";
        }
        return list.get(0).getText();
    }
    @PostMapping("/hello")
    public String addMsg(@RequestBody ConnectEntity entity){
        repo.save(entity);
        return "Saved: "+entity.getText();
    }
}
