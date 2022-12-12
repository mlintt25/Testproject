import java.util.Scanner;

public class Application extends Software {
    private double price;
    private int sold;

    public Application() {
    }

    public Application(String name, String size, int releaseYear, String platform, double price, int sold) {
        super(name, size, releaseYear, platform);
        this.price = price;
        this.sold = sold;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public double discount() {
        if ((2022 - super.getReleaseYear()) > 4) {
            return this.price - 0.3 * this.price;
        } else {
            return this.price - 0.1 * this.price;
        }
    }

    //    String name, String size, int releaseYear, String platform, double price, int sold
    public void setInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println(" - Nhập tên: ");
        super.setName(input.nextLine());
        System.out.println(" - Nhập kích cỡ: ");
        super.setSize(input.nextLine());
        System.out.println(" - Nhập năm phát hành: ");
        super.setReleaseYear(input.nextInt());
        input.nextLine();
        System.out.println(" - Nhập nền tảng: ");
        super.setPlatform(input.nextLine());
        System.out.println(" - Nhập giá: ");
        price = input.nextDouble();
        System.out.println(" - Nhập số lượng: ");
        sold = input.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", price = '" + price + '\'' +
                ", sold = " + sold + '\'' +
                ']';
    }

    public void showInfo() {
        System.out.println("Name: " + super.getName());
        System.out.println("Size: " + super.getSize());
        System.out.println("ReleaseYear: " + super.getReleaseYear());
        System.out.println("Platform: " + super.getPlatform());
        System.out.println("Price: " + price);
        System.out.println("Sold: " + sold);
    }


}
