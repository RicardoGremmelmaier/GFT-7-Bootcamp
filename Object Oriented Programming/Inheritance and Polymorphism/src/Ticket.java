public sealed class Ticket permits HalfTicket, FamilyTicket {
    private double price;
    private String movieName;
    private Boolean isDub;

    public Ticket(double price, String movieName, Boolean isDub) {
        this.price = price;
        this.movieName = movieName;
        this.isDub = isDub;
    }

    public double getPrice(){
        return price;
    }

    public String getMovieName() {
        return movieName;
    }

    public Boolean getIsDub() {
        return isDub;
    }

}
