package model.decorator.colors;

import model.decorator.Rainbow;
import model.decorator.RainbowDecorator;

import java.awt.*;

public class Orange extends RainbowDecorator {
    public Orange(Rainbow decoratedRainbow, int offset) {
        super(decoratedRainbow, Color.ORANGE, offset);
    }
}
