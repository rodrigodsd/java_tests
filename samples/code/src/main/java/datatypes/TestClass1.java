package datatypes;

/**
 * What will be the output of the following class:

    public class TestClass{

        public void testRefs(String str, StringBuilder sb){
            str = str + sb.toString();
            sb.append(str);
            str = null;
            sb = null;
        }
        public static void main(String[] args){
            String s = "aaa";
            StringBuilder sb = new StringBuilder("bbb");
            new TestClass().testRefs(s, sb);
            System.out.println("s="+s+" sb="+sb);
        }
    }
 */

public class TestClass1 {

    public void testRefs(String str, StringBuilder sb1){ // It is receiving a pointer
        str = str + sb1.toString(); //String is unmutable and it will create a new String instance
        sb1.append(str);
        str = null;
        sb1 = null; // This will remove the reference for the object in  heap memory only for sb1
    }
    public static void main(String[] args){
        String s = "aaa";
        StringBuilder sb = new StringBuilder("bbb");
        new TestClass1().testRefs(s, sb);
        System.out.println("s="+s+" sb="+sb);
    }
    
}
