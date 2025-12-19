package session10;

public class Animal {

    public Animal() {
    }

    public void sound(){
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal{

    public Dog(){
    }
    public void sound(){
        System.out.println("Bark");
    }
}

class Cat extends Animal{

    public Cat(){
    }
    public void sound(){
        System.out.println("Meow");
    }
}

class Wolf extends Animal{

    public Wolf(){
    }
    public void sound(){
        System.out.println("How");
    }
}
class TestAnimal{
    static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.sound();
        Cat cat1 = new Cat();
        cat1.sound();
        Wolf wolf1 = new Wolf();
        wolf1.sound();
    }
}