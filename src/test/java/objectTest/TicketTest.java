package objectTest;

import objects.Ticket;
import org.junit.jupiter.api.Test;

public class TicketTest {

    @Test
    public void Ticket(){

        Ticket ticket=new Ticket();

        ticket.movieName="Kalki";
        ticket.TheatreName="arjun";
        ticket.hallNumber=2;
        ticket.seatNumber="A-40";
        ticket.TicketCost=200;
        ticket.showTime="10 pm";
        ticket.showDate=12/7/24;
        ticket.Address="KPHB";


        System.out.println("movieName:"+ticket.movieName);
        System.out.println("TheatreName:"+ticket.TheatreName);
        System.out.println("hallNumber:"+ticket.hallNumber);
        System.out.println("seatNumber:"+ticket.seatNumber);
        System.out.println("TicketCost:"+ticket.TicketCost);
        System.out.println("showTime:"+ticket.showTime);
        System.out.println("shoeDate:"+ticket.showDate);
        System.out.println("Address:"+ticket.Address);

    }
}
