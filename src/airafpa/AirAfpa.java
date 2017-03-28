/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airafpa;

import Controller.AirportControleur;
import View.NewAirport;
import dao.AirportDAO;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Salim El Moussaoui <salim.elmoussaoui.afpa2017@gmail.com>
 */
public class AirAfpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        
        AirportDAO airportDAO = new AirportDAO();
        AirportControleur airportController = new AirportControleur(airportDAO);
      NewAirport flightView =  new NewAirport(airportController);
      
      frame.setTitle("Airports");
        frame.setSize(1000, 691);
//        this.setMinimumSize(new Dimension(340, 480));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLocation(450, 110);
        
        frame.add(flightView);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    
    }
       
        
    
    
   
    
    
}
