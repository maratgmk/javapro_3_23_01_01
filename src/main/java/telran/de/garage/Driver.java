package telran.de.garage;

public interface Driver {
    void runAuto();
    long getDistance();
    double getLevelOil();
    void setLevelOil(double levelOil);
    double getPressureTyre();
    void setPressureTyre(double pressureTyre);

}
