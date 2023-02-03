package nullstuff;

public class CompareNull {
   public static void main(String[] args) {
       Boolean foo = null;
        if (foo == Boolean.FALSE) {
            System.out.println("foo = " + foo + " == FALSE");
        } else {
            System.out.println("foo = " + foo + " != FALSE");
        }
    }
}
