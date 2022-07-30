package com.company;

import com.company.Phone;
import com.company.PhonesManager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        PhonesManager phonesManager = new PhonesManager();

        //ArrayList<Phone> phones = new ArrayList<>();
        while (true) {
            System.out.println("Программа добавления/удаления товара. Выбрать пункт: ");
            System.out.println("1: Phones");
            System.out.println("2: ");
            System.out.println("3: ");
            System.out.println("4: ");
            System.out.println("5: ");
            int menuPoint = Util.inputInt("Ввести номер нужного пункта:", 1, 5);

            switch (menuPoint) {

                case 1: {
                    System.out.println("0. Выход из программы");
                    System.out.println("1. Добавить телефон");
                    System.out.println("2: Вывести список телефонов");
                    System.out.println("3: Сохранить список в файл");
                    System.out.println("4: Загрузить список из файла");
                    int switchPoint = Util.inputInt("Выбрать пункт: ", 0, 4);

                    switch (switchPoint) {
                        case 0: {
                            System.exit(0);
                        }
                        break;
                        case 1: {
                            String model = Util.inputString("Введите модель телефона: ");
                            int price = Util.inputInt("Введите цену телефона:", 1, 1000000);
                            int quantity = Util.inputInt("Введите кол-во добавляемых телефонов: ", 1, 500);
                            Phone phone = new Phone(model, price, quantity);
                            phonesManager.addPhone(phone);

                            System.out.println("Телефон добавлен успешно!");
                        }
                        break;
                        case 2: {
                            for (int i = 0; i < phonesManager.getSize(); i++) {
                                System.out.println(phonesManager.getPhone(i));
                            }
                        }
                        break;
                        case 3: {
                          phonesManager.savePhonesToTxtFile("Phones.txt");
                        }
                        break;
                        case 4: {
                           phonesManager.loadPhonesFromTxtFile("Phones.txt");
                        }
                        break;
                    }
                }
            }
        }


        // phones.add(phone);


        //  for (int i = 0; i < phones.size(); i++) {
        //   System.out.println(phones.get(i));
        // }
    }
}


