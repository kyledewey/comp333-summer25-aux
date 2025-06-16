public abstract class Animal {
    public final String name;
    public Animal(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public abstract void speak();
}
