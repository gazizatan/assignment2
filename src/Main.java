import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();

        peopleList.add(new Employee("John", "Lennon", "Manager", 27045.78));
        peopleList.add(new Student("Ringo", "Starr", 2.5));
        peopleList.add(new Student("Paul", "McCartney", 3.0));
        peopleList.add(new Employee("George", "Harrison", "Developer", 50000.00));

        Collections.sort(peopleList);

        printData(peopleList);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.printf("%s earns %.2f tenge%n", person, person.getPaymentAmount());
        }
    }
}