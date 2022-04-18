package com.example.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.models.UserSignup;

public interface UserRepo extends JpaRepository<UserSignup, Integer>{
	UserSignup findByEmail(String email);
}
