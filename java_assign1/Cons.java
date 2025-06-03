public class Cons implements ImmutableList {
    // ---BEGIN INSTANCE VARIABLES---
    public final int head;
    public final ImmutableList tail;
    // ---END INSTANCE VARIABLES---

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    } // Cons

    public int sum() {
        return 0;
    }
    
    public ImmutableList append(final ImmutableList other) {
        return this;
    }
    
    public boolean contains(final int value) {
        return true;
    }

    // [3, 7, 2, 1].addAmount(2) => [5, 9, 4, 3]
    //
    // new Cons(3, new Cons(7, new Cons(2, new Cons(1, new Nil()))))
    public ImmutableList addAmount(final int amount) {
        // this: new Cons(3, new Cons(7, new Cons(2, new Cons(1, new Nil()))))
        //       [3, 7, 2, 1]
        // head: 3
        // tail: [7, 2, 1]
        // amount: 2

        ImmutableList recResult = tail.addAmount(amount);
        // recResult:       [9, 4, 3]

        int newHead = head + amount;
        // newHead: 5

        return new Cons(newHead, recResult);
        
        // return value: [5, 9, 4, 3]
    }
    
    // [6, 2, 4].length(): 3
    // ImmutableList myList =
    //   new Cons(6, new Cons(2, new Cons(4, new Nil())));
    // myList.length()
    public int length() {
        // Recursive case:
        // 1.) Need to make a recursive call
        // 2.) Need to make this call with something "smaller"
        //     than what I start with
        
        // head: 6
        // tail: new Cons(2, new Cons(4, new Nil())); [2, 4]
        // this: new Cons(6, new Cons(2, new Cons(4, new Nil()))): [6, 2, 4]
        int recLength = tail.length(); // [2, 4].length()

        // recLength: 2

        // What adjustment do I need to do to the return value to get
        // the final expected value?
        
        // return value: 3
        return recLength + 1;

        // return tail.length() + 1;
    }
    
    public boolean equals(final Object other) {
        if (other instanceof Cons) {
            final Cons otherCons = (Cons)other;
            return head == otherCons.head && tail.equals(otherCons.tail);
        } else {
            return false;
        }
    } // equals
    
    public String toString() {
        return "Cons(" + head + ", " + tail.toString() + ")";
    } // toString

    public int hashCode() {
        return sum();
    } // hashCode
} // Cons
