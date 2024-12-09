package view;

import model.RainbowModel;

import javax.swing.*;
import java.awt.*;

public class RainbowView extends JPanel {
    private final RainbowModel model;

    public RainbowView(RainbowModel model) {
        this.model = model;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();

        // Вызываем метод draw из модели
        model.getRainbow().draw(g, w, h);
    }
}
