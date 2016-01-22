/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createusers.fixtures;
import createusers.application.*;
import java.util.Objects;
 
/**
 *
 * @author james
 */
public class AddUserToSystem {
    private String login;
    private String passwd;
    private boolean active;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int id() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.login);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AddUserToSystem other = (AddUserToSystem) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.passwd, other.passwd)) {
            return false;
        }
        if (this.active != other.active) {
            return false;
        }
        return true;
    }
    
    public boolean cree(){
       boolean bool = UserSystem.getMyUserSystem().addUserToList(this.login,this.passwd,this.active);
       return bool;
    }
}
