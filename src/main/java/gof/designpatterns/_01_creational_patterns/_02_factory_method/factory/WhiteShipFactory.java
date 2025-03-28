package gof.designpatterns._01_creational_patterns._02_factory_method.factory;

import gof.designpatterns._01_creational_patterns._02_factory_method.ship.Ship;
import gof.designpatterns._01_creational_patterns._02_factory_method.ship.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
