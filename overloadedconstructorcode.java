class baseClass{
    baseClass(){
        System.out.println("Ami base class");
    }
}

class derivedClass extends baseClass{
    derivedClass
}


class overloadedconstructorcode {
    public static void main(String args[]) {
        // baseClass bC= new naseClass();
        derivedClass dC = new derivedClass();
        derivedClass dC2 = new derivedClass(5);

    }
}
