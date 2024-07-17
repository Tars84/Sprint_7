package courier;

public class InputDataOnlyPassword {
    private String password;

public InputDataOnlyPassword(String password) {
    this.password = password;
}
public static InputDataOnlyPassword fromOnlyPassword(Courier courier){
    return  new InputDataOnlyPassword(courier.getPassword());
}
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
