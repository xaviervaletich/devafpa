/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Flight;

/**
 *
 * @author Salim El Moussaoui <salim.elmoussaoui.afpa2017@gmail.com>
 */
public class FlightDAO extends DAO<Flight, Integer> {
    
    public FlightDAO() {
        super();
    }
    
    @Override
    public Flight create(Flight flight) {
        
        Flight flightCreate = new Flight();
        if (this.bddmanager.connect()) {
            
            try {

                // create requete 
                String requete = "INSERT INTO flights ( "+
                        "departing_aita,\n" +
                        " arrival_aita,\n" +
                        " departing_hour,\n" +
                        " duration,\n" +
                        " price,\n" +
                        " id_pilot,\n" +
                        " id_copilot,\n" +
                        " id_staff1,\n" +
                        " id_staff2,\n" +
                        " id_staff3,\n" +
                        " planned"
                        + ") VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                // prepared requete 
                PreparedStatement pst = this.bddmanager.getConnectionManager().prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);
                // insert value in requete
                pst.setString(1, flight.getDeparting_aita());
                pst.setString(2, flight.getArrival_aita());
                pst.setString(3, flight.getDeparting_hour());
                pst.setInt(4, flight.getDuration());
                pst.setDouble(5, flight.getPrice());
                pst.setInt(6, flight.getId_pilot());
                pst.setInt(7, flight.getId_copilot());
                pst.setInt(8, flight.getId_staff1());
                pst.setInt(9, flight.getId_staff2());
                pst.setInt(10, flight.getId_staff3());
                pst.setBoolean(11, flight.getPlanned());
                 
                // excute insert row in table
                int insert = pst.executeUpdate();
                // if insert in table 
                if (insert != 0) {
                  
                    ResultSet id_increment = pst.getGeneratedKeys();
                    
                    if (id_increment.next()) {
                        flight.setId(id_increment.getInt(1));
                        flightCreate = flight;                        
                    }
                    
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                return flightCreate;
            }
            
        } else {
            return flightCreate;
        }
        
        return flightCreate;
    }
    
    @Override
    public boolean update(Flight flight) {
        boolean success = false;
        
        if (this.bddmanager.connect()) {
            
            try {

                // create requete 
                String requete = "Update flights set departing_aita = ?,\n"
                        + "arrival_aita = ?,\n"
                        + "departing_hour = ?,\n"
                        + "duration = ?,\n"
                        + "price = ?,\n"
                        + "id_pilot = ?,\n"
                        + "id_copilot = ?,\n"
                        + "id_staff1 = ?,\n"
                        + "id_staff2 = ?,\n"
                        + "id_staff3 = ?,\n"
                        + "planned = ? WHERE id = ?";
                // prepared requete 
                PreparedStatement pst = this.bddmanager.getConnectionManager().prepareStatement(requete);
                // insert value in requete
                pst.setString(1, flight.getDeparting_aita());
                pst.setString(2, flight.getArrival_aita());
                pst.setString(3, flight.getDeparting_hour());
                pst.setInt(4, flight.getDuration());
                pst.setDouble(5, flight.getPrice());
                pst.setInt(6, flight.getId_pilot());
                pst.setInt(7, flight.getId_copilot());
                pst.setInt(8, flight.getId_staff1());
                pst.setInt(9, flight.getId_staff2());
                pst.setInt(10, flight.getId_staff3());
                pst.setBoolean(11, flight.getPlanned());
                pst.setInt(12, flight.getId());
                // excute update row in table
                int insert = pst.executeUpdate();
                // if insert in table 
                if (insert != 0) {
                    success = true;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                return success;
            }
            
        } else {
            return success;
        }
        return success;
    }
    
    @Override
    public boolean delete(Integer primary_key) {
        boolean success = false;
        
        if (this.bddmanager.connect()) {
            
            try {

                // create requete 
                String requete = "DELETE FROM flights WHERE id = ?";
                // prepared requete 
                PreparedStatement pst = this.bddmanager.getConnectionManager().prepareStatement(requete);
                // insert value in requete
                pst.setInt(1, primary_key);
                // excute delete row in table
                int insert = pst.executeUpdate();
                // if insert in table 
                if (insert != 0) {
                    success = true;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                return success;
            }
            
        } else {
            return success;
        }
        return success;
        
    }
    
    @Override
    public ArrayList getAll() {
        ArrayList<Flight> listFlight = new ArrayList<>();
        if (this.bddmanager.connect()) {
            
            try {
                Statement st = this.bddmanager
                        .getConnectionManager()
                        .createStatement();
                String requete = "SELECT * FROM flights";
                ResultSet rs = st.executeQuery(requete);
                
                while (rs.next()) {
                    Flight el = new Flight(
                        rs.getInt( "id" ),   
                        rs.getString( "departing_aita" ),
                        rs.getString( "Arrival_aita" ),
                        rs.getString( "departing_hour" ),
                        rs.getInt( "duration" ),
                        rs.getDouble( "price" ),
                        rs.getInt( "id_pilot" ),
                        rs.getInt( "id_copilot" ),
                        rs.getInt( "id_staff1" ),
                        rs.getInt( "id_staff2" ),
                        rs.getInt( "id_staff3" ),
                        rs.getBoolean("planned" )
                    );
                    listFlight.add(el);
                    
                }
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                return listFlight;
            }
            
        } else {
            return listFlight;
        }
        
        return listFlight;
    }
    
    @Override
    public Flight find(Integer primary_key) {
        Flight flight = new Flight();
        if (this.bddmanager.connect()) {
            
            try {
                Statement st = this.bddmanager.getConnectionManager().createStatement();
                String requete = "SELECT * FROM flights WHERE id = " + primary_key ;
                ResultSet rs = st.executeQuery(requete);
                if (rs.next()) {
                    flight.setId(rs.getInt( "id" ) );   
                    flight.setDeparting_aita(rs.getString( "departing_aita" ) );
                    flight.setArrival_aita(rs.getString( "Arrival_aita" ) );
                    flight.setDeparting_hour(rs.getString( "departing_hour" ) );
                    flight.setDuration(rs.getInt( "duration" ) );
                    flight.setPrice(rs.getDouble( "price" ) );
                    flight.setId_pilot(rs.getInt( "id_pilot" ) );
                    flight.setId_copilot(rs.getInt( "id_copilot" ) );
                    flight.setId_staff1(rs.getInt( "id_staff1" ) );
                    flight.setId_staff2( rs.getInt( "id_staff2" ) );
                    flight.setId_staff3( rs.getInt( "id_staff3" ) );
                    flight.setPlanned(rs.getBoolean("planned" ) );
                }
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                return flight;
            }
            
        } else {
            return flight;
        }
        
        return flight;
    }

    /**
     * il verifie si l'object flight est rempli ou vide
     *
     * @param flight
     * @return false is empty and true is full
     */
    public boolean isValid(Flight flight) {
        boolean isValid = true;

        // if code aita is empty or null
        if (flight.getId() == 0) {
            isValid = false;
        }
          
        return isValid;        
    }


    
}
