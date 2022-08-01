package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
     /*   PhonesManager phonesManager = new PhonesManager();

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
                    System.out.println("5. Сортировать телефоны по возрастанию цены");
                    System.out.println("6. Сортировать телефоны по убыванию цены");
                    System.out.println("7. Узнать кол-во всех телефонов");
                    System.out.println("8. Узнать максимальную цену");
                    System.out.println("9. Узнать минимальную цену");
                    int switchPoint = Util.inputInt("Выбрать пункт: ", 0, 9);

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
                        case 5: {
                            phonesManager.sortPhonesForOver();
                        }
                        break;
                        case 6: {
                            phonesManager.sortPhonesForUnder();
                        }
                        break;
                        case 7: {
                            phonesManager.sumQantityPhones();
                        }
                        break;
                        case 8: {
                            phonesManager.maxPricePhone();
                        }
                        break;
                        case 9: {
                            phonesManager.minPricePhone();
                        }
                        break;
                    }
                }
            }


            // phones.add(phone);


            //  for (int i = 0; i < phones.size(); i++) {
            //   System.out.println(phones.get(i));
            // }
        }
    }

8/
      */
        System.out.println(proverka("(ABC)+[2]-{11}"));  // - true
        System.out.println(proverka("(ABC)+[2-{11}")); // - false
        System.out.println(proverka("(ABC])+[2]-{11}")); // - false
        System.out.println(proverka("(ABC)+[2]-{11")); // - false
    }

    private static boolean proverka(String input) {
        Map<Character, Character> skobki = new HashMap<>();
        skobki.put(')', '(');
        skobki.put('}', '{');
        skobki.put(']', '[');

        Deque<Character> stack = new LinkedList<>();
        for (char c : input.toCharArray()) {
            if (skobki.containsValue(c)) {
                stack.push(c);
            } else if (skobki.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != skobki.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }

    public void printlnProveka() {

    }


}
