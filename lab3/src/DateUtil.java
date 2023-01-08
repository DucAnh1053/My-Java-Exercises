public class DateUtil {
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
        int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        if (month < 3)
            year--;
        return (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;
    }

    public static String toString(int year, int month, int day) {
        String[] calenderDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        String[] strMonths = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        return calenderDays[getDayOfWeek(year, month, day)] + " " + day + " " + strMonths[month - 1] + " " + year;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));
        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));
        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2012, 2, 17));
        System.out.println(toString(2012, 2, 14));
    }
}
