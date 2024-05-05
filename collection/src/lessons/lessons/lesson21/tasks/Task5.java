package lessons.lessons.lesson21.tasks;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

/**
 * Дан класс Person с полями firstName, lastName, age.
 * Вывести полное имя самого старшего человека,
 * у которого длина имени не превышает 15 символов.
 */
public class Task5 {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Петр", "Petrov", 25),
                new Person("Ivan", "Ivanov", 33),
                new Person("Kate", "Petrova", 20),
                new Person("Slava", "Slavikoc", 18),
                new Person("Arni", "Kutuzov", 56)
        );

        persons.stream()
                .filter(person -> person.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);

        Map<Integer, List<String>> collect = persons.stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getFullName, Collectors.toList())));

        Map<Integer, Person> collect1 = persons.stream().collect(toMap(Person::getAge, Function.identity()));

        System.out.println(collect1);


    }


    public static class Person {
        String firstName;
        String lastName;
        int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFullName() {
            return firstName + " " + lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}
