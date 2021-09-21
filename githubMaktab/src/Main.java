import bank.MyDate;

public class Main {
    public static void main(String[] args) {
        MyDate myDate= new MyDate(1400,12,28);
        System.out.println(myDate.isValidDate(1400,12,28));
        System.out.println(myDate.getMonthLastDay(11));
        System.out.println(myDate.toString());
    }
}
