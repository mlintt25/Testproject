import java.util.ArrayList;
import java.util.Scanner;

public class ManagerOffiers {
    public static void main(String[] args) {
        ArrayList<Officer> officers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        do {
            System.out.println(" ");
            System.out.println(" ========================= MENU ========================= ");
            System.out.println(" 1. Thêm mới một cán bộ. ");
            System.out.println(" 2. Tìm kiếm cán bộ theo tên. ");
            System.out.println(" 3. Hiển thị toàn bộ danh sách cán bộ. ");
            System.out.println(" 0. Thoát khỏi chương trình. ");
            System.out.print(" Nhập vào lựa chọn của bạn: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 0: {
                    System.out.print(" - Bạn có chắc chắn rằng muốn thoát khỏi chương trình (Y/N)?  ");
                    String type = input.nextLine();
                    switch (type) {
                        case "Y": {
                            System.out.println(" - Cảm ơn đã sử dụng dịch vụ. ");
                            System.out.println(" - Hẹn gặp lại bạn. ");
                            return;
                        }
                        case "N": {
                            System.out.println(" ^^ ");
                            break;
                        }
                    }
                    break;
                }

                case 1: {
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" - Bạn đã chọn thêm mới một cán bộ.");
                    System.out.println(" 1. Thêm mới một công nhân. ");
                    System.out.println(" 2. Thêm mới một kỹ sư. ");
                    System.out.println(" 3. Thêm mới một nhân viên. ");
                    System.out.print(" Nhập lựa chọn tiếp theo của bạn: ");
                    int choose = input.nextInt();
                    input.nextLine();

                    switch (choose) {
                        case 1: {
                            System.out.println(" ");
                            System.out.println("Nhập tên của công nhân: ");
                            String fullName = input.nextLine();
                            System.out.println("Nhập tuổi của công nhân: ");
                            int age = input.nextInt();
                            input.nextLine();
                            System.out.println("Nhập giới tính của công nhân: ");
                            String gender = input.nextLine();
                            System.out.println("Nhập địa chỉ của công nhân: ");
                            String address = input.nextLine();
                            System.out.println("Nhập cấp bậc của công nhân: ");
                            int level = input.nextInt();
                            Officer worker = new Worker(fullName, age, gender, address, level);
                            officers.add(worker);
                            break;
                        }

                        case 2: {
                            System.out.println(" ");
                            System.out.println("Nhập tên của kỹ sư: ");
                            String fullName = input.nextLine();
                            System.out.println("Nhập tuổi của kỹ sư: ");
                            int age = input.nextInt();
                            input.nextLine();
                            System.out.println("Nhập giới tính của kỹ sư: ");
                            String gender = input.nextLine();
                            System.out.println("Nhập địa chỉ của kỹ sư: ");
                            String address = input.nextLine();
                            System.out.println("Nhập ngành đào tạo của kỹ sư: ");
                            String branch = input.nextLine();
                            Officer engineer = new Engineer(fullName, age, gender, address, branch);
                            officers.add(engineer);
                            break;
                        }

                        case 3: {
                            System.out.println(" ");
                            System.out.println("Nhập tên của nhân viên: ");
                            String fullName = input.nextLine();
                            System.out.println("Nhập tuổi của nhân viên: ");
                            int age = input.nextInt();
                            input.nextLine();
                            System.out.println("Nhập giới tính của nhân viên: ");
                            String gender = input.nextLine();
                            System.out.println("Nhập địa chỉ của nhân viên: ");
                            String address = input.nextLine();
                            System.out.println("Nhập công việc của nhân viên: ");
                            String work = input.nextLine();
                            Officer staff = new Staff(fullName, age, gender, address, work);
                            officers.add(staff);
                            break;
                        }
                    }
                    break;
                }

                case 2: {
                    if (officers.size() > 0) {
                        System.out.print("Nhập tên bạn muốn tìm kiếm: ");
                        String searchByName = input.nextLine();
                        for (int i = 0; i < officers.size(); i++) {
                            int index = officers.get(i).getFullName().lastIndexOf(" ");
                            if (officers.get(i).getFullName().substring(index + 1)
                                    .compareToIgnoreCase(searchByName) == 0) {
                                System.out.println(officers.get(i));
                            }
                        }
                    } else {
                        System.out.println(" ");
                        System.out.println(" Không có thông tin trong danh sách! ");
                    }
                    break;
                }

                case 3: {
                    if (officers.size() > 0) {
                        for (int i = 0; i < officers.size(); i++) {
                            System.out.println(officers.get(i));
                        }
                    } else {
                        System.out.println(" ");
                        System.out.println(" Không có thông tin trong danh sách! ");
                    }

                    break;
                }

                default: {
                    System.out.println(" ");
                    System.out.println(" Vui lòng nhập lựa chọn từ [0 - 4]\n Mời bạn chọn lại. ");
                    break;
                }
            }
        } while (true);
    }
}
