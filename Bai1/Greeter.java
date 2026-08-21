package Bai1;

public record Greeter(String name) {
    public void greet() {
        System.out.println("Hello, " + name);
    } 
}
