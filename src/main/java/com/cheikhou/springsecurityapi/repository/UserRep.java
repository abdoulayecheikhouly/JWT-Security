package com.cheikhou.springsecurityapi.repository;

import com.cheikhou.springsecurityapi.entity.Role;
import com.cheikhou.springsecurityapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRep  extends JpaRepository<User, Long> {

   // Role findByRole(String role);

    User findByUsername(String username);
}
