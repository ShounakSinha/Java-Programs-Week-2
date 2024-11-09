class A {
    void callme() {
        System.out.println("Inside A's callme method");
    }
}

class B extends A {
    void callme() {
        System.out.println("Inside B's callme method");
    }
}

class C extends A {
    void callme() {
        System.out.println("Inside C's callme method");
    }
}

public class dynamicmethoddispatch {
    public static void main(String[] args) {
        // A a = new A();
        // B b = new B();
        // C c = new C();
        // A r;
        // r = a;
        // r.callme();
        // r = b;
        // r.callme();
        // r = c;
        // r.callme();

        //this code snippet below is also a demonstration of dynamic method dispatch

        A a = new A();
        A b = new B();
        A c = new C();
        
        a.callme();
        b.callme();
        c.callme();
        
    }
    
}

