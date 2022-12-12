import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Application[] applications = new Application[4];
        applications[0] = new Application();
        applications[1] = new Application();
        applications[2] = new Application();
        applications[3] = new Application();

        do {
            System.out.println(" ");
            System.out.println(" ============================== MENU ============================== ");
            System.out.println(" 0. Thoát chương trình. ");
            System.out.println(" 1. Nhập thông tin cho 4 applications. ");
            System.out.println(" 2. In ra danh sách applications. ");
            System.out.println(" 3. In ra danh sách sau khi giảm giá. ");
            System.out.println(" 4. In ra thông tin application có số lượng bán ra cao nhất. ");
            System.out.print(" Nhập vào lựa chọn của bạn: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 0: {
                    System.out.println(" Cảm ơn đã sử dụng dịch vụ! ");
                    break;
                }

                case 1: {
                    for (int i = 0; i < applications.length; i++) {
                        System.out.println(" ");
                        System.out.println(" Nhập thông tin của application thứ " + (i + 1));
                        applications[i].setInfo();
                    }
                    break;
                }

                case 2: {
                    for (int i = 0; i < applications.length; i++) {
                        System.out.println(" ");
                        System.out.println("Danh sách thông tin các applications. ");
                        System.out.println(applications[i]);

                    }
                    break;
                }

//                case 2: {
//                    for (int i = 0; i < applications.length; i++){
//                        System.out.println(" ");
//                        System.out.println("Thông tin application thứ " + (i + 1));
//                        applications[i].showInfo();
//                    }
//                    break;
//                }

                case 3: {
                    for (int i = 0; i < applications.length; i++) {
                        System.out.println(" ");
                        System.out.println("Thông tin của application thứ " + (i + 1) + " sau khi giảm giá. ");
                        System.out.println("Name: " + applications[i].getName());
                        System.out.println("Size: " + applications[i].getSize());
                        System.out.println("ReleaseYear: " + applications[i].getReleaseYear());
                        System.out.println("Platform: " + applications[i].getPlatform());
                        System.out.println("Price: " + applications[i].discount());
                        System.out.println("Sold: " + applications[i].getSold());
                    }
                    break;
                }

                case 4: {
                    int max = applications[0].getSold();
                    int index = 0;
                    for (int i = 0; i < applications.length; i++) {
                        if (max < applications[i].getSold()) {
                            max = applications[i].getSold();
                            index = i;
                        }
                    }
                    System.out.println(" ");
                    System.out.println("Thông tin application có số lượng bán ra cao nhất. ");
                    System.out.println(applications[index]);

                    break;
                }

            }


        } while (true);


    }
}
