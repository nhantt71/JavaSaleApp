/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttn.services;

import com.ttn.pojo.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author Win11
 */
public interface UserService extends UserDetailsService{

    User getUserByUsername(String username);

    void addUser(User user);
}
