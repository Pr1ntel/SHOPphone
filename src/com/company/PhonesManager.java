package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PhonesManager implements Serializable {

    private ArrayList<Phone> phones;

    public PhonesManager() {
        phones = new ArrayList<>();
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

    void saveToTxtFilePhone(String filename) throws IOException {

        String temp = phones.toString();
        PrintWriter printWriter = new PrintWriter(filename);
        printWriter.write(temp);
        printWriter.close();

        System.out.println("Сохранение совершено успешно!");
    }
    void loadToTxtFilePhone(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Phone> clubs = (ArrayList<Phone>) objectInputStream.readObject();
        objectInputStream.close();

    }


}
