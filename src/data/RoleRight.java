/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Salim El Moussaoui <salim.elmoussaoui.afpa2017@gmail.com>
 */
public class RoleRight {
    private int user_id;
    private boolean admin;
    private boolean blocked;

    public RoleRight(int user_id, boolean admin, boolean blocked) {
        this.user_id = user_id;
        this.admin = admin;
        this.blocked = blocked;
    }

    public int getUser_id() {
        return user_id;
    }

    public boolean isAdmin() {
        return admin;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
    
}
