package week12;

class Demo implements InterfaceA, InterfaceB {

    @Override
    public void show() {
        InterfaceA.super.show();
        InterfaceB.super.show();
    }
}
