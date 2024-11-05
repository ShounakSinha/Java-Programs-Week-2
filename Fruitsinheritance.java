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
