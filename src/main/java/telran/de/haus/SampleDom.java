package telran.de.haus;

public class SampleDom {
    public static void main(String[] args) {
        Resident resident1 = new Resident("Green", 27, "Female");
        System.out.println(resident1);
        resident1.liveHome();
        Dom dom = new Dom("Berlin",17);
        dom.containInDom();
        dom.takeToLive(3);

        dom.containInDom();
        dom.goOutToLive(17);
        dom.containInDom();

        LivingHome livingHome = new LivingHome(new Wall(150.75,"Кирпич"),new Window(3.25,"Сосна")
                ,new Door(5,"Сталь"),new Roof("Черепица",250.7),new Dom("Dresden", 12));
        System.out.println(livingHome);
        livingHome.createLiving();


    }
}
