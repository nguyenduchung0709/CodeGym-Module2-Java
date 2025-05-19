import java.util.Random;

public class RunStopWatch {
    public static void main(String[] args) {
        int size = 100000;
        int[] array = new int[size];

        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(size);
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minIndex) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        stopWatch.stop();

        System.out.println("Thời gian làm thuật toán(milisecond): " + stopWatch.getElapsedTime());
    }
}
