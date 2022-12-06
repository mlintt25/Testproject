import java.util.Scanner;

public class CarList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[5];
        cars[0] = new Car();
        cars[1] = new Car();
        cars[2] = new Car();
        cars[3] = new Car();
        cars[4] = new Car();

        do {
            System.out.println(" ");
            System.out.println(" ========================= MENU ========================= ");
            System.out.println(" 1. Thêm 5 obj car vào danh sách. ");
            System.out.println(" 2. In ra danh sách Car. ");
            System.out.println(" 3. In ra danh sách Car có priceForSale lớn hơn 20. ");
            System.out.println(" 4. Tính tổng số xe có trong danh sách. ");
            System.out.print(" Nhập vào lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0: {
                    System.out.print(" - Bạn có chắc chắn muốn thoát chương trình (Y/N)?  ");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "Y": {
                            System.out.println(" - Cảm ơn đã sử dụng dịch vụ. ");
                            System.out.println(" - Hẹn gặp lại. ");
                            return;
                        }
                        case "N":
                            break;
                    }

                    break;
                }

                case 1: {
                    for (int i = 0; i < cars.length; i++) {
                        System.out.println(" ");
                        System.out.println("Nhập thông tin của xe thứ " + (i + 1));
                        cars[i].setInformation();
                    }
                    break;
                }

                case 2: {
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s\n",
                            "ID", "Tên", "Giá", "Thuế", "Số lượng");
                    for (int i = 0; i < cars.length; i++) {
                        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n",
                                cars[i].getId(), cars[i].getName(),
                                cars[i].getPrice(), cars[i].getExtraOut(), cars[i].getQuantity());
                    }

                    break;

                }

                case 3: {
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s\n",
                            "ID", "Tên", "Giá", "Thuế", "Số lượng");
                    int index = 0;
                    for (int i = 0; i < cars.length; i++) {
                        if (cars[i].priceForSale() > 20) {
                            index++;
                            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n",
                                    cars[i].getId(), cars[i].getName(),
                                    cars[i].getPrice(), cars[i].getExtraOut(), cars[i].getQuantity());
                        }
                    }
                    if (index == 0) {
                        System.out.println(" - Không có xe phù hợp với điều kiện. ");
                    }


                    break;
                }

                case 4: {
                    int sum = 0;
                    for (int i = 0; i < cars.length; i++) {
                        sum += cars[i].getQuantity();
                    }
                    System.out.println(" ");
                    System.out.println(" - Tổng số xe có trong danh sách là " + sum + " chiếc. ");

                    break;
                }

            }


        } while (true);


    }


}
