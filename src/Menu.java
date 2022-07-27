public class Menu {
    static void printMenu() {
        Iphone[] iphones = Iphone.createEmptyIphonesArray();
        Samsung[] samsungs = Samsung.createEmptySamPhonesArray();
        System.out.println("Программа добавления/удаления товара. Выбрать пункт: ");
        System.out.println("1: Phones");
        System.out.println("2: ");
        System.out.println("3: ");
        System.out.println("4: ");
        System.out.println("5: ");
        int menuPoint = Util.inputInt("Ввести номер нужного пункта:", 1, 5);
        switch (menuPoint) {

            case 1: {
                System.out.println("1. Iphones");
                System.out.println("2: Samsung");
                System.out.println("3: Huawei");
                int switchPoint = Util.inputInt("Выбрать пункт: ", 1, 3);

                switch (switchPoint) {
                    case 1: {
                        Iphone insertedIphone = Iphone.createIphone();

                       Iphone.addIphoneToEndOfArray(iphones, insertedIphone) ;
                        System.out.println("Товар добавлен!!");
                        //String nameIphone = Util.inputString("Введите модель: ");
                        //System.out.println("Модель: " + nameIphone + " добавлена!");
                    }
                    case 2: {
                        Samsung insrtedSampPhones = Samsung.
                    }
                }
            }
        }
    }
}

