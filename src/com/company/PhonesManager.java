package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public static ArrayList<Phone> getListTestPhones(){
        ArrayList<Phone> phones = new ArrayList<>();

        phones.add(new Phone("Samsung", 20, 50));
        phones.add(new Phone("Iphone", 15, 25));
        phones.add(new Phone("Nokia", 30, 40));

        return phones;
    }


}