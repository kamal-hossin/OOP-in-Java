abstract class Animal {

    abstract void animalSound();
}

class Dog extends Animal {

    void animalSound() {
        System.out.println("Dog says bow wow");
    }
}

public class abstraction {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.animalSound();
    }
}