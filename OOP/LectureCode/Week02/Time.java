package LectureCode;

public class Time {
    private int hour, minute;

    public Time() {
        hour = 12;
        minute = 0;
    }

    public void addMinutes(int m) {
        int totalMinutes = ((60 * hour) + minute + m) % (24 * 60);

        if (totalMinutes < 0) {
            totalMinutes = totalMinutes + (24 * 60);

        }

        hour = totalMinutes / 60;
        minute = totalMinutes % 60;

    }

    public void setHour(int h) {
        hour = h;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int m) {
        minute = m;
    }

    public int getMinute() {
        return minute;
    }

    public void showTime() {
        System.out.println("Time is: " + hour + ":" + minute);
    }

}