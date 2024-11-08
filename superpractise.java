class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }
    public void eat(String food) {
        System.out.println("The animal is eating " + food + ".");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        //super.eat("Mutton"); // Calls the superclass (Animal's) eat method
        System.out.println("The dog is eating dog food.");
        // super.eat("Chicken");
        // super.eat();
    }
}

public class animalinheritance_methodoverriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}

