package MusicBand;

public class CalendarExample {
    private static CalendarExample INSTANCE;
    private int counter = 0;

    private CalendarExample() {}

    public void incrementCounter() {
        counter++;
    }

    @Override
    public String toString() {
        return "Counter: " + counter;
    }

    public static CalendarExample getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CalendarExample();
        }

        return INSTANCE;
    }
}

class Example {
    public static void main(String[] args) {
        CalendarExample.getInstance().incrementCounter();

        // .,.

        CalendarExample.getInstance().incrementCounter();


        System.out.println(CalendarExample.getInstance().toString());
    }
}