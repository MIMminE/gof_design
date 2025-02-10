package gof.designpatterns._01_creational_patterns._02_factory_method.lecture.factory;

import gof.designpatterns._01_creational_patterns._02_factory_method.lecture.ship.BlackShip;
import gof.designpatterns._01_creational_patterns._02_factory_method.lecture.ship.Ship;

public class BlackShipFactory implements ShipFactory{
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
