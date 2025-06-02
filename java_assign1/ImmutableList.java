public interface ImmutableList {
    public int length();
    public int sum(); // empty list sum is defined as 0
    public ImmutableList append(final ImmutableList other);
    public boolean contains(final int value);

    // [3, 7, 2, 1].addAmount(2) =>
    // [5, 9, 4, 3]
    //
    // [3].addAmount(5) =>
    // [8]
    //
    // [].addAmount(7) =>
    // []
    public ImmutableList addAmount(final int amount);
    
    public boolean equals(final Object other);
    public String toString();
    public int hashCode();
} // ImmutableList
