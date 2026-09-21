public class Cylinder extends Shape {
    private double radius;
    private double height;

    // Public Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Calculate Surface Area
    @Override
    protected double surface_area() {
        return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
    }

    // Calculate Volume
    @Override
    protected double volume() {
        return Math.PI * radius * radius * height;
    }

    // Print Surface Area and Volume
    @Override
    public String toString() {
        return String.format("Cylinder: Surface Area: %.2f, Volume: %.2f", surface_area(), volume());
    }
}