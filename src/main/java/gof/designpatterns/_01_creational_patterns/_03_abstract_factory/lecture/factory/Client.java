package gof.designpatterns._01_creational_patterns._03_abstract_factory.lecture.factory;

import gof.designpatterns._01_creational_patterns._03_abstract_factory.lecture.factory.ports.ShipPartsFactory;
import gof.designpatterns._01_creational_patterns._03_abstract_factory.lecture.factory.ports.WhiteShipProPartsFactory;

public class Client {

    public static void main(String[] args) {
        ShipPartsFactory partsFactory = new WhiteShipProPartsFactory();
        ShipFactory shipFactory = new WhiteShipProFactory(partsFactory);

        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor());
        System.out.println(ship.getWheel());
    }
}
