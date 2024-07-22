package com.ems.ems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.ems.ems.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
  UserDetails findByLogin(String login);
}