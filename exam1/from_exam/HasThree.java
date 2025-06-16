public class HasThree implements HasElements {
    private String someString;
    private int someInt;
    public HasThree(String someString, int someInt, boolean someBoolean) {
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

