public non-sealed class FamilyTicket extends Ticket {
    private int numberOfPeople;

    public FamilyTicket(double price, String movieName, Boolean isDub, int numberOfPeople) {
        super(price, movieName, isDub);
        this.numberOfPeople = numberOfPeople;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * numberOfPeople * 0.95;
    }

}
