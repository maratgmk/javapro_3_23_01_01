package telran.de.haus;
/*
2) Есть класс Дом и в нем живет много объектов типа Житель.
У Дома так же есть объекты Крыша, Стены, Окна, Двери.
Создайте класс для сущности Дом и ассоциированные с ни объекты, входящий в него.
Подумайте какие из них агрегируются с домом, а какие связаны отношением Композиция.
 */
public class Dom {
    private String address;
    private int countResident = 0;

    public Dom() {
    }

    public Dom(String address, int countResident) {
        this.address = address;
        this.countResident = countResident;
    }
    public void takeToLive(int count) {
        countResident = countResident + count;
        System.out.println("Поселилось человек " + count + " стало жить человек " + countResident);
    }
    public void goOutToLive(int count) {
        countResident = countResident - count;
        System.out.println("Выехало человек " + count + " стало жить человек " + countResident);
    }

    public String getAddress() {
        return address;
    }

    public int getCountResident() {
        return countResident;
    }

    public void setCountResident(int countResident) {
        this.countResident = countResident;
    }

    public void containInDom() {
        System.out.println("Количество людей " + countResident + " живут по адресу : " + address);
    }

    @Override
    public String toString() {
        return "Dom{" +
                "address='" + address + '\'' +
                ", countResident=" + countResident +
                '}';
    }
}
