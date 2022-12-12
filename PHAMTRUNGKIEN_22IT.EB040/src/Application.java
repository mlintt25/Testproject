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

    public double discount() {
        if (getReleaseYear() > 4) {
            return price - (0.3 * price);
        } else {
            return price - (0.1 * price);
        }
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

    public void setInformation() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập tên: ");
            super.setName(scanner.nextLine());
        } catch (InvalidNameException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Nhập kích cỡ phần mềm: ");
            super.setSize(scanner.nextLine());
        } catch (InvalidSizeException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Nhập năm phát hành: ");
            super.setReleaseYear(scanner.nextInt());
        } catch (InvalidYearException e) {
            e.printStackTrace();
        }
        scanner.nextLine();
        try {
            System.out.println("Nhập nền tảng ứng dụng: ");
            super.setPlatform(scanner.nextLine());
        } catch (InvalidPlatException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Nhập giá: ");
            String setPrice = scanner.nextLine().trim();
            price = Double.parseDouble(setPrice);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Nhập số lượng bán ra: ");
            String setSold = scanner.nextLine().trim();
            sold = Integer.parseInt(setSold);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


    }


}
