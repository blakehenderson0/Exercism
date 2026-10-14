import java.util.Arrays;
import java.util.stream.IntStream;

class BirdWatcher {
    private final int[] birdsPerDay;
    private static int[] birdsPerDayV2 = new int[] {0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return birdsPerDayV2;
    }

    public int getToday() {
        int birdsToday = birdsPerDay[6];
        return birdsToday;

    }

    public void incrementTodaysCount() {
        birdsPerDay[6]++;
    }

    public boolean hasDayWithoutBirds() {
        Arrays.sort(birdsPerDay);
        return birdsPerDay[0] == 0;
    }

    public int getCountForFirstDays(int numberOfDays) {

        int sum = 0;

        if (numberOfDays <= birdsPerDay.length) {
            for (int i = 0; i < numberOfDays; i++) {
                sum += (birdsPerDay[i]);
            }
        } else {
            sum = IntStream.of(birdsPerDay).sum();
        }

        return sum;
    }

    public int getBusyDays() {
        int[] counts = birdsPerDay;

        return Math.toIntExact(IntStream.of(counts).filter(n -> n >= 5).count());


    }

}
