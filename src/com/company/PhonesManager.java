package com.company;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class PhonesManager {
    private ArrayList<Phone> phones;

    public PhonesManager() {
        phones = new ArrayList<>();
    }

    public PhonesManager(ArrayList<Phone> incomePhones) {
        phones = new ArrayList<>(incomePhones);
    }

    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    public int getSize() {
        return phones.size();
    }

    public Phone getPhone(int index) {
        return phones.get(index);
    }

    public void loadPhonesFromTxtFile(String fileName) throws Exception {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int listSize = Integer.parseInt(bufferedReader.readLine());

        phones = new ArrayList<>();

        for (int i = 0; i < listSize; i++) {
            String model = bufferedReader.readLine();
            int price = Integer.parseInt(bufferedReader.readLine());
            int quantity = Integer.parseInt(bufferedReader.readLine());

            phones.add(new Phone(model, price, quantity));
        }

        bufferedReader.close();
        fileReader.close();
    }

    public void savePhonesToTxtFile(String fileName) throws Exception {
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(Integer.toString(phones.size()));
        bufferedWriter.newLine();

        for (int i = 0; i < phones.size(); i++) {
            bufferedWriter.write(phones.get(i).getModel());
            bufferedWriter.newLine();

            bufferedWriter.write(Integer.toString(phones.get(i).getPrice()));
            bufferedWriter.newLine();

            bufferedWriter.write(Integer.toString(phones.get(i).getQuantity()));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        fileWriter.close();
    }


    public void sortPhonesForOver() {
        // List<Phone> phones = new ArrayList<>();
        List sortedList = phones.stream()
                .sorted(Comparator.comparing(Phone::getPrice))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);

    }

    public void sortPhonesForUnder() {
        List <Phone> sortedList = phones.stream()
                .sorted(Comparator.comparing(Phone::getPrice))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);

    }

    public void findModelPhones(){

        boolean findPhone = phones.stream()

                .noneMatch(phone -> phone.getModel().equals(Util.inputString("Введите название телефона")));
        if (findPhone = false) {

            System.out.println("Телефона нет!");

        }else {
            System.out.println("Телефон есть в таблице!");
        }
    }

    public void sumQantityPhones(){
        Integer sumList = phones.stream().collect(Collectors.summingInt(Phone::getQuantity));
        System.out.println("Общее кол-во телефонов: " +sumList);
    }
    public void minPricePhone(){
        phones.stream()
                .min(Comparator.comparing(Phone::getPrice))
                .ifPresent(System.out::println);
    }
    public void maxPricePhone(){
        phones.stream()
                .max(Comparator.comparing(Phone::getPrice))
                .ifPresent(System.out::println);
    }
}