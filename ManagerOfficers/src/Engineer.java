public class Engineer extends Officer {
    private String branch;

    public Engineer() {
    }

    public Engineer(String fullName, int age, String gender, String address, String branch) {
        super(fullName, age, gender, address);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Engineer[Tên: " + getFullName() + ", tuổi: " + getAge() +
                ", giới tính: " + getGender() + ", ngành đào tạo: " + getBranch() + "]";
    }
}
