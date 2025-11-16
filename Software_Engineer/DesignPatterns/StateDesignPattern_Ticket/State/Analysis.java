package Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.State;

import Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.DTO.Ticket;
import Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.DTO.User;

public class Analysis implements state{

    @Override
    public boolean StartAnslysis(User user, Ticket ticket) {
        System.out.println("What are you doing");
        return false;
    }

    @Override
    public boolean StartReview(User user, Ticket ticket) {
        System.out.println("Move to Review");
        return true;
    }

    @Override
    public boolean MarkDone(User user, Ticket ticket) {
        System.out.println("congratulation Ticket is Done");

        return true;
    }
}
