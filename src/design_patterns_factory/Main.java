package design_patterns_factory;

public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        ShapeType shapeType = ShapeType.SQUARE;
        Shape shape = shapeFactory.getShape(shapeType);
        shape.draw();

        shapeType = ShapeType.CIRCLE;
        shape = shapeFactory.getShape(shapeType);
        shape.draw();

        shapeType = ShapeType.TRIANGLE;
        shape = shapeFactory.getShape(shapeType);
        shape.draw();

    }
}
