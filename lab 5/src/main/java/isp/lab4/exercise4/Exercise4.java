package isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        UserApp user = new UserApp();
        OrganizerApp organizer = new OrganizerApp();
        user.viewTicket();
        organizer.checkIn(user);
        user.buyTicket();
        organizer.checkIn(user);
        user.buyTicket();
        organizer.checkIn(user);
        user.viewTicket();
    }
}
