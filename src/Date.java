public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
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

    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    public static void main(String[] args) {
        // Create a Date object with an initial date
        Date date = new Date(4, 10, 2023);

        System.out.println("Original Date: " + date.toString());
        date.setDay(15);
        date.setMonth(11);
        date.setYear(2023);
        System.out.println("Updated Date: " + date.toString());
    }
}
