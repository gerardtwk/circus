public class Duck extends Bird {
    @Override
    public String speak() {
        return "Quack Quack";
    }

    @Override
    public String toString() {
        return "I'm a Duck in the in-lecture branch";
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }
}
