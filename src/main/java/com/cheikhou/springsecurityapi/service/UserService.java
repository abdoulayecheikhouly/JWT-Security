package com.cheikhou.springsecurityapi.service;

import com.cheikhou.springsecurityapi.entity.Role;
import com.cheikhou.springsecurityapi.entity.User;

public interface UserService {

    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
}
