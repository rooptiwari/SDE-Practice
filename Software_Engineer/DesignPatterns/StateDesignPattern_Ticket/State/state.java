package Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.State;

import Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.DTO.Ticket;
import Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.DTO.User;

public interface state {
    boolean StartAnslysis(User user, Ticket ticket);
    boolean StartReview(User user, Ticket ticket);
    boolean MarkDone(User user, Ticket ticket);

}
