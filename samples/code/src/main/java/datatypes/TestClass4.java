package datatypes;

import java.util.ArrayList;

public class TestClass4 {

  int i;

  public static void main(String[] args) {
    /*  testMethod();
    testMethod2();
    testMethod3();
    testMethod4(); */
    TestClass4 testClass4 = new TestClass4();
    testClass4.testMethod5();
  }

  private void testMethod5() {
    var values = new ArrayList<String>();

    values.sort((a, b) -> a.compareTo(b));

    values.forEach(System.out::println);
  }

  private static void testMethod4() {
    int rate = 10;
    float amount = 1 - rate / 100 * 1 - rate / 100;
  }

  private static void testMethod3() {
    String String = "string isa string";
    System.out.println(String.substring(3, 6));
  }

  public static void testMethod() {
    int rate = 10;
    int t = 5;
    double amount = 1000.0; // or float amount = 1000.0F;
    for (int i = 0; i < t; i++) {
      amount = amount * (1 - rate / 100);
    }
    System.out.println(amount);
  }

  public static void testMethod2() {
    String a = "java";
    char[] b = { 'j', 'a', 'v', 'a' };
    String c = new String(b);
    String d = a;

    if (a == d) System.out.println(1);

    //if (b == d) System.out.println(2);

    if (a == "java") System.out.println(3);

    if (a.equals(c)) System.out.println(4);
  }
}
/* 
This will not compile because String is a final class and final classes cannot be extended.
There are questions on this aspect in the exam and so you should remember that StringBuffer and StringBuilder are also final. All primitive wrappers are also final (i.e. Boolean, Character, Short, Integer, Byte etc).
java.lang.System is also final.

class MyString extends String{
    MyString(){ super(); }
 }

*/
