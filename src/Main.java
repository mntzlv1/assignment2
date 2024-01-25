
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Employee 1:");
        System.out.print("Name: ");
        String emp1Name = scanner.nextLine();
        System.out.print("Surname: ");
        String emp1Surname = scanner.nextLine();
        System.out.print("Position: ");
        String emp1Position = scanner.nextLine();
        System.out.print("Salary: ");
        double emp1Salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Employee 2:");
        System.out.print("Name: ");
        String emp2Name = scanner.nextLine();
        System.out.print("Surname: ");
        String emp2Surname = scanner.nextLine();
        System.out.print("Position: ");
        String emp2Position = scanner.nextLine();
        System.out.print("Salary: ");
        double emp2Salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Student 1:");
        System.out.print("Name: ");
        String stu1Name = scanner.nextLine();
        System.out.print("Surname: ");
        String stu1Surname = scanner.nextLine();
        System.out.print("GPA: ");
        double stu1Gpa = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Student 2:");
        System.out.print("Name: ");
        String stu2Name = scanner.nextLine();
        System.out.print("Surname: ");
        String stu2Surname = scanner.nextLine();
        System.out.print("GPA: ");
        double stu2Gpa = scanner.nextDouble();
        scanner.nextLine();

        peopleList.add(new Employee(emp1Name, emp1Surname, emp1Position, emp1Salary));
        peopleList.add(new Employee(emp2Name, emp2Surname, emp2Position, emp2Salary));
        peopleList.add(new Student(stu1Name, stu1Surname, stu1Gpa));
        peopleList.add(new Student(stu2Name, stu2Surname, stu2Gpa));

        Collections.sort(peopleList);

        printData(peopleList);
    }
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}



//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;

//public class Main {
  //  public static void printData(Iterable<Person> people) {
    //    for (Person pers :people) {
      //      System.out.println(pers + " earns " + pers.getPaymentAmount() + " tenge");
        //}
    //}
    //public static void main(String[] args) {
     //   List<Person> people = new ArrayList<>();
       // people.add(new Employee("Daulet","Kantai","SoftwareEngineer",10000.0d));
        //people.add(new Employee("Bakthybek","Begimkulov","Driver",6969.69d));
        //people.add(new Student("Jake","Jonathan",3.8));
        //people.add(new Employee("Belka" , "Strelka", "Austronaut", 1000000));
        //Collections.sort(people);
        //printData(people);
    //}
//}