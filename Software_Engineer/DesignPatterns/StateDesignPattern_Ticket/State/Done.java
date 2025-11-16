package Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.State;

import Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.DTO.Ticket;
import Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.DTO.User;

public class Done implements state{

    @Override
    public boolean StartAnslysis(User user, Ticket ticket) {
        System.out.println("Ticket back to Analysis");
        return true;
    }

    @Override
    public boolean StartReview(User user, Ticket ticket) {
        System.out.println("Ticket Back to Review");
        return true;
    }

    @Override
    public boolean MarkDone(User user, Ticket ticket) {
        System.out.println("What are yyou doing");
        return false;
    }
}
