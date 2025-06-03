public class Nil implements ImmutableList {
    public Nil() {}

    // [].addAmount(7) =>
    // []
    public ImmutableList addAmount(final int amount) {
        // this: Nil
        // return new Nil();
        return this;
    }
        
    public int length() {
        return 0;
    }
    
    public int sum() {
        return 0;
    }
    
    public ImmutableList append(final ImmutableList other) {
        return this;
    }
    
    public boolean contains(final int value) {
        return true;
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
    
