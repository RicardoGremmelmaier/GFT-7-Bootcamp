public non-sealed class BrazilianClock extends Clock {
    public BrazilianClock(int hour, int minute, int second) {
        super(hour, minute, second);
    }

    @Override
    public String getTime() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    @Override
    public void convertFormat(Clock clock) {
        return;
    }

}
