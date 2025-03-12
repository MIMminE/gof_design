package gof.designpatterns._01_creational_patterns._02_factory_method.ship;

public class Ship {
    private final String name;
    private final String color;

    public Ship(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
