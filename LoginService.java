/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.orient.course.service;

import az.orient.course.model.Login;
import az.orient.course.model.Role;
import java.util.List;

/**
 *
 * @author Ideas.az
 */
public interface LoginService {

    Login login(String username, String password) throws Exception;

    boolean registration(Login login) throws Exception;
    
    List<Role> getRoleList() throws Exception; 

}
