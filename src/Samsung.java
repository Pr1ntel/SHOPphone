import java.util.ArrayList;

public class Samsung extends Phones {

    ArrayList<Samsung> samsungs = new ArrayList<Samsung>();

    public Samsung(String model, int price, int quantity) {
        super(model, price, quantity);
    }

    static samsungCreate() {
        String model = (String) Samsung.createIphone().setModel(Util.inputString("Введите модель телефона: "));


    static Samsung[] createEmptySamPhonesArray() {
        return new Samsung[0];
    }

    static Samsung[] addSamPhoneToEndOfArray(Samsung[] samsungs, Samsung insertedSamPhone) {


        Samsung[] tempSamPhones = new Samsung[samsungs.length + 1];

        for (int i = 0; i < samsungs.length; i++) {
            tempSamPhones[i] = samsungs[i];
        }

        tempSamPhones[tempSamPhones.length - 1] = insertedSamPhone;


        return tempSamPhones;
    }


}

