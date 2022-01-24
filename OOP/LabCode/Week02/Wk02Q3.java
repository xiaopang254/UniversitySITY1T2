public class Wk02Q3 {
    public static void main(String[] args) {

        // Unix time stamp
        long unixTime = System.currentTimeMillis() / 1000L;

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = System.currentTimeMillis() / 1000;
        long currentTotalSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentTotalMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentTotalHours = totalHours % 24 + 8; // GMT + 8

        System.out.println(
                "Current time is " + currentTotalHours + ":" + currentTotalMinutes + ":" + currentTotalSeconds
                        + " GMT+8");

    }

}
