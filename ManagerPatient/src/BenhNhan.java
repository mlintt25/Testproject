import java.util.Scanner;

public class BenhNhan {
    private String hoTen;
    private String queQuan;
    private int namSinh;

    public BenhNhan() {
    }

    public BenhNhan(String hoTen, String queQuan, int namSinh) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void nhapThongTin(){
        Scanner thu = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = thu.nextLine();
        System.out.println("Nhap que quan: ");
        queQuan = thu.nextLine();

        try {
            System.out.println("Nhap nam sinh: ");
            namSinh = thu.nextInt();
        } catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println(" ");
        }



    }


}
