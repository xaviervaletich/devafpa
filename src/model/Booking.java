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
public class Booking {
    private int id;
    private int user_id;
    private int flight_id;
    private int place;

    public Booking(int id, int user_id, int flight_id, int place) {
        this.id = id;
        this.user_id = user_id;
        this.flight_id = flight_id;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getFlight_id() {
        return flight_id;
    }

    public int getPlace() {
        return place;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    public void setPlace(int place) {
        this.place = place;
    }
    
    
    
}
