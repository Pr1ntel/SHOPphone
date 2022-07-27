import java.util.ArrayList;

public class Iphone extends Phones {

  private  ArrayList<Iphone> iphones = new ArrayList<Iphone>();

    public Iphone(String model, int price, int quantity) {
        super();
    }

    // Iphone createIphone() {
        String model = Util.inputString("Введите модель телефона: "));

        int price = "Введите цену телефона:",1,1000000));

        int quantity = Util.inputInt("Введите кол-во добавляемых телефонов: ",1, 500));


    }

    public void  addIphoneToEndOfArray(Iphone insertedIphone) {

        iphones.add(insertedIphone);
    }


}
