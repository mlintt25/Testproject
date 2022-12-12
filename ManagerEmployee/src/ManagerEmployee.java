import java.util.Scanner;

public class ManagerEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee();
        employees[1] = new Employee();
        employees[2] = new Employee();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(" ");
            System.out.println(" ========================= MENU ========================= ");
            System.out.println("1. Enter employee information. ");
            System.out.println("2. Display list of employee. ");
            System.out.println("3. Display employee information under conditions. ");
            System.out.println("4. Display the highest salary staff information. ");
            System.out.println("0. END. ");
            System.out.print("Please enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0: { // Kết thúc
                    System.out.println(" ");
                    System.out.print(" Are you sure you want to escape the program(Y/N)? ");
                    String choose = scanner.nextLine();

                    switch (choose) {
                        case "Y": {
                            System.out.println(" Thanks for using the service. ");
                            System.out.println(" See you agian. ");
                            return;
                        }
                        case "N": {
                            System.out.println(" ^^ Welcome ");
                            break;
                        }

                    }
                    break;
                }

                case 1: { // Nhập thông tin cho nhân viên
                    for (int i = 0; i < employees.length; i++) {
                        System.out.println(" ");
                        System.out.println(" Enter employee number " + (i + 1) + " information. ");
                        employees[i].setInformation();
                    }
                    break;
                }

                case 2: { // Hiển thị thông tin của nhân viên trong danh sách
                    int index = 0;
                    System.out.println(" ");
                    System.out.println(" ---------------- LIST OF EMPLOYEE ---------------- ");
                    System.out.printf("%-20s%-20s%-20s\n", "Full Name", "Year", "Salary");
                    for (int i = 0; i < employees.length; i++) {
                        if (employees[i].getFullName() == null ||
                                employees[i].getFullName().matches(".*[^a-zA-Z[\\s]]$.*")) {
                            System.out.printf("%-20s", "ERROR");
                        } else {
                            employees[i].showInformation();
                        }
                    }


                    break;

                }

                case 3: { // Hiển thị thông tin nhân viên có lương vượt khung
                    System.out.printf("%-20s%-20s%-20s\n", "Full Name", "Year", "Salary");
                    for (int i = 0; i < employees.length; i++) {
                        if (employees[i].getExperience() >= 20 ||
                                employees[i].getCoefficient() > 8) {
                            employees[i].showInformation();
                        }
                    }

                    break;
                }

                case 4: { // Hiển thị thông tin nhân viên có lương cao nhất
                    int index = 0;
                    double maxValue = employees[0].getSalary();
                    for (int i = 0; i < employees.length; i++) {
                        if (maxValue < employees[i].getSalary()) {
                            maxValue = employees[i].getSalary();
                            index = i;
                        }
                    }
                    System.out.printf("%-20s%-20s%-20s\n", "Full Name", "Year", "Salary");
                    employees[index].showInformation();

                    break;
                }

                default: { // Không nằm trong các trường hợp trên
                    System.out.println(" ERROR! ");
                    break;
                }

            }
        } while (true);
    }
}
