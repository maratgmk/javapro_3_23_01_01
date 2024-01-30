package telran.de.haus;

public class LivingHome {
    Wall wall = new Wall();
    Window window = new Window();
    Door door = new Door();
    Roof roof = new Roof();
    Dom dom = new Dom();

    public LivingHome(Wall wall, Window window, Door door, Roof roof, Dom dom) {
        this.wall = wall;
        this.window = window;
        this.door = door;
        this.roof = roof;
        this.dom = dom;
    }

    public LivingHome() {
    }
    public void createLiving() {
        dom.containInDom();
        wall.keepHome();
        roof.protectHome();
        door.closeHome();
        window.giveLight();

    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public Dom getDom() {
        return dom;
    }

    public void setDom(Dom dom) {
        this.dom = dom;
    }

    @Override
    public String toString() {
        return "LivingHome{" +
                "wall=" + wall +
                ", window=" + window +
                ", door=" + door +
                ", roof=" + roof +
                ", dom=" + dom +
                '}';
    }
}


