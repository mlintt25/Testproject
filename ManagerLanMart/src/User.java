public class User implements UserAction {
    private String id; // Mã
    private String fullName; // Tên
    private int numAcc; // Số tài khoản
    private double balance; // Số dư tài khoản
    private String address; // Địa chỉ
    private double totalPay; // Tổng tiền đã chi

    private boolean closeCus; // Khách hàng thân thiết

    public User() {
    }

    public User(String id, String fullName, int numAcc, double balance,
                String address, double totalPay, boolean closeCus) {
        this.id = id;
        this.fullName = fullName;
        this.numAcc = numAcc;
        this.balance = balance;
        this.address = address;
        this.totalPay = totalPay;
        this.closeCus = closeCus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumAcc() {
        return numAcc;
    }

    public void setNumAcc(int numAcc) {
        this.numAcc = numAcc;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public boolean checkBank() {
        if (this.balance + this.totalPay > 10000000) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isCloseCus() {
        if (checkBank() == true) {
            return true;
        } else {
            return false;
        }
    }

}
