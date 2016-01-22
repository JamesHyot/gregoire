/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createusers.application;
import java.util.*;

/**
 *
 * @author james
 */
public class UserSystem {
    private List<User> userList;
    private static final UserSystem myUserSystem = new UserSystem();
    
    private UserSystem() {
        userList = new ArrayList<User>();
    }
    
    public static UserSystem getMyUserSystem() {
        return myUserSystem;
    }
    
    public boolean addUserToList(String login,String passwd,boolean active){
        User newUser = new User(login, passwd, active);
        if(userList.contains(newUser))
        {
            return false;
        }
        else{
            userList.add(newUser);
            return true;            
        }

    }
    
    public void removeUserFromList(String login){
        User newUser = new User(login, "foo", true);
        if(userList.contains(newUser))
        {
            userList.remove(newUser);
        }
        
    }
    
    public void removeUserById(int id){
        User newUser = new User(id);
        if(userList.contains(newUser))
        {
            userList.remove(newUser);
        }
        
    }
}