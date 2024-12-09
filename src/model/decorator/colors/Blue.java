package model.decorator.colors;

import model.decorator.Rainbow;
import model.decorator.RainbowDecorator;

import java.awt.*;

public class Blue extends RainbowDecorator {
    public Blue(Rainbow decoratedRainbow, int offset) {
        super(decoratedRainbow, Color.BLUE, offset);
    }
}
