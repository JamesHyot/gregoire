/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createusers.fixtures;

import createusers.application.*;

/**
 *
 * @author james
 */
public class RemoveUserFromSystem {
    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public RemoveUserFromSystem(String login) {
        this.login = login;
        UserSystem.getMyUserSystem().removeUserFromList(this.login);
    }

}
