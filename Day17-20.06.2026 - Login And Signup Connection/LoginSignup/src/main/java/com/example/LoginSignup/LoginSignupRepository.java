package com.example.LoginSignup;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginSignupRepository extends JpaRepository<LoginSignupEntity, String> {
}
