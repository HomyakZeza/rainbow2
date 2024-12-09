package model;

import model.decorator.BaseRainbow;
import model.decorator.Rainbow;
import model.decorator.colors.*;

public class RainbowModel {
    private final Rainbow rainbow;

    public RainbowModel() {
        // Формирование радуги с использованием декораторов
        rainbow = new Violet(
                new Blue(
                        new Green(
                                new Yellow(
                                        new Orange(
                                                new Red(
                                                        new BaseRainbow(),
                                                        10
                                                ),
                                                20
                                        ),
                                        30
                                ),
                                40
                        ),
                        50
                ),
                60
        );
    }

    public Rainbow getRainbow() {
        return rainbow;
    }
}
