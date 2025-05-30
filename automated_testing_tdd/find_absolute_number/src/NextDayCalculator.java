public class NextDayCalculator {

    public static String findNextDay(int day, int month, int year) {
        boolean errorRange = day < 1 || month < 1 || month > 12 || year < 1;
        if (errorRange) {
            throw new IllegalArgumentException("Invalid date input");
        }

        int maxDay = getDaysInMonth(month, year);

        int nextDay = day + 1;
        int nextMonth = month;
        int nextYear = year;

        if (nextDay > maxDay) {
            nextDay = 1;
            nextMonth++;
            if (nextMonth > 12) {
                nextMonth = 1;
                nextYear++;
            }
        }
        return nextDay + "/" + nextMonth + "/" + nextYear;
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        boolean isDivisionBy4 = year % 4 == 0;
        boolean notDivisionBy100 = year % 100 != 0;
        boolean isDivisionBy400 = year % 400 == 0;
        return (isDivisionBy4 && notDivisionBy100) || isDivisionBy400;
    }


}
