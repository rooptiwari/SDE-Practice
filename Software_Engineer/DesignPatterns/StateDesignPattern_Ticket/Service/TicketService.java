package Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.Service;

import Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.DTO.Ticket;
import Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.DTO.User;
import Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.State.Analysis;
import Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.State.Done;
import Software_Engineer.DesignPatterns.StateDesignPattern_Ticket.State.Review;

import java.util.concurrent.locks.ReentrantLock;

public class TicketService {
    ReentrantLock lock = new ReentrantLock();
    public Ticket createTicket(String description, User createdBy) {
        return new Ticket(description, createdBy);
    }


    public void startAnaylsis(User user,Ticket ticket){
        boolean isFesiable = ticket.getTicketState().StartAnslysis(user,ticket);
        if(isFesiable){
            lock.lock();
            if(ticket.getTicketState().StartAnslysis(user,ticket)){
                ticket.setTicketState(new Analysis());
            }
        }
    }

    public void startReviewing(User user,Ticket ticket){
        boolean isFesiable = ticket.getTicketState().StartReview(user,ticket);
        if(isFesiable){
            ticket.setTicketState(new Review());
        }
    }

    public void markDone(User user,Ticket ticket){
        boolean isFesiable = ticket.getTicketState().MarkDone(user,ticket);
        if(isFesiable){
            ticket.setTicketState(new Done());
        }
    }


//    public void changeState(Ticket ticket, TicketStates newState) {
//        TicketStates oldstate = ticket.getTicketState();
//
//
//        if (oldstate.equals(TicketStates.ANALYSIS)) {
//            if (newState.equals(TicketStates.REVIEW)) {
//                System.out.println(ticket.getTicketState() + " move to Review");
//            } else if (newState.equals(TicketStates.DONE)) {
//                System.out.println(ticket.getTicketState() + " move to Done");
//            } else if (newState.equals(TicketStates.ANALYSIS)) {
//                System.out.println("What are you doing ?");
//            }
//        } else if (oldstate.equals(TicketStates.REVIEW)) {
//            if (newState.equals(TicketStates.REVIEW)) {
//                System.out.println("What are you doing ?");
//            } else if (newState.equals(TicketStates.DONE)) {
//                System.out.println(ticket.getTicketState() + " move to Done");
//            } else if (newState.equals(TicketStates.ANALYSIS)) {
//                System.out.println("What are you doing ?");
//            }
//        } else if (oldstate.equals(TicketStates.DONE)) {
//            if (newState.equals(TicketStates.REVIEW)) {
//                System.out.println(ticket.getTicketState() + " move to Review");
//            } else if (newState.equals(TicketStates.DONE)) {
//                System.out.println("What are you doing ?");
//            } else if (newState.equals(TicketStates.ANALYSIS)) {
//                System.out.println(ticket.getTicketState() + " move to Analysis");
//            }
//        }
//    }
}