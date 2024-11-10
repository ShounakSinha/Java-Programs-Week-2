// Base class Animal
abstract class Animal {
    // Private fields to illustrate access modifiers and encapsulation
    private String name;
    private int age;

    // Constructor for Animal
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method to be implemented by subclasses
    public abstract void sound();

    // A general method for animals that can be overridden
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Dog subclass that extends Animal
class Dog extends Animal {
    // Additional property specific to Dog
    private String breed;

    // Constructor that uses super to call the superclass constructor
    public Dog(String name, int age, String breed) {
        super(name, age); // Calls the Animal constructor
        this.breed = breed;
    }

    // Overridden sound method to provide Dog-specific behavior
    @Override
    public void sound() {
        System.out.println(getName() + " says: Woof Woof!");
    }

    // Dog-specific behavior
    public void bark() {
        System.out.println(getName() + " is barking.");
    }

    

