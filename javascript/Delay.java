public class Delay implements Function {
    public final int x;
    public Delay(final int x) {
        this.x = x;
    }
    public int execute(int y) {
        return x + y;
    }
}
