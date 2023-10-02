package isp.lab4.exercise4;

public class UserApp {
    private Ticket ticket = null;

    public void buyTicket(){
        this.ticket = new TicketsManager().generateTicket();
        System.out.println("Ticket bought.");
    }
    public void viewTicket() {
        if(this.ticket != null)
            System.out.println("Your ticket ID is: " + ticket.getID());
        else System.out.println("There is no ticket.");
    }
    public Ticket getTicket() {
        return ticket;
    }
}
