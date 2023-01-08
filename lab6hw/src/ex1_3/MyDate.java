package ex1_3;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static boolean isValidDate(int year, int month, int day) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return day > 0 && day <= 31;
            case 4, 6, 9, 11:
                return day > 0 && day <= 30;
            case 2:
                if (isLeapYear(year)) {
                    return day > 0 && day <= 29;
                } else {
                    return day > 0 && day <= 28;
                }
            default:
                return false;
        }
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 3) year--;
        return (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;
    }

    public static int getMaxDay(int year, int month) {
        if (month != 2) {
            return DAYS_IN_MONTHS[month - 1];
        } else {
            if (isLeapYear(year)) {
                return DAYS_IN_MONTHS[1] + 1;
            } else {
                return DAYS_IN_MONTHS[1];
            }
        }
    }

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0 && year < 10000) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 0) {
            throw new IllegalArgumentException("Invalid day!");
        }
        if (day <= getMaxDay(year, month)) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day!");
        }
    }

    @Override
    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        if (day != getMaxDay(year, month)) {
            day++;
        } else {
            day = 1;
            if (month != 12) {
                month++;
            } else {
                month = 1;
                if (year != 9999) {
                    year++;
                } else {
                    throw new IllegalStateException("Year out of range!");
                }
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month != 12) {
            month++;
        } else {
            month = 1;
            if (year != 9999) {
                year++;
            } else {
                throw new IllegalStateException("Year out of range!");
            }
        }
        return this;
    }

    public MyDate nextYear() {
        if (year != 9999) {
            year++;
        } else {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    public MyDate previousDay() {
        if (day != 1) {
            day--;
        } else {
            if (month != 1) {
                month--;
            } else {
                month = 12;
                if (year != 1) {
                    year--;
                } else {
                    throw new IllegalStateException("Year out of range!");
                }
            }
            day = getMaxDay(year, month);
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month != 1) {
            month--;
        } else {
            month = 12;
            if (year != 1) {
                year--;
            } else {
                throw new IllegalStateException("Year out of range!");
            }
        }
        int maxDay = getMaxDay(year, month);
        if (day > maxDay) {
            this.day = maxDay;
        }
        return this;
    }

    public MyDate previousYear() {
        if (year != 1) {
            year--;
        } else {
            throw new IllegalStateException("Year out of range!");
        }
        int maxDay = getMaxDay(year, month);
        if (day > maxDay) {
            this.day = maxDay;
        }
        return this;
    }
}
