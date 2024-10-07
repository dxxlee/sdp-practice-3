package task2;

import java.awt.*;

public class Square extends Shape {
    Square(Renderer renderer) {
        super(renderer);
    }

    void draw() {
        renderer.renderShape("Square");
    }
}
