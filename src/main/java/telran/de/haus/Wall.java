package telran.de.haus;

public class Wall {
    private double square;
    private String material;

    public Wall(double square, String material) {
        this.square = square;
        this.material = material;
    }

    public Wall() {
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "square=" + square +
                ", material='" + material + '\'' +
                '}';
    }
    public void keepHome() {
        System.out.println("Держит дом");
    }
}
