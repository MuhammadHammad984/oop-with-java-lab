package week12;

interface InterfaceA {

    int value = 50;

    default void show() {
        System.out.println("InterfaceA show method");
        System.out.println("Value = " + value);
    }
}