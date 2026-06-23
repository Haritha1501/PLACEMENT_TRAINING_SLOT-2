package com.example.assessment;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class AccessController {
    private final AssessRepository repo;
    public AccessController(AssessRepository repo) {
        this.repo = repo;
    }
    @GetMapping("/records")
    public List<AssessEntity> findAll() {
        return repo.findAll();
    }
//    @PostMapping("/task")
//    public String save(@RequestBody Map<String,Object> body) {
//        System.out.println(body);
//        return "OK";
//    }

    @PostMapping("/task")
    public AssessEntity save(@RequestBody AssessEntity entity) {
        return repo.save(entity);
    }

    @PostMapping("/records/all")
    public AssessEntity getTask(@PathVariable int num) {
        List<AssessEntity> lst = repo.findAll();
        return lst.get(num - 1);
    }
}
