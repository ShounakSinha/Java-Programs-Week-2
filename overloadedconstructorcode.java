class baseClass {
    baseClass() {
        System.out.println("Ami base class");
    }

    baseClass(int x) {
        System.out.println("Ami base class with x");
    }
}

class derivedClass extends baseClass {
    derivedClass() {
        super(10);
        System.out.println("Eta derived class");
    }

    derivedClass(int x) {
        System.out.println("Eta derived class with x");
    }
}

class overloadedconstructorcode {
    public static void main(String args[]) {
        // baseClass bC= new naseClass();
        derivedClass dC = new derivedClass();
        derivedClass dC2 = new derivedClass(5);

    }
}
