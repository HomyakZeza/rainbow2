package controller;

import model.RainbowModel;
import view.RainbowView;

public class RainbowController {
    private final RainbowModel model;
    private final RainbowView view;

    public RainbowController(RainbowModel model, RainbowView view) {
        this.model = model;
        this.view = view;
    }

    // Дополнительные методы управления
    public void changeOffsets(int increment) {
        // Логика изменения смещений (не реализована для примера)
        view.repaint();
    }
}
