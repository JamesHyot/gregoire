/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createusers.application;

import java.util.Objects;

/**
 *
 * @author james
 */
public class User {
    private String login;
    private String passwd;
    private boolean active;
    private int id;

    public User(String login, String passwd, boolean active) {
        this.login = login;
        this.passwd = passwd;
        this.active = active;
        this.id = this.id();
    }
    
    public User(int id) {
        this.id = id;
    }

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
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.login);
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
        final User other = (User) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }


    
    
    
}
