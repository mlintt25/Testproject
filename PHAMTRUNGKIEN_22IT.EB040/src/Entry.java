import java.time.chrono.MinguoDate;
import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Application[] applications = new Application[4];
        applications[0] = new Application();
        applications[1] = new Application();
        applications[2] = new Application();
        applications[3] = new Application();

        do {
            System.out.println(" ");
            System.out.println(" ========================= MENU ========================= ");
            System.out.println(" 1. Nhập thông tin cho 4 object applications.");
            System.out.println(" 2. In ra danh sách applications. ");
            System.out.println(" 3. In ra danh sách applications sau khi sử dụng giảm giá. ");
            System.out.println(" 4. In ra thông tin của application có số lượng bán ra cao nhất. ");
            System.out.print(" Xin nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    for (int i = 0; i < applications.length; i++) {
                        System.out.println(" ");
                        System.out.println(" - Nhập vào thông tin application thứ " + (i + 1));
                        applications[i].setInformation();
                    }
                    break;
                }

                case 2: {
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",
                            "Tên", "Kích cỡ", "Năm phát hành", "Nền tảng", "Giá", "Số lượng");
                    for (int i = 0; i < applications.length; i++) {
                        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",
                                applications[i].getName(), applications[i].getSize(), applications[i].getReleaseYear(),
                                applications[i].getPlatform(), applications[i].getPrice(), applications[i].getSold());
                    }
                    break;

                }

                case 3: {
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",
                            "Tên", "Kích cỡ", "Năm phát hành", "Nền tảng", "Giá", "Số lượng");
                    for (int i = 0; i < applications.length; i++) {
                        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",
                                applications[i].getName(), applications[i].getSize(), applications[i].getReleaseYear(),
                                applications[i].getPlatform(), applications[i].discount(), applications[i].getSold());
                    }
                    break;
                }

                case 4: {
                    System.out.println(" ");
                    System.out.println(" Thông tin xe có số lượng được bán ra cao nhất: ");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",
                            "Tên", "Kích cỡ", "Năm phát hành", "Nền tảng", "Giá", "Số lượng");
                    int index = 0;
                    int maxValue = applications[0].getSold();
                    for (int i = 0; i < applications.length; i++) {
                        if (maxValue < applications[i].getSold()) {
                            index = i;
                        }
                    }
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",
                            applications[index].getName(), applications[index].getSize(), applications[index].getReleaseYear(),
                            applications[index].getPlatform(), applications[index].getPrice(), applications[index].getSold());

                    break;

                }

                default: {
                    System.out.println(" INVALID ");
                    break;
                }
            }


        } while (true);


    }


}
