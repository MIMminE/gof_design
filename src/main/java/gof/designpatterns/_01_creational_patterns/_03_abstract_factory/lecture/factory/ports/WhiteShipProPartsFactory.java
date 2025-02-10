package gof.designpatterns._01_creational_patterns._03_abstract_factory.lecture.factory.ports;

import gof.designpatterns._01_creational_patterns._03_abstract_factory.lecture.factory.ports.anchor.Anchor;
import gof.designpatterns._01_creational_patterns._03_abstract_factory.lecture.factory.ports.anchor.WhiteProAnchor;
import gof.designpatterns._01_creational_patterns._03_abstract_factory.lecture.factory.ports.wheel.Wheel;
import gof.designpatterns._01_creational_patterns._03_abstract_factory.lecture.factory.ports.wheel.WhiteProWheel;

public class WhiteShipProPartsFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new WhiteProAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteProWheel();
    }
}
