package model.decorator.colors;

import model.decorator.Rainbow;
import model.decorator.RainbowDecorator;

import java.awt.*;

public class Red extends RainbowDecorator {
    public Red(Rainbow decoratedRainbow, int offset) {
        super(decoratedRainbow, Color.RED, offset);
    }
}
