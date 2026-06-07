package week12;

class Dog implements Animal, Pet {

    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}