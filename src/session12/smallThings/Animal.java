package session12.smallThings;

public abstract class Animal {
    abstract void cats();
    abstract void dogs();
}

//class Cat extends Animal{
//    @Override
//    void cats() {
//        System.out.println("Cats meow");
//    }
//}

//We must override the both methods from the abstract class, so in class Cat wont be proper to add a dog method.