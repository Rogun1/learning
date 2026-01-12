package session12.smallThings;

public abstract class Bank {
    abstract void getBalance();
}

class bankA extends Bank{
    private int balance;

    bankA(int balance){
        this.balance = balance;
    }

    public void getBalance(){
        System.out.println("Balance: " + balance + "$");
    }
}

class bankB extends Bank{
    private int balance;

    bankB(int balance){
        this.balance = balance;
    }

    public void getBalance(){
        System.out.println("Balance: " + balance + "$");
    }
}

class bankC extends Bank{
    private int balance;

    bankC(int balance){
        this.balance = balance;
    }

    public void getBalance(){
        System.out.println("Balance: " + balance + "$");
    }
}

class Main{
    static void main(String[] args) {
        bankA bankA = new bankA(100);
        bankB bankB = new bankB(150);
        bankC bankC = new bankC(200);

        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();
    }
}