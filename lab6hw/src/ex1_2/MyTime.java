package ex1_2;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 24 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        StringBuilder timeStr = new StringBuilder();
        if (hour < 10) {
            timeStr.append(0);
        }
        timeStr.append(hour).append(':');
        if (minute < 10) {
            timeStr.append(0);
        }
        timeStr.append(minute).append(':');
        if (second < 10) {
            timeStr.append(0);
        }
        timeStr.append(second);
        return timeStr.toString();
    }

    public MyTime nextSecond() {
        if (second != 59) {
            second++;
        } else {
            second = 0;
            if (minute != 59) {
                minute++;
            } else {
                minute = 0;
                if (hour != 23) {
                    hour++;
                } else {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public MyTime nextMinute() {
        if (minute != 59) {
            minute++;
        } else {
            minute = 0;
            if (hour != 23) {
                hour++;
            } else {
                hour = 0;
            }
        }
        return this;
    }

    public MyTime nextHour() {
        if (hour != 23) {
            hour++;
        } else {
            hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        if (second != 0) {
            second--;
        } else {
            second = 59;
            if (minute != 0) {
                minute--;
            } else {
                minute = 59;
                if (hour != 0) {
                    hour--;
                } else {
                    hour = 23;
                }
            }
        }
        return this;
    }

    public MyTime previousMinute() {
        if (minute != 0) {
            minute--;
        } else {
            minute = 59;
            if (hour != 0) {
                hour--;
            } else {
                hour = 23;
            }
        }
        return this;
    }

    public MyTime previousHour() {
        if (hour != 0) {
            hour--;
        } else {
            hour = 23;
        }
        return this;
    }
}
