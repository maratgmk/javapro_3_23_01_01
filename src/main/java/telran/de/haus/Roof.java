package telran.de.haus;

public class Roof {
    private String material;
    private double square;

    public Roof(String material, double square) {
        this.material = material;
        this.square = square;
    }

    public Roof() {
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Roof{" +
                "material='" + material + '\'' +
                ", square=" + square +
                '}';
    }
    public void protectHome() {
        System.out.println("Защищает от дождя");
    }
}
