package gof.designpatterns._01_creational_patterns._03_abstract_factory.lecture.factory.ports;

import gof.designpatterns._01_creational_patterns._03_abstract_factory.lecture.factory.ports.anchor.Anchor;
import gof.designpatterns._01_creational_patterns._03_abstract_factory.lecture.factory.ports.wheel.Wheel;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
