package datatypes;

import java.util.ArrayList;

class Student {

  int marks;
}

public class TestClass3 {

  static var getHighest(var students) {
    int highest = 0;
    for (var student : students) {
      if (highest < student.marks) highest = student.marks;
    }
    return highest;
  }

  public static void main(String[] args) {
    var student = new Student();

    var allStudents = new ArrayList<Student>();

    allStudents.add(student);

    var h = getHighest(allStudents);

    System.out.println(h);
  }
}
