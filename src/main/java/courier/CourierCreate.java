package courier;

public class CourierCreate {
    public static Courier getCourier() {
        return new Courier("Tars", "12345", "Timur");
    }

    public static Courier getCourierWithLoginOnly() {
        return new Courier("Tars", "", "");
    }

    public static Courier getCourierWithPasswordOnly() {
        return new Courier("", "test", "");
    }

    public static Courier getCourierWithSimilarLogin() {
        return new Courier("Tars", "12345", "Timur");
    }
}