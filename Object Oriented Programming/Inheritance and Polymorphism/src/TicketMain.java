public class TicketMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Ticket Booking System!");
        System.out.println("=========================================");
        Ticket ticket = new Ticket(100, "Avengers", true);
        System.out.println("Movie Name: " + ticket.getMovieName());
        System.out.println("Ticket Price: " + ticket.getPrice());
        System.out.println("Is Dubbed: " + ticket.getIsDub());
        System.out.println(ticket instanceof Ticket ? "This is a Ticket" : "This is not a Ticket");
        System.out.println("=========================================");
        
        Ticket familyTicket = new FamilyTicket(100, "Avengers", true, 4);
        System.out.println("Movie Name: " + familyTicket.getMovieName());
        System.out.println("Number of People: " + ((FamilyTicket) familyTicket).getNumberOfPeople());
        System.out.println("Family Ticket Price: " + familyTicket.getPrice());
        System.out.println("Is Dubbed: " + familyTicket.getIsDub());
        System.out.println(familyTicket instanceof FamilyTicket ? "This is a Family Ticket" : "This is not a Family Ticket");
        System.out.println("=========================================");

        Ticket halfTicket = new HalfTicket(100, "Avengers", true);
        System.out.println("Movie Name: " + halfTicket.getMovieName());
        System.out.println("Half Ticket Price: " + halfTicket.getPrice());
        System.out.println("Is Dubbed: " + halfTicket.getIsDub());
        System.out.println(halfTicket instanceof HalfTicket ? "This is a Half Ticket" : "This is not a Half Ticket");
        System.out.println("All tickets are instances of Ticket: " + 
            (ticket instanceof Ticket && familyTicket instanceof Ticket && halfTicket instanceof Ticket));
        System.out.println("=========================================");
    }
}
