package courier;

public class InputDataOnlyLogin {
    private String login;
    private String password;
    public InputDataOnlyLogin(String login,String password) {
        this.password = password;
        this.login = login;
    }
public static InputDataOnlyLogin fromOnlyLogin(Courier courier){
        return  new InputDataOnlyLogin(courier.getLogin(), "");
}
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
