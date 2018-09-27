/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class BookedFlight {
    private int flightNumber;
    private Fecha departure;
    private Fecha arrival;

    public BookedFlight(int flightNumber, Fecha departure, Fecha arrival) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Fecha getDeparture() {
        return departure;
    }

    public void setDeparture(Fecha departure) {
        this.departure = departure;
    }

    public Fecha getArrival() {
        return arrival;
    }

    public void setArrival(Fecha arrival) {
        this.arrival = arrival;
    }
    
    
}
