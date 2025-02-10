package gof.designpatterns._01_creational_patterns._03_abstract_factory.lecture.factory.ports;

import gof.designpatterns._01_creational_patterns._03_abstract_factory.lecture.factory.ports.anchor.Anchor;
import gof.designpatterns._01_creational_patterns._03_abstract_factory.lecture.factory.ports.anchor.WhiteAnchor;
import gof.designpatterns._01_creational_patterns._03_abstract_factory.lecture.factory.ports.wheel.Wheel;
import gof.designpatterns._01_creational_patterns._03_abstract_factory.lecture.factory.ports.wheel.WhiteWheel;

public class WhiteShipPartsFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
