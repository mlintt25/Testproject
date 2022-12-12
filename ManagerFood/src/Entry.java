import java.util.ArrayList;
import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Order> orders = new ArrayList<>();
        ArrayList<Double> bills = new ArrayList<>();
        do {
            System.out.println(" ");
            System.out.println(" ========================= MENU ========================= ");
            System.out.println(" 1. Nhập thông tin cho danh sách order. ");
            System.out.println(" 2. Tính tiền giá các món ăn. ");
            System.out.println(" 3. In ra các món ăn có cùng loại. ");
            System.out.println(" 4. In ra các món ăn có thời gian nấu ít hơn 15p. ");
            System.out.println(" 5. In ra danh sách có thêm tổng giá. ");
            System.out.print(" Mời bạn nhập lựa chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    Order list = addNewOrder(scanner);
                    if (list != null) {
                        orders.add(list);
                    }
                    break;
                }

                case 2: {
                    if (orders.size() > 0) {
                        getDiscount(orders, bills);
                    } else {
                        System.out.println("  ");
                        System.out.println(" Danh sách không có thông tin về món ăn. ");
                    }
                    break;
                }

                case 3: {
                    if (orders.size() > 0) {
                        System.out.println(" ");
                        System.out.println(" ============================== Danh sách thông tin về các món ăn cùng loại ============================== ");
                        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",
                                "Tên món", "Thời gian nấu", "Loại", "Giá", "Số lượng", "Tiền ship");
                        showSameFood(orders);
                    } else {
                        System.out.println("  ");
                        System.out.println(" Danh sách không có thông tin về món ăn. ");
                    }
                    break;
                }

                case 4: {
                    if (orders.size() > 0) {
                        System.out.println(" ");
                        System.out.println(" ========================= Danh sách thông tin về các món ăn có thời gian nấu ít hơn 15p ========================= ");
                        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",
                                "Tên món", "Thời gian nấu", "Loại", "Giá", "Số lượng", "Tiền ship");
                        showMinFood(orders);
                    } else {
                        System.out.println("  ");
                        System.out.println(" Danh sách không có thông tin về món ăn. ");
                    }
                    break;
                }

                case 5: {
                    if (orders.size() > 0) {
                        showInfo(orders, bills);
                    } else {
                        System.out.println("  ");
                        System.out.println(" Danh sách không có thông tin về món ăn. ");
                    }


                    break;
                }


            }
        } while (true);
    }

    private static ArrayList<Double> getDiscount(ArrayList<Order> orders, ArrayList<Double> bills) {
        double total = 0.0;
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getPrice() * orders.get(i).getAmount() < 200) {
                total = orders.get(i).getPrice() * orders.get(i).getAmount() + orders.get(i).getShip();
                bills.add(total);
            } else {
                total = orders.get(i).getPrice() * orders.get(i).getAmount();
                bills.add(total);
            }
        }

        return bills;
    }


    private static void showInfo(ArrayList<Order> orders, ArrayList<Double> bills) {
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n",
                "Tên món", "Thời gian nấu", "Loại", "Giá", "Số lượng", "Tiền ship", "Tổng tiền");
        for (Order list : orders) {
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",
                    list.getNameOfFood(), list.getTime(), list.getType(),
                    list.getPrice(), list.getAmount(), list.getShip());
        }

    }


    private static void showMinFood(ArrayList<Order> orders) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getTime() < 15) {
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",
                        orders.get(i).getNameOfFood(), orders.get(i).getTime(), orders.get(i).getType(),
                        orders.get(i).getPrice(), orders.get(i).getAmount(), orders.get(i).getShip());
            } else {
                break;
            }
        }
    }


    private static void showSameFood(ArrayList<Order> orders) {
        for (int i = 0; i < orders.size(); i++) {
            for (int j = 1; j < orders.size(); j++) {
                if (orders.get(i).getType().equalsIgnoreCase(orders.get(j).getType())) {
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",
                            orders.get(i).getNameOfFood(), orders.get(i).getTime(), orders.get(i).getType(),
                            orders.get(i).getPrice(), orders.get(i).getAmount(), orders.get(i).getShip());
                } else {
                    break;
                }
            }
        }


    }

//    String nameOfFood, double time, String type, double price, int amount, double ship

    private static Order addNewOrder(Scanner scanner) {
        System.out.println(" ");
        System.out.println(" Nhập thông tin ^^ ");
        System.out.println(" - Nhập tên món ăn: ");
        String nameOfFood = scanner.nextLine();
        System.out.println(" - Nhập thời gian nấu món ăn: ");
        double time = Double.parseDouble(scanner.nextLine().trim());
        System.out.println(" - Nhập loại món ăn: ");
        String type = scanner.nextLine();
        System.out.println(" - Nhập giá món ăn: ");
        double price = Double.parseDouble(scanner.nextLine().trim());
        System.out.println(" - Nhập số lượng món ăn: ");
        int amount = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(" - Nhập phí ship: ");
        double ship = Double.parseDouble(scanner.nextLine().trim());
        Order order = new Order(nameOfFood, time, type, price, amount, ship);
        return order;
    }
}
