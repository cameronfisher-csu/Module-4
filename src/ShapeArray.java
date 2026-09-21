public class ShapeArray {
    public static void main(String[] args) {

        // Instantiate one sphere
        Sphere sphere = new Sphere(10);

        // Instantiate one cylinder
        Cylinder cylinder = new Cylinder(10, 10);

        // Instantiate one cone
        Cone cone = new Cone(10, 10);

        // Store objects in an array
        Shape[] shapeArray = {sphere, cylinder, cone};

        // Loop through the array and print each object's data
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}