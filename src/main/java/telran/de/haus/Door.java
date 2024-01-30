package telran.de.haus;

public class Door {
    private int thick;
    private String material;

    public Door(int thick, String material) {
        this.thick = thick;
        this.material = material;
    }

    public Door() {
    }

    public int getThick() {
        return thick;
    }

    public void setThick(int thick) {
        this.thick = thick;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void closeHome() {
        System.out.println("Защищает от воров");
    }
}
