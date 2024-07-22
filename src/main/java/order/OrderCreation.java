package order;

import java.util.List;

public class OrderCreation {
    public static Order getOrderWithOneColor(){
        return new Order(
                "Timur",
                "Gabdullin",
                "Budennogo, 141 apt.",
                "4",
                "+7 920 030 36 05",
                "5",
                "2024-07-25",
                "no comment",
                List.of("Black")
        );
    }
    public static Order getOrderWithTwoColor() {
        return new Order(
                "Timur",
                "Gabdullin",
                "Budennogo, 141 apt.",
                "Сокольники",
                "+7 920 030 36 05",
                "5",
                "2024-07-25",
                "no comment",
                List.of("Black", "Grey")
                );
    }
    public static Order getOrderWithoutColor() {
        return new Order(
                "Тимур",
                "Gabdullin",
                "4",
                "+7 920 030 36 05",
                "5",
                "2024-07-25",
                "no comment",
                List.of()
        );
    }
}
