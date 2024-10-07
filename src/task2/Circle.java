package task2;

public class Circle extends Shape{
    Circle(Renderer renderer){
        super(renderer);
    }

    void draw(){
        renderer.renderShape("Circle");
    }
}
