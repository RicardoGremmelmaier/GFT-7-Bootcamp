public abstract sealed class Clock permits AmericanClock, BrazilianClock {
    protected int hour;
    protected int minute;
    protected int second;

    public Clock(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            System.out.println("Invalid time provided");
            return;
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            System.out.println("Invalid hour provided");
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            System.out.println("Invalid minute provided");
            return;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            System.out.println("Invalid second provided");
            return;
        }
        this.second = second;
    }

    public String getTime() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public abstract void convertFormat(Clock clock);

}
