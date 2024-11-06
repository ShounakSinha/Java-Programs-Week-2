class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        super.eat(); // Calls the superclass (Animal's) eat method
        System.out.println("The dog is eating dog food.");//what happens is both the eat of super class and the current eat is called
    }
}

public class animalinheritance_methodoverriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}
