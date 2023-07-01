package org.example.task_1;

import java.util.Scanner;

public class MyProgram {
    /*Мальчик хочет написать на заборе признание в любви девочке из 15 букв и 3 пробелов.
      На каждые 3 буквы мальчик тратит по 62 см длины забора, а на каждый пробел - 12 см. Напишите программу,
      которая поможет по длине забора (введенной пользователем) выяснить, поместится ли на забор такой длины надпись мальчика
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int threeLetters, oneSpace, messageLength;
        threeLetters = 62;
        oneSpace = 12;
        messageLength = threeLetters * 5 + oneSpace * 3;

        while (true) {
            printHelp();
            String fenceLength = scanner.nextLine();
            if (fenceLength.equalsIgnoreCase("help")) {
                printHelp();
            }

            int lenFence = Integer.parseInt(fenceLength);
            if (lenFence >= messageLength) {
                System.out.println("Good! The inscription will fit on the fence, length " + lenFence);
            } else {
                System.out.println("Ups... The inscription will not fit on the fence, length " + lenFence);
            }
            if (fenceLength.equalsIgnoreCase("quit")) {
                System.exit(0);
            }
        }
    }
    private static void printHelp() {
        System.out.println("Type 'quit' to exit the program");
        System.out.println("Enter fence length in cm: ");
    }
}
