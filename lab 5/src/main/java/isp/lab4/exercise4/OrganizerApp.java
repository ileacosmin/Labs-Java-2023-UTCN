package isp.lab4.exercise4;

public class OrganizerApp {
    public boolean checkIn(UserApp user) {
        if (user.getTicket() == null) {
            System.out.println("There is no ticket.");
            return false;
        }
        else {
            new TicketsManager().validateTicket(user.getTicket());
            return true;
        }
    }
}
