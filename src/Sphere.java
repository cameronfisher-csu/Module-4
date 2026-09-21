public class Sphere extends Shape{
    private double radius;

    // Public Constructor
    public Sphere(double radius){
        this.radius = radius;
    }

    // Calculate Surface Area
    @Override
    protected double surface_area() {
        return 4 * Math.PI * radius * radius;
    }

    // Calculate Volume
    @Override
    protected double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    // Print Surface Area and Volume
    @Override
    public String toString() {
        return String.format("Surface Area: %.2f, Volume: %.2f", surface_area(), volume());
    }
}
