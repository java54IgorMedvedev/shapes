package telran.shapes.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.shapes.Canvas;
import telran.shapes.Rectangle;
import telran.shapes.Square;

public class ShapeTests {
    private Rectangle rectangle;
    private Square square;
    private Canvas canvas;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(1, 10, 20);
        square = new Square(2, 15);
        canvas = new Canvas(3);
    }

    @Test
    void testRectangleSquareAndPerimeter() {
        assertEquals(200, rectangle.square());
        assertEquals(60, rectangle.perimeter());
    }

    @Test
    void testSquareSquareAndPerimeter() {
        assertEquals(225, square.square());
        assertEquals(60, square.perimeter());
    }

    @Test
    void testCanvasOperations() {
        canvas.addShape(rectangle);
        canvas.addShape(square);
        assertEquals(425, canvas.square());
        assertEquals(120, canvas.perimeter());

        canvas.removeShape(1);
        assertEquals(225, canvas.square());
        assertEquals(60, canvas.perimeter());
    }
}
