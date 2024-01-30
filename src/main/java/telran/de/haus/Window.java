package telran.de.haus;

public class Window{
    private double square;
    private String material;

    public Window(double square, String material) {
        this.square = square;
        this.material = material;
    }

    public Window() {
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
        return "Window{" +
                "square=" + square +
                ", material='" + material + '\'' +
                '}';
    }
    public void giveLight() {
        System.out.println("Пропускает свет в комнаты");
    }
}
