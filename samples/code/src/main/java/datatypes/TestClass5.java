package datatypes;

import java.util.ArrayList;
import java.util.Set;

public class TestClass5 {

    //var k = new Student(); //1


  private StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {

    TestClass5 class5 = new TestClass5();
    //class5.testMethod1();
    class5.testMethod4();
  }

  private void testMethod1() {
    System.out.println(3 + 5 * (9 - 7));

    double a = .2;

    var values = new ArrayList<String>();
    //values.sort((a, b) -> a.compareTo(b));

  }

  private void testMethod2() {
    var grossIncome = 1000;
    double taxRate = 0;
    taxRate = grossIncome > 18000 ? grossIncome <= 36000 ? .1 : .2 : 0;
  }

  private void testMethod3() {
    //var a = b = c = 100; INVALID

    //var a = 100, b = 10; INVALID
    //var a = b;

    //int a, b, c=100; VALID

    //int a, b, c; a = b = c = 100; VALID

    // int a=100, b, c; VALID

  }

  private void testMethod4() {
    Object t = new Integer(106);
    int k = ((Integer) t).intValue() / 10;
    System.out.println(k);

    System.out.println(100 / 9.9);

    System.out.println(100 / 10.0);

    System.out.println(100 / 10);

    System.out.println(3 + 100 / 10 * 2 - 13);
  }
}
