import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Order> orders = new ArrayList<>();

        do {
            System.out.println(" ");
            System.out.println(" ========================= MENU ========================= ");
            System.out.println(" 1. Nhập thông tin cho các món ăn. ");
            System.out.println(" 2. Tính giá các món ăn. ");
            System.out.println(" 3. In ra các món ăn cùng loại. ");
            System.out.println(" 4. In ra các món ăn có thời gian nấu ít hơn 15p. ");
            System.out.println(" 5. In ra danh sách Order cùng với tổng giá. ");
            System.out.println(" 6. In ra danh sách món ăn theo thứ tự số lượng các món giảm dần. ");
            System.out.print(" Mời bạn nhập lựa chọn: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1: {
//                    String nameOfFood, int time, String type, double price, int amount, double ship
                    System.out.println(" ");
                    System.out.println(" Nhập thông tin cho các món ăn: ");
                    System.out.println(" - Nhập tên món ăn: ");
                    String nameOfFood = input.nextLine();
                    System.out.println(" - Nhập thời gian nấu: ");
                    int time = input.nextInt();
                    input.nextLine();
                    System.out.println(" - Nhập loại: ");
                    String type = input.nextLine();
                    System.out.println(" - Nhập giá: ");
                    double price = input.nextDouble();
                    System.out.println(" - Nhập số lượng: ");
                    int amount = input.nextInt();
                    System.out.println(" - Nhập phí ship: ");
                    double ship = input.nextDouble();
                    Order order = new Order(nameOfFood, time, type, price, amount, ship);
                    orders.add(order);
                    break;
                }

                case 2: {
                    for (int i = 0; i < orders.size(); i++) {
                        orders.get(i).discount();
                    }


                    break;
                }

                case 3: {
                    for (int i = 0; i < orders.size(); i++) {
                        for (int j = 1; j < orders.size(); j++){
                            if (orders.get(i).getType().equalsIgnoreCase(orders.get(j).getType())){
                                System.out.println(orders.get(i));
                            } else {
                                break;
                            }
                        }
                    }
                    break;
                }

                case 4: {
                    for (int i = 0; i < orders.size(); i++){
                        if (orders.get(i).getTime() < 15){
                            System.out.println(orders.get(i));
                        } else {
                            break;
                        }
                    }

                    break;
                }

                case 5: {
                    for (int i = 0; i < orders.size(); i++){
                        System.out.println(orders.get(i) + ", total = " + orders.get(i).discount());

                    }
                    break;
                }

                case 6: {
                    Collections.sort(orders, new SortSoldDe());
                    for (int i = 0; i < orders.size(); i++){
                        System.out.println(" ");
                        System.out.println(orders.get(i));
                    }
                    break;
                }
            }
        } while (true);


    }
}