package telran.de.translation;

public class SampleTranslator {
    public static void main(String[] args) {
        InterpreterEngFr interpreterEngFr1 = new InterpreterEngFr("Green", 39, Gender.FEMALE);
        System.out.println(interpreterEngFr1);
        interpreterEngFr1.translate();
        InterpreterEngGer interpreterEngGer1 = new InterpreterEngGer("Blue", 49, Gender.UNKNOWN);
        System.out.println(interpreterEngGer1);
        interpreterEngGer1.translate();
        Translator translator1 = new InterpreterEngFr("Yellow", 28, Gender.TRANS);
        System.out.println(translator1);
        translator1.translate();

    }



}
