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

    // Getter and Setter for breed
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

// Cat subclass that extends Animal
class Cat extends Animal {
    private String color;

    // Constructor for Cat
    public Cat(String name, int age, String color) {
        super(name, age); // Calls the Animal constructor
        this.color = color;
    }

    // Overridden sound method to provide Cat-specific behavior
    @Override
    public void sound() {
        System.out.println(getName() + " says: Meow Meow!");
    }

    // Cat-specific behavior
    public void purr() {
        System.out.println(getName() + " is purring.");
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


// Main class to manage pets and demonstrate polymorphism
public class PetManagementSystem {
    public static void main(String[] args) {
        // Creating instances of Dog and Cat using polymorphism
        Animal pet1 = new Dog("Buddy", 3, "Golden Retriever");
        Animal pet2 = new Cat("Whiskers", 2, "Gray");

        // Displaying pet information and sounds
        displayPetInfo(pet1);
        displayPetInfo(pet2);

        // Demonstrating the use of subclass-specific methods with casting
        if (pet1 instanceof Dog) {
            ((Dog) pet1).bark(); // Casting pet1 to Dog type
        }

        if (pet2 instanceof Cat) {
            ((Cat) pet2).purr(); // Casting pet2 to Cat type
        }

        // Using getter and setter methods
        pet1.setAge(4); // Changing age using setter
        System.out.println("Updated age of " + pet1.getName() + ": " + pet1.getAge());

        // Using the eat method to show inheritance and method overriding
        pet1.eat(); // Calls Animal's eat() method
        pet2.eat(); // Calls Animal's eat() method
    }

    // A method to display pet information using polymorphism
    public static void displayPetInfo(Animal animal) {
        System.out.println("Pet Info:");
        System.out.println("Name: " + animal.getName());
        System.out.println("Age: " + animal.getAge());
        animal.sound(); // Polymorphic call
    }
}



    

