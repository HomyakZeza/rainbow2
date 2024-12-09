package model.decorator.colors;

import model.decorator.Rainbow;
import model.decorator.RainbowDecorator;

import java.awt.*;

public class Green extends RainbowDecorator {
    public Green(Rainbow decoratedRainbow, int offset) {
        super(decoratedRainbow, Color.GREEN, offset);
    }
}
