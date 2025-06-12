public class Main {
    public static Lock makeInitialLock() {
        // subtyping polymorphism - UnlockedLock
        // and LockedLock are a specific types of Lock.
        // Happens at compile-time.
        if (randomBoolean()) {
            return new UnlockedLock();
        } else {
            return new LockedLock();
        }
    }
    
    public static void main(String[] args) {
        Lock lock1 = makeInitialLock();

        // ad-hoc polymorphism - the lock() method called is
        // dependent on lock1's runtime type.  Runtime.
        Lock lock2 = lock1.lock();
    }
}
