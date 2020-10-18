package person;

public class Person {
    private final String name;
    private final int age;
    private final String position;
    private final String profession;


    public Person(String name, int age, String position, String profession) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.profession = profession;
    }

    public Person(String name, int age, String position) {
        this(name, age, position, "");
    }

    public String getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}
