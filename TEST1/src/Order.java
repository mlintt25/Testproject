public class Order extends Food {

    private double price;
    private int amount;
    private double ship;

    public Order() {
    }

    public Order(String nameOfFood, int time, String type, double price, int amount, double ship) {
        super(nameOfFood, time, type);
        this.price = price;
        this.amount = amount;
        this.ship = ship;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getShip() {
        return ship;
    }

    public void setShip(double ship) {
        this.ship = ship;
    }

    public double discount() {
        if (this.price * this.amount > 200){
            return price * amount;
        } else {
            return price * amount + ship;
        }


    }

    @Override
    public String toString() {
        return super.toString()  +
                ", price = " + price +
                ", amount = " + amount +
                ", ship = " + ship +
                ']';
    }
}
