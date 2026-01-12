package session12.smallThings;

public abstract class Parent {
    abstract void message();
}

class subClass1 extends Parent{
    @Override
    void message() {
        System.out.println("This is the first subclass");
    }
}

class subClass2 extends Parent{
    @Override
    void message(){
        System.out.println("This is the second subclass");
    }
}

class main{
    static void main(String[] args) {
        subClass1 subClass1 = new subClass1();
        subClass2 subClass2 = new subClass2();

        subClass1.message();
        subClass2.message();
    }
}