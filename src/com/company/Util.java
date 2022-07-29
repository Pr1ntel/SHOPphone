package com.company;

import java.util.Random;
import java.util.Scanner;

public class Util {



        static int inputInt(String message, int min, int max) {

            boolean isValidInput;
            int output = 0;
            do {
                try {
                    isValidInput = true;
                    Scanner scanner = new Scanner(System.in);

                    System.out.print(message);
                    output = scanner.nextInt();

                    if (output < min || output > max) {
                        System.out.println("Ошибка ввода. Вы вышли за границы диапазона от " + min + " до " + max);
                        throw new Exception();
                    }

                } catch (Exception e) {
                    isValidInput = false;
                    System.out.println("Ошибка ввода. Пожалуйста повторите ввод");
                }

            } while (isValidInput == false);

            return output;
        }

        static String inputString(String message) {
            boolean isValidInput;
            String output = "";
            do {
                try {
                    isValidInput = true;
                    Scanner scanner = new Scanner(System.in);

                    System.out.print(message);
                    output = scanner.nextLine();
                } catch (Exception e) {
                    isValidInput = false;
                    System.out.println("Ошибка ввода. Пожалуйста повторите ввод");
                }

            } while (isValidInput == false);

            return output;
        }

        public static int randNum() {
            Random random = new Random();
            int min = 1;
            int max = 2;
            int randNumber = random.nextInt((max - min) + 1) + min;
            return randNumber;
        }
    }

