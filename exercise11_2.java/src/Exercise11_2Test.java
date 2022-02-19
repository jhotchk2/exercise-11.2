import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise11_2Test {

  @Test
  void testMain() {
    Person person = new Person("Jack");
    Student student = new Student("Nick");
    Employee employee = new Employee("Cole");
    Faculty faculty = new Faculty("Ian");
    Staff staff = new Staff("Scott");

    assertEquals("Person: Jack", person.toString());
    assertEquals("Student: Nick", student.toString());
    assertEquals("Employee: Cole", employee.toString());
    assertEquals("Faculty: Ian", faculty.toString());
    assertEquals("Staff: Scott", staff.toString());
  }

}
