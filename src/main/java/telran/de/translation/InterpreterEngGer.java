package telran.de.translation;

public class InterpreterEngGer extends Translator{
    public InterpreterEngGer(String name, int age, Gender gender) {
        super(name, age, gender);
    }


    @Override
    public void translate() {
        System.out.println(" Переводит с английского на немецкий");

    }


}
