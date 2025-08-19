package Todaya_13_08_2025;

interface A {
    default void show() {
        int a = 3;
        int b = 3;
        int c = a + b;
        System.out.println(c);
    }
}

interface B {
    default void show() {
        int a = 3;
        int b = 3;
        int c = a - b;
        System.out.println(c);
    }
}

class Multiple implements A, B {
    // Must override to resolve conflict
    public void show() {
        A.super.show(); // Call A's version
        B.super.show(); // Call B's version
    }

    public void display() {
        System.out.println("This is display method");
    }

    public static void main(String[] args) {
        Multiple m = new Multiple();
        m.show();
        m.display();
    }
}
