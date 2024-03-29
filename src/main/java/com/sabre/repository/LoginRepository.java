package com.sabre.repository;

import com.sabre.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
    
    public Login findByUsername(String username);

}
