package model.decorator;

import java.awt.*;

public class RainbowDecorator implements Rainbow {
    protected final Rainbow decoratedRainbow;
    private final Color color;
    private final int offset;

    public RainbowDecorator(Rainbow decoratedRainbow, Color color, int offset) {
        this.decoratedRainbow = decoratedRainbow;
        this.color = color;
        this.offset = offset;
    }

    @Override
    public void draw(Graphics g, int w, int h) {
        decoratedRainbow.draw(g, w, h);
        g.setColor(color);
        g.fillArc(offset, offset, w - 2 * offset, h - 2 * offset, 0, 180);
    }
}
