package telran.de.translation;

public class InterpreterEngFr extends Translator{
    public InterpreterEngFr(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public void translate() {
        System.out.println("Переводит с английского на французский");
    }

}
