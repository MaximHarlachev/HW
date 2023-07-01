package org.example.task_2;

import java.util.Random;

public class Detector {

    public int detectorGenerator() {
        Random random = new Random();
        int humidity = random.nextInt(101);
        System.out.println("Влажность воздуха: " + humidity);
        return humidity;
    }
}
