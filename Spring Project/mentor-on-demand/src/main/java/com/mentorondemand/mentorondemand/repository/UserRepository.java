package com.mentorondemand.mentorondemand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mentorondemand.mentorondemand.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
