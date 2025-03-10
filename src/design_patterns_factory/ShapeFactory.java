package design_patterns_factory;

public class ShapeFactory {
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE -> {
                return new Circle();
            }
            case SQUARE -> {
                return new Square();
            }
            case TRIANGLE -> {
                return new Triangle();
            }
            default -> {
                return null;
            }
        }
    }
}
