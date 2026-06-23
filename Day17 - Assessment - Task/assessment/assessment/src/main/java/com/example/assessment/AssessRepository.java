package com.example.assessment;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessRepository extends JpaRepository<AssessEntity, Long> {
}
