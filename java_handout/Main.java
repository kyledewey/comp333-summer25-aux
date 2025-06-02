// Original code:
//
// boolean b = (randomBoolean()) ? true : false;
// if (b) {
//   System.out.println("foo");
// } else {
//   System.out.println("bar");
// }
//
public class Main {
    public static void main(String[] args) {
        Conditional c = (randomBoolean()) ? new Foo() : new Bar();
        c.operation();
    }
}

