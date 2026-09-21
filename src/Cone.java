public class Cone extends Shape {
    private double radius;
    private double height;

    // Public Constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Calculate Surface Area
    @Override
    protected double surface_area() {
        return (Math.PI * radius * radius) + (Math.PI * radius * Math.sqrt(radius * radius + height * height));
    }

    // Calculate Volume
    @Override
    protected double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    // Print Surface Area and Volume
    @Override
    public String toString() {
        return String.format("Cone: Surface Area: %.2f, Volume: %.2f", surface_area(), volume());
    }
}