package person;

import java.util.List;

public class PersonMain {
    public static void main(String[] args) {


        List<Person> personList = List.of(
                new Person("BELA", 24, "plumber"),
                new Person("Marius", 40, "manager", "master"),
                new Person("Dan", 54, "carpenter", "woodworker"),
                new Person("Daniela", 34, "welder")
        );

        Company company = new Company(personList);

        System.out.println(company.getManager());

        System.out.println(company.getPersonsOfProfession("woodworker"));

        System.out.println(company.getPersonsOlder(36));

        System.out.println(company.getPersonFiltered("ELa"));

        company.employ(new Person("Ion",123,"mechanic"));

        System.out.println(company.getAllThePersons());

    }
}
