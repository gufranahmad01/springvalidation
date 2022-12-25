package com.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entities.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

}
