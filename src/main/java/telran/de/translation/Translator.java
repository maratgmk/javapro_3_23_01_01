package telran.de.translation;
/*
1) Есть абстрактный класс Переводчик, который имеет характеристики имя, возраст, пол и умеет переводить с одного языка на другой.
Реализовать данный класс и создать несколько классов различных переводчиков с одного языка на другой.
Например с английского на русский, с русского на немецки и т.п.
Продумайте какова архитектура наследования будет в данном приложении.
 */
public abstract class Translator {
    private String name;
    private int age;
    private Gender gender;

    public Translator(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Translator() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public abstract void translate();

    @Override
    public String toString() {
        return "Translator{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
