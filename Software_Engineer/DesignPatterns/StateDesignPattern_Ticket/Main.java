package Software_Engineer.DesignPatterns.StateDesignPattern_Ticket;

import Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.DTO.Ticket;
import Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.DTO.User;
import Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.Service.TicketService;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("a" );
  //      Ticket ticket = new Ticket("first Ticket", u1);

        TicketService ticketService = new TicketService();
        Ticket t1 = ticketService.createTicket("Creatinf First Ticket", u1);

        ticketService.startAnaylsis(u1, t1);
        ticketService.startReviewing(u1,t1);
        ticketService.startReviewing(u1,t1);




//        ticketService.changeState(ticket,TicketStates.REVIEW);
    }
}
