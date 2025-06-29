package geometry.threeDimensional;

public class Cylinder {
    private final double radius;
    private final double height;

    public Cylinder(double radius, double height) {
        if (radius <= 0 || height <= 0) {
            throw new IllegalArgumentException("Radius and height must be positive");
        }
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    public void displayInfo(){
        System.out.println("Cylinder: ");
        System.out.println("Volume: " + getVolume());
        System.out.println("Surface area: " + getSurfaceArea());
    }
}
