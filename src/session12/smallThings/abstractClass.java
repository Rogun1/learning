package session12.smallThings;

public abstract class abstractClass {

    abstractClass(){
        System.out.println("This is constructor of abstract class");
    }

    abstract void a_method();

    void n_method(){
        System.out.println("This is a normal method of abstract class");
    }
}

class SubClasse extends abstractClass{

    @Override
    void a_method() {
        System.out.println("This is abstract method");
    }
}

class abstractMain{
    static void main(String[] args) {
        SubClasse subClas = new SubClasse();
        subClas.a_method();
        subClas.n_method();
    }
}