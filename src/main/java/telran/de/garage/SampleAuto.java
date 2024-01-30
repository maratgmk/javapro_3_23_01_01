package telran.de.garage;

public class SampleAuto {
    public static void main(String[] args) {
        Auto auto = new Auto(56000,56.27,5.75,2.25);
        Mechanic mechanic = auto;
        System.out.println("Автомобиль проехал "+mechanic.getDistance()+",уровень тормозной жидкости "+mechanic.getLevelBreakLiquid());
        mechanic.setLevelBreakLiquid(6.25);
        mechanic.checkEngine();

        Driver driver = auto;
        System.out.println("Автомобиль проехал "+driver.getDistance()+",уровень масла "+driver.getLevelOil());
        driver.setLevelOil(3.5);
        driver.setPressureTyre(2.75);
        driver.runAuto();

    }



}
