package org.example.task_2;

import java.time.LocalDate;

public class NextWateringDate {
    private final LocalDate lastWateringDate;
    private final int humidity = 30;
    private final Detector detector = new Detector();

    public NextWateringDate(LocalDate lastWateringDate) {
        this.lastWateringDate = lastWateringDate;
    }

    public LocalDate getNextWatering() {
        int month = lastWateringDate.getMonthValue();

        if (month == 12 || month == 1 || month == 2 ) {
            LocalDate last = lastWateringDate.plusMonths(1);
            System.out.println("Полить через месяц: " + last);
            return last;
        }
        if (month > 5 && month < 9) {
            if (this.detector.detectorGenerator() >= this.humidity) {
                LocalDate last = lastWateringDate.plusDays(2);
                System.out.println("Полить через 2 дня: " + last);
                return last;
            } else {
                LocalDate last = lastWateringDate;
                System.out.println("Полить сейчас: " + last);
                return last;
            }
        }
        LocalDate last = lastWateringDate.plusWeeks(1);
        System.out.println("Полить через 1 неделю: " + last);
        return last;
    }

}
