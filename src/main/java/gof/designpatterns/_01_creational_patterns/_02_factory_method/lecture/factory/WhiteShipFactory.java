package gof.designpatterns._01_creational_patterns._02_factory_method.lecture.factory;

import gof.designpatterns._01_creational_patterns._02_factory_method.lecture.ship.Ship;
import gof.designpatterns._01_creational_patterns._02_factory_method.lecture.ship.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
