/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Salim El Moussaoui <salim.elmoussaoui.afpa2017@gmail.com>
 */
public class Function {
    private int id;
    private String definition;

    public Function(int id, String definition) {
        this.id = id;
        this.definition = definition;
    }

    public int getId() {
        return id;
    }

    public String getDefinition() {
        return definition;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDefinition(String definition) {
        this.definition = definition;
    }
    
    
    
}
