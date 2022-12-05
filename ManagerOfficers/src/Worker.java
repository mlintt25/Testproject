public class Worker extends Officer {
    private int level;

    public Worker() {
    }

    public Worker(String fullName, int age, String gender, String address, int level) {
        super(fullName, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker[Tên: " + getFullName() + ", tuổi: " + getAge() +
                ", giới tính: " + getGender() + ", bậc: " + getLevel() + "]";
    }
}
