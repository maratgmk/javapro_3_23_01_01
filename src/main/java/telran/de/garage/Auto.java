package telran.de.garage;
/*
3) Есть класс Авто со свои набором характеристик и поведения.
Подумайте, какие ресурсы класса Авто могут доступны только Автомеханику, а какие простому Водителю.
Создайте интерфейсы Автомеханик и Водитель, и с их помощью разделите доступ к методам класса Авто.
 */
public class Auto implements Mechanic, Driver{
    private long distance;
    private double levelOil;
    private double levelBreakLiquid;
    private  double pressureTyre;

    public Auto(long distance, double levelOil, double levelBreakLiquid, double pressureTyre) {
        this.distance = distance;
        this.levelOil = levelOil;
        this.levelBreakLiquid = levelBreakLiquid;
        this.pressureTyre = pressureTyre;
    }

    @Override
    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    @Override
    public double getLevelOil() {
        return levelOil;
    }

    @Override
    public void setLevelOil(double levelOil) {
        this.levelOil = levelOil;
        System.out.println("Уровень масла в порядке " + levelOil);
    }

    @Override
    public double getLevelBreakLiquid() {
        return levelBreakLiquid;
    }

    @Override
    public void setLevelBreakLiquid(double levelBreakLiquid) {
        this.levelBreakLiquid = levelBreakLiquid;
        System.out.println("Уровень тормозной жидкости в норме " + levelBreakLiquid);
    }

    @Override
    public double getPressureTyre() {
        return pressureTyre;
    }

    @Override
    public void setPressureTyre(double pressureTyre) {
        this.pressureTyre = pressureTyre;
        System.out.println("Уровень давления в шинах в норме " + pressureTyre);
    }

    public void checkEngine() {
        System.out.println("Проверка и ремонт двигателя");
    }
    public void runAuto() {
        System.out.println("Управлять движением");
            }
}
