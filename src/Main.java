import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void printData(Iterable<Person> people) {
        for (Person pers :people) {
            System.out.println(pers + " earns " + pers.getPaymentAmount() + " tenge");
        }
    }
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Employee("Daulet","Kantai","SoftwareEngineer",10000.0d));
        people.add(new Employee("Bakthybek","Begimkulov","Driver",6969.69d));
        people.add(new Student("Jake","Jonathan",3.8));
        people.add(new Employee("Belka" , "Strelka", "Austronaut", 1000000));
        Collections.sort(people);
        printData(people);

    }
}