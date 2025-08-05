public non-sealed class AmericanClock extends Clock {
    private Boolean isAM;

    public AmericanClock(int hour, int minute, int second) {
        super(hour, minute, second);
        this.isAM = hour < 12;
    }

    @Override
    public String getTime() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond()) + (isAM ? " AM" : " PM");
    }

    @Override
    public void convertFormat(Clock clock) {
        if (clock.getHour() > 12) {
            clock.setHour(clock.getHour() - 12);
            isAM = false;
            return;
        }
        isAM = true;
    }
}
