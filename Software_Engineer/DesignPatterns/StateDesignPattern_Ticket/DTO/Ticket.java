package Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.DTO;

import Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.State.Analysis;
import Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.State.state;

public class Ticket {
    private String description;
    private User createdBy;
    private state ticketState;

    public Ticket(String description, User createdBy){
        this.description =description;
        this.createdBy = createdBy;
        this.ticketState = new Analysis();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public state getTicketState() {
        return ticketState;
    }

    public void setTicketState(state ticketState) {
        this.ticketState = ticketState;
    }
}
