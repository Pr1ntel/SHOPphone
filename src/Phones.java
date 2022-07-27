public class Phones {
    private String model;
    private int price;

    public Phones(String model, int price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    private int quantity;

    public Phones() {

    }

    public String getModel() {
        return model;
    }

    public Object setModel(String model) {
        this.model = model;
        return null;
    }

    public int getPrice() {
        return price;
    }

    public int setPrice(int price) {
        this.price = price;
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int setQuantity(int quantity) {
        this.quantity = quantity;
        return quantity;
    }



}
