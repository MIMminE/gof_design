package gof.designpatterns._01_creational_patterns._03_abstract_factory;

import gof.designpatterns._01_creational_patterns._03_abstract_factory.ports.anchor.Anchor;
import gof.designpatterns._01_creational_patterns._03_abstract_factory.ports.wheel.Wheel;

public class Ship {

    private final Anchor anchor;
    private final Wheel wheel;

    public Ship(Anchor anchor, Wheel wheel) {
        this.anchor = anchor;
        this.wheel = wheel;
    }

    public Anchor getAnchor() {
        return anchor;
    }

    public Wheel getWheel() {
        return wheel;
    }
}
