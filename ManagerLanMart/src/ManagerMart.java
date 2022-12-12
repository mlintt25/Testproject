import java.util.ArrayList;
import java.util.List;

public class ManagerMart {
    private String idMart;
    private String nameMart;
    private List<User> userList;

    User user = new User();

    public ManagerMart() {
        this.userList = new ArrayList<>();
    }

    public ManagerMart(String idMart, String nameMart) {
        this.idMart = idMart;
        this.nameMart = nameMart;
    }

    public String getIdMart() {
        return idMart;
    }

    public void setIdMart(String idMart) {
        this.idMart = idMart;
    }

    public String getNameMart() {
        return nameMart;
    }

    public void setNameMart(String nameMart) {
        this.nameMart = nameMart;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public double totalPayAcc(){

    }
}
