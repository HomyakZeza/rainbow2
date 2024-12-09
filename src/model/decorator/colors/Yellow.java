package model.decorator.colors;

import model.decorator.Rainbow;
import model.decorator.RainbowDecorator;

import java.awt.*;

public class Yellow extends RainbowDecorator {
    public Yellow(Rainbow decoratedRainbow, int offset) {
        super(decoratedRainbow, Color.YELLOW, offset);
    }
}
