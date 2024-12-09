package model.decorator.colors;

import model.decorator.Rainbow;
import model.decorator.RainbowDecorator;

import java.awt.*;

public class Violet extends RainbowDecorator {
    public Violet(Rainbow decoratedRainbow, int offset) {
        super(decoratedRainbow, new Color(128, 0, 128), offset); // Фиолетовый цвет с использованием RGB
    }
}
