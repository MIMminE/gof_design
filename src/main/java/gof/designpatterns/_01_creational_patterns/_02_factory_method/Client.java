package gof.designpatterns._01_creational_patterns._02_factory_method;

import gof.designpatterns._01_creational_patterns._02_factory_method.factory.BlackShipFactory;
import gof.designpatterns._01_creational_patterns._02_factory_method.factory.ShipFactory;
import gof.designpatterns._01_creational_patterns._02_factory_method.factory.WhiteShipFactory;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        client.print(new WhiteShipFactory(), "whiteShip", "white@mail.com");
        client.print(new BlackShipFactory(), "blackShip", "black@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        shipFactory.orderShip(name, email);
    }
}
