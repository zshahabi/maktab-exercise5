public class MyDate {
    private int month;
    private int year;
    private int day;

    // private  MyDate myDate;
    public MyDate(int year, int month, int day) {
        this.month = month;
        this.year = year;
        this.day = day;
        //  myDate= new MyDate(month,year,day);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) {
            return false;
        }
        //month between 1-12
        if (month < 1 || month > 12) {
            return false;
        }
        //totalDay=30 or 31
        int totalDay = getMonthLastDay(month);
        //if day not between 1-31
        if (day < 1 || day > totalDay) {
            return false;
        }
        return true;
    }
//return last day of month
    public int getMonthLastDay(int month) {
        if (month >= 1 && month <= 6) {
            return 31;
        }
        return 30;
    }
}

