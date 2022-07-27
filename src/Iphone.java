import java.util.ArrayList;

public class Iphone extends Phones {

    ArrayList<Iphone> iphones = new ArrayList<Iphone>();

    public Iphone(String model, int price, int quantity) {
        super();
    }

    static Iphone createIphone() {
        String model = (String) createIphone().setModel(Util.inputString("Введите модель телефона: "));

        int price = createIphone().setPrice(Util.inputInt("Введите цену телефона:",1,1000000));

        int quantity = createIphone().setQuantity(Util.inputInt("Введите кол-во добавляемых телефонов: ",1, 500));

        return new Iphone(model, price, quantity);
    }

    static Iphone[] createEmptyIphonesArray() {
        return new Iphone[0];
    }
    static Iphone[] addIphoneToEndOfArray(Iphone[] iphones, Iphone insertedIphone) {


        Iphone[] tempIphones = new Iphone[iphones.length + 1];

        for (int i = 0; i < iphones.length; i++) {
            tempIphones[i] = iphones[i];
        }

        tempIphones[tempIphones.length - 1] = insertedIphone;


        return tempIphones;
    }


}
