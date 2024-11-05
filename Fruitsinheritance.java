import java.util.Scanner;

class Fruit {
    private String fruitName = "";
    private int fruitWeight = 0;

    void setFruitName(String n) {
        fruitName = n;
    }

    String getFruitName() {
        return fruitName;
    }

    void setFruitWeight(int w) {
        fruitWeight = w;
    }

    int getFruitWeight() {
        return fruitWeight;
    }

}

// inheritance
class Mango extends Fruit {
    private String mangoType = "";

    void setMangoType(String t) {
        mangoType = t;
    }

    String getMangoType() {
        return mangoType;
    }
}

class mainfruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mango m = new Mango();

        System.out.print("Enter fruit name: ");
        m.setFruitName(scanner.nextLine());

        System.out.print("Enter fruit weight: ");
        m.setFruitWeight(scanner.nextInt());
        scanner.nextLine(); // consume the newline

        System.out.print("Enter mango type: ");
        m.setMangoType(scanner.nextLine());

        System.out.println("Fruit Name: " + m.getFruitName());
        System.out.println("Fruit Weight: " + m.getFruitWeight());
        System.out.println("Mango Type: " + m.getMangoType());

        scanner.close();
    }
}
