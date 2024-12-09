package app;

import controller.RainbowController;
import model.RainbowModel;
import view.RainbowView;

import javax.swing.*;

public class RainbowApp {
    public static void main(String[] args) {
        // Создаем модель
        RainbowModel model = new RainbowModel();

        // Создаем представление
        RainbowView view = new RainbowView(model);

        // Создаем контроллер
        RainbowController controller = new RainbowController(model, view);

        // Создаем окно
        JFrame frame = new JFrame("Rainbow MVC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(view);
        frame.setVisible(true);
    }
}
