package order;

import java.util.List;

public class OrderCreation {
    public static Order getOrderWithOneColor(){
        return new Order(
                "Timur",
                "Gabdullin",
                "Budennogo str h 11",
                "Metro",
                "+79875078207",
                "4",
                "19.07.2024",
                "No rush",
                List.of("Black")
        );
    }
    public static Order getOrderWithTwoColor() {
        return new Order(
                "Timur",
                "Gabdullin",
                "Budennogo str h 11",
                "Metro",
                "+79875078207",
                "4",
                "19.07.2024",
                "No rush",
                List.of("Black", "Grey")
                );
    }
    public static Order getOrderWithoutColor() {
        return new Order(
                "Timur",
                "Gabdullin",
                "Budennogo str h 11",
                "Metro",
                "+79875078207",
                "4",
                "19.07.2024",
                "No rush",
                List.of()
        );
    }
}
