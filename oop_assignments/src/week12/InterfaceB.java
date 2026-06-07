package week12;

interface InterfaceB {

    int value = 200;

    default void show() {
        System.out.println("InterfaceB show method");
        System.out.println("Value = " + value);
    }
}