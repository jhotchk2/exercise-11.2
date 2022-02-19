public class Exercise11_2 {
  public static void main(String[] args) {

    Person person = new Person("Jack");
    Student student = new Student("Nick");
    Employee employee = new Employee("Cole");
    Faculty faculty = new Faculty("Ian");
    Staff staff = new Staff("Scott");

    System.out.println(person);
    System.out.println(student);
    System.out.println(employee);
    System.out.println(faculty);
    System.out.println(staff);

  }
}


/**
 * Creates a Person class with a name, address, phone number, and email address. Uses getName method
 * to return the name variable. Modifies the toString method
 */
class Person {
  String name;
  String address;
  String phone;
  String email;

  public Person() {
    this.name = "";
  }

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    return "Person: " + name;
  }
}


/**
 * Creates a Student class that extends the Person class with a status. Modifies the toString method
 */
class Student extends Person {
  String status;

  public Student(String name) {
    super(name);
  }

  public String toString() {
    return "Student: " + getName();
  }
}


/**
 * Creates a Employee class that extends the Person class with a office, salary, and a date hired.
 * Modifies the toString method
 */
class Employee extends Person {
  String office;
  int salary;
  java.util.Date dateHired;

  public Employee(String name) {
    super(name);
  }

  public String toString() {
    return "Employee: " + getName();
  }
}


/**
 * Creates a Faculty class that extends the Employee class with office hours and a rank. Modifies
 * the toString method
 */
class Faculty extends Employee {
  String officeHours;
  String rank;

  public Faculty(String name) {
    super(name);
  }

  public String toString() {
    return "Faculty: " + getName();
  }
}


/**
 * Creates a Staff class that extends the Employee class with a title. Modifies the toString method
 */
class Staff extends Employee {
  String title;

  public Staff(String name) {
    super(name);
  }

  public String toString() {
    return "Staff: " + getName();
  }
}
