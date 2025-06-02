public class Nil implements ImmutableList {
    public Nil() {}

    // [].addAmount(7) =>
    // []
    public ImmutableList addAmount(final int amount) {
        // return new Nil();
        return this;
    }
        
    public int length() {
        return 0;
    }
    
    public boolean equals(final Object other) {
        return other instanceof Nil;
    } // equals
    
    public String toString() {
        return "Nil";
    } // toString

    public int hashCode() {
        return 0;
    } // hashCode
} // Nil
    
