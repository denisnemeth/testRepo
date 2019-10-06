package sk.itsovy.other;

public class FreeClass {
    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayNHello(int n) {
        int i=1;
        while (i<=n)
        {
            System.out.print("Hello! ");
            i++;
        }
        System.out.println();
    }
    public void sayHi() {
        System.out.println("Hi!");
    }
    public void sayNHi(int n) {
        int j=1;
        while (j<=n)
        {
            System.out.print("Hi! ");
            j++;
        }
        System.out.println();
    }
    public int changeToEvenNum(int x) {
        if (x % 2 != 0) {
            return x + 1;
        } else {
            return x;
        }
    }
    //public double loanYears(int month, double interest, int amount) {
    //}
}
