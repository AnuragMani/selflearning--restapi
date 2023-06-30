package com.selflearning.selflearning.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selflearning.selflearning.restapi.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
