public class Main {
    public static Function delayedAdd(int x) {
        return new Delay(x);
    }
    
    public static void main(String[] args) {
        Function add2 = delayedAdd(2);
        Function add3 = delayedAdd(3);
        System.out.println(add2.execute(3));
        System.out.println(add3.execute(4));
    }
}
