package com.example.fsdproject1;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "email", nullable=false, unique = true)
    private String email;
    @Column(name = "phone")
    private String phone;
}
