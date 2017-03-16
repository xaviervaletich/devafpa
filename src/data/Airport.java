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
public class Airport {
    private String aita;
    private String city;
    private String country;

   public Airport() {
        this.aita = "";
        this.city = "";
        this.country = "";
    }
    public Airport(String aita, String city, String country) {
        this.aita = aita;
        this.city = city;
        this.country = country;
    }

    public String getAita() {
        return aita;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
    public void setAita(String aita) {
        this.aita = aita;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
    
}
