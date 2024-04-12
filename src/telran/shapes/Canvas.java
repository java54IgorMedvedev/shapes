package telran.shapes;

import java.util.ArrayList;
import java.util.List;

public class Canvas extends Shape {
    private List<Shape> shapes;

    public Canvas(long id) {
        super(id);
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(long id) {
        shapes.removeIf(shape -> shape.getId() == id);
    }

    public int square() {
        return shapes.stream().mapToInt(Shape::square).sum();
    }

    public int perimeter() {
        return shapes.stream().mapToInt(Shape::perimeter).sum();
    }
}
