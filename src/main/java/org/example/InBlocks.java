package org.example;

public class InBlocks {
    public static void main(String[] args) {
        final A c = new C();
        new C();
        System.out.println(c.x);
        System.out.println(c.y);
    }
}

class A {
    Integer x;
    Integer y = 4;
    static Integer z;

    public A(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("=====");
        System.out.println("Class A constructor with parameters;");
        System.out.println("=====");
    }

    public A() {
        System.out.println("=====");
        System.out.println("Class A constructor without parameters;");
        System.out.println("=====");
        System.out.println(y);
        y = 5;
    }

    {
        x = 4;
        System.out.println("=====");
        System.out.println("Class A instance initialization block;");
        System.out.println("=====");
    }

    static {
        System.out.println("=====");
        System.out.println("Class A static initialization block;");
        System.out.println("=====");
    }
}

class B extends A {
    public B(int x, int y) {
        super(x, y);
        System.out.println("=====");
        System.out.println("Class B constructor with parameters;");
        System.out.println("=====");
    }

    public B() {
        System.out.println("=====");
        System.out.println("Class B constructor without parameters;");
        System.out.println("=====");
    }


    {
//        x = 5;
        System.out.println("=====");
        System.out.println("Class B instance initialization block;");
        System.out.println("=====");
    }

    static {
        System.out.println("=====");
        System.out.println("Class B static initialization block;");
        System.out.println("=====");
    }

}

class C extends B {
    public C(int x, int y) {
        super(x, y);
        System.out.println("=====");
        System.out.println("Class C constructor with parameters;");
        System.out.println("=====");
    }

    public C() {
        System.out.println("=====");
        System.out.println("Class C constructor without parameters;");
        System.out.println("=====");
    }

    {
//        x = 6;
        System.out.println("=====");
        System.out.println("Class C instance initialization block;");
        System.out.println("=====");
    }

    static {
        System.out.println("=====");
        System.out.println("Class C static initialization block;");
        System.out.println("=====");
        z = 4;
        System.out.println("Z === " + z);
    }
}
