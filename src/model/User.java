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
public class User {

    private long id;
    private String firstname;
    private String lastname;
    private String adress;
    private String city;
    private String country;
    private String tel;
    private String mail;
    private int function;

    public User(long id, String firstname, String lastname, String adress, String city, String country, String tel, String mail, int function) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.adress = adress;
        this.city = city;
        this.country = country;
        this.tel = tel;
        this.mail = mail;
        this.function = function;
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAdress() {
        return adress;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getTel() {
        return tel;
    }

    public String getMail() {
        return mail;
    }

    public int getFunction() {
        return function;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setFunction(int function) {
        this.function = function;
    }
    
    
    
}
