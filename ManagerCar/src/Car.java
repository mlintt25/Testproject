import java.util.Scanner;

public class Car {
    private int id;
    private String name;
    private double price;
    private double extraOut;
    private int quantity;

    public Car() {
    }

    public Car(int id, String name, double price, double extraOut, int quantity) {
        this.id = id;
        setName(name);
        this.price = price;
        this.extraOut = extraOut;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String checker = "0123456789+-*/=_]}[{'\";:/?.>,<)(&^%$#@!~`\\|";
        int index = 0;
        for (int i = 1; i < name.length(); i++) {
            for (int j = 1; j < checker.length(); j++) {
                if (name.charAt(i) == checker.charAt(j)) {
                    index++;
                }
            }
        }
        if (index != 0 || name.isBlank()) {
            String msg = " Error! ";
            throw new InvalidNameException(msg, name);
        } else {
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getExtraOut() {
        return extraOut;
    }

    public void setExtraOut(double extraOut) {
        this.extraOut = extraOut;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double priceForSale() {
        if (quantity >= 50) {
            return (this.price + this.extraOut) + 0.1 * this.extraOut;
        } else {
            return this.price = this.extraOut;
        }
    }

    public void setInformation() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập id: ");
            String setId = scanner.nextLine();
            id = Integer.parseInt(setId);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(" !!! - Bạn đã nhập sai id. ");
        }
        try {
            System.out.println("Nhập tên: ");
            setName(scanner.nextLine());
        } catch (InvalidNameException e) {
            e.printStackTrace();
            System.out.println(" !!! - Bạn đã nhập sai tên. ");
        }
        try {
            System.out.println("Nhập giá: ");
            String setPrice = scanner.nextLine();
            price = Double.parseDouble(setPrice);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(" !!! - Bạn đã nhập sai giá. ");
        }
        try {
            System.out.println("Nhập thuế: ");
            String setExtraOut = scanner.nextLine();
            extraOut = Double.parseDouble(setExtraOut);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(" !!! - Bạn đã nhập sai thuế. ");
        }
        try {
            System.out.println("Nhập số lượng: ");
            String setQuantity = scanner.nextLine();
            quantity = Integer.parseInt(setQuantity);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(" !!! - Bạn đã nhập sai số lượng. ");
        }
    }

}
