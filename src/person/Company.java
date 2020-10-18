package person;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Person> persons;

    public Company(List<Person> persons) {
        this.persons = new ArrayList<>(persons);
    }

    public Person getManager() {
        for (Person person : persons) {
            if (person.getPosition().equalsIgnoreCase("manager")) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getPersonsOfProfession(String profession) {
        List<Person> personWithProfession = new ArrayList<>();
        for (Person person : persons) {
            if (person.getProfession().equalsIgnoreCase(profession)) {
                personWithProfession.add(person);
            }
        }
        return personWithProfession;
    }

    public List<Person> getPersonsOlder(int age) {
        List<Person> personsOlder = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > age) {
                personsOlder.add(person);
            }
        }
        return personsOlder;
    }

    public List<Person> getPersonFiltered(String filterName) {
        List<Person> personFiltered = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().toLowerCase().contains(filterName.toLowerCase())) {
                personFiltered.add(person);
            }
        }
        return personFiltered;
    }

    public void employ(Person person) {
        persons.add(person);
    }

    public List<Person> getAllThePersons() {
        return persons;
    }
}
