
import java.util.Scanner;

public class Employee {
    private String fullName;
    private int year;
    private double coefficient;
    private int experience;

    public Employee() {
    }

    public Employee(String fullName, int year, double coefficient, int experience) {
        setFullName(fullName);
        this.year = year;
        this.coefficient = coefficient;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        String checker = "0123456789+-*/=_]}[{'\";:/?.>,<)(&^%$#@!~`\\|";
        int index = 0;
        for (int i = 0; i < fullName.length(); i++) {
            for (int j = 0; j < checker.length(); j++) {
                if (fullName.charAt(i) == checker.charAt(j)) {
                    index++;
                }
            }
        }
        if (index != 0 || fullName.isBlank()) {
            var msg = " Error! - You have entered the wrong full name. ";
            throw new InvalidNameException(msg, fullName);
        } else {
            this.fullName = fullName;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return coefficient * 150000 + experience * 30000;
    }

    public void setInformation() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(" - Enter full name: ");
            setFullName(scanner.nextLine());
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(" - Enter year of birth: ");
            String setYear = scanner.nextLine().trim();
            year = Integer.parseInt(setYear);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(" Error! - You have entered the wrong year of birth. " + e.getMessage());
            System.out.println(" ");
        }
        try {
            System.out.println(" - Enter coefficient salary: ");
            String setCoefficient = scanner.nextLine().trim();
            coefficient = Double.parseDouble(setCoefficient);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(" Error! - You have entered the wrong salary coefficient. " + e.getMessage());
            System.out.println(" ");
        }
        try {
            System.out.println(" - Enter experience: ");
            String setExperience = scanner.nextLine().trim();
            experience = Integer.parseInt(setExperience);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(" Error! - You have entered the wrong experience. " + e.getMessage());
            System.out.println(" ");
        }
    }

    public void showInformation() {
        System.out.printf("%-20s%-20s%-20s\n", getFullName(), getYear(), getSalary());
    }


}

