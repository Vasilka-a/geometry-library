package geometry.threeDimensional;

public class Cube {
    private final double side;

    public Cube(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be positive");
        }
        this.side = side;
    }

    public double getVolume() {
        return Math.pow(side, 3);
    }

    public double getSurfaceArea() {
        return 6 * side * side;
    }

    public void displayInfo(){
        System.out.println("Cube: ");
        System.out.println("Volume: " + getVolume());
        System.out.println("Surface area: " + getSurfaceArea());
    }
}
