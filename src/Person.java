public class Person {
    private static int id = 1;
    private int id_gen;
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public Person() {
        this.id_gen = id++;
    }

    public Person(String name, String surname, int age, boolean gender) {
        this();
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id_gen;
    }

    @Override
    public String toString() {
        String gen = gender ? "Male" : "Female";
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " + gen;
    }
}