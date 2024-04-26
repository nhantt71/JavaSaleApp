/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttn.repositories;

import com.ttn.pojo.User;
import java.util.List;
import javax.persistence.metamodel.SingularAttribute;

/**
 *
 * @author Win11
 */
public interface UserRepository {
    User getUserByUsername(String username);
    void addUser(User user);

    public List<User> getUsers(SingularAttribute<User, String> username);
}
