public non-sealed class HalfTicket extends Ticket{
    public HalfTicket(double price, String movieName, Boolean isDub) {
        super(price, movieName, isDub);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.5;
    }

}
