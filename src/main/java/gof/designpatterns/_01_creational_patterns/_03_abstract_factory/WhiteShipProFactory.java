package gof.designpatterns._01_creational_patterns._03_abstract_factory;

import gof.designpatterns._01_creational_patterns._03_abstract_factory.ports.ShipPartsFactory;
import gof.designpatterns._01_creational_patterns._03_abstract_factory.ports.anchor.Anchor;
import gof.designpatterns._01_creational_patterns._03_abstract_factory.ports.wheel.Wheel;

public class WhiteShipProFactory implements ShipFactory {
    private final ShipPartsFactory shipPartsFactory;

    public WhiteShipProFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {

        Anchor anchor = shipPartsFactory.createAnchor();
        Wheel wheel = shipPartsFactory.createWheel();

        return new Ship(anchor, wheel);
    }
}
