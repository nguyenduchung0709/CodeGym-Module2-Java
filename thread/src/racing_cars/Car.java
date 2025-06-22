package racing_cars;

import java.util.Random;

public class Car implements Runnable {
    private String nameCar;
    private final int DISTANCE = 100;
    private final int STEP = 5;

    public Car(String nameCar) {
        this.nameCar = nameCar;
    }

    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();

        while (runDistance < DISTANCE) {
            try {
                int speed = new Random().nextInt(20) + 1;
                runDistance += speed;

                String log = "|";
                int percentTravelled = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravelled >= i + STEP) {
                        log += "=";
                    } else if (percentTravelled >= i && percentTravelled < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.nameCar + ": " + log + " " + Math.min(DISTANCE, runDistance) + " KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.nameCar + " was broken ");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.nameCar + " finish the race at: " + (endTime - startTime) / 1000 + "s");
    }

    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread threadA = new Thread(carA);
        Thread threadB = new Thread(carB);
        Thread threadC = new Thread(carC);

        System.out.println("DISTANCE: 100KM");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
