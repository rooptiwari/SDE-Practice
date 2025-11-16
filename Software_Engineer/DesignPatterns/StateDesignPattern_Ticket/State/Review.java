package Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.State;

import Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.DTO.Ticket;
import Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.DTO.User;

public class Review implements state{

    @Override
    public boolean StartAnslysis(User user, Ticket ticket) {
        System.out.println("transaction back to Analysis");
        return true;
    }

    @Override
    public boolean StartReview(User user, Ticket ticket) {
        System.out.println("What are you doing");
        return false;
    }

    @Override
    public boolean MarkDone(User user, Ticket ticket) {
        System.out.println("Congratulation Ticket is Done");
        return true;
    }
}
