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


//    create a Person(name, age, position)
//    create an object that models a Company 1 manager, the rest are welders, carpenters, plummers
//        - getManager(): Person  - checks all persons and returns the one with position "manager"
//        - getPersons(String profession):List<Person>  - returns all the persons that have the received proffesion
//        - getPersonsOlder(int age): List<Person> - returns all the persons that are older than received age
//        - getPerson(String filterName):List<Person> - returns all the persons that have names that contains the received string
//        - employ(Person) - employs a person. Adds it to the list of persons