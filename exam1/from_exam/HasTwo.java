public class HasTwo implements HasElements {
    private String someString;
    private int someInt;
    public HasTwo(String someString, int someInt) {
        this.someString = someString;
        this.someInt = someInt;
    }

    public String getFirst() {
        return someString;
    }

    public int getSecond() {
        return someInt;
    }
}
