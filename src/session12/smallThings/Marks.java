package session12.smallThings;

public abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks{
    private int a,b,c;

    public A(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    double getPercentage() {
        return ((double) (a + b + c) / 300) * 100;
    }
}

class B extends Marks{
    private int a,b,c,d;

    public B(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    @Override
    double getPercentage() {
        return ((double) (a + b + c + d) / 400) * 100;
    }
}

class ResultMarks{
    static void main(String[] args) {
        A studentA = new A(80,90,70);
        B studentB = new B(10,20,40,70);

        System.out.println((int)studentA.getPercentage() + "%");
        System.out.println((int)studentB.getPercentage() + "%");
    }
}