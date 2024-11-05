class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {  // Method overriding
        System.out.println("The dog is eating dog food.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Calls the overridden method in Dog
    }
}

