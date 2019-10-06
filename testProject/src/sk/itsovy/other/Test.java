package sk.itsovy.other;

import java.util.Scanner;

public class Test {

    public void getInfo() {
        Scanner object1=new Scanner(System.in);

        /*System.out.println("Enter name: ");
        String name = object1.nextLine();

        System.out.println("Enter number: ");
        int value = object1.nextInt();

        System.out.println("Name is: " + name);
        System.out.println("Number is: " + value);*/

        String userName0="Denis";
        int password0=12345;

        System.out.println("Enter your username: ");
        String userName1=object1.nextLine();

        System.out.println("Enter your password: ");
        int password1=object1.nextInt();

        System.out.println("Username is: "+userName0);
        System.out.println("Password is: "+password0);
        System.out.println("Username is: "+userName1);
        System.out.println("Password is: "+password1);

        if (userName0==userName1 && password0==password1) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }

    public void triangle1() {
        for (int i=1; i<11; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void triangle2() {
        for (int i=1; i<11; i++) {
            for (int j=10; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void triangle3() {
        for (int i=1; i<11; i++) {
            for (int m=9; m>=i; m--) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void triangle4() {
        for (int i=1; i<11; i++) {
            for (int m=2; m<=i; m++) {
                System.out.print(" ");
            }
            for (int j=10; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void triangle5() {
        for (int i=2; i<16; i+=2) {
            for (int m=12; m>=i; m-=2) {
                System.out.print(" ");
            }
            for (int j=1; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rectangle1() {
        int i=8;
        for (int row=1; row<=i; row++) {
            System.out.print("#");
        }
        System.out.println();
        for (int column=i-2; column>0; column--) {
            System.out.print("#");
            for (int space=i-2; space > 0; space--) {
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println();
        }
        for (int row=1; row<=i; row++) {
            System.out.print("#");
        }
    }

    public void rectangle2() {
        for (int rows=1; rows<=8; rows++) {
            for (int columns=1; columns<=8; columns++)
                if (rows==1 || rows==8 || columns==1 || columns==8) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            System.out.println();
        }
    }

    public void digitSum(int n) {
        int sum=0;
        while (n!=0) {
            int c=n%10;
            sum+=c;
            n/=10;
        }
        System.out.println(sum);
    }

    public void task_1() {
        System.out.print("1)    ");
        for (int i=1000; i<10000; i++) {
            if (i%615==0) {
                System.out.print(i+" ");
            }
        }
    }

    public void task_2() {
        System.out.print("2)    ");
        for (int i=100; i<1000; i++) {
            int a=i/100;
            int b=(i/10)%10;
            int c=i%10;
            if (a>b && b>c) {
                System.out.print(i+" ");
            }
        }
    }

    public void task_3() {
        int sum=0;
        for (int i=10; i<100; i++) {
            if (i%3==0) {
                sum=sum+i;
            }
        }
        System.out.println("3)    "+sum);
    }

    public void task_4() {
        int j=1000000;
        int count=0;
        for (int i=1; i<j+1; i++) {
            if (j%i==0) {
                count++;
            }
        }
        System.out.println("4)    "+count);
    }

    public void task_5() {
        int a=45;
        int b=87;
        int c=37;
        int S=2*(a*b+a*c+b*c);
        int V=a*b*c;
        System.out.println("5)    S = "+S+"   V = "+V);
    }

    public void task_6() {
        System.out.print("6)    ");
        for (double i=10; i>=2; i=i-0.5) {
            if ((i*10)%10==0) {
                System.out.print((int) i+" ");
            } else {
                System.out.print(i+" ");
            }
        }
    }

    public void task_7() {
        int num=1;
        for (int i=7; i>0; i--) {
            num*=i;
        }
        System.out.print("7)    "+num);
    }

    public void task_8() {
        System.out.print("8)    ");
        for (int i=100; i<1000; i++) {
            if (i%2!=0 && i%27==0 && i%13!=0) {
                System.out.print(i+" ");
            }
        }
    }

    public void task_9() {
        System.out.print("9)    ");
        for (int i=1; i<10001; i++) {
            if (i%91==0) {
                System.out.print(i+" ");
            }
        }
    }

    public void task_10() {
        System.out.print("10)   ");
        for (int i=10000; i<100000; i++) {
            int a=i/10000;
            int b=(i/1000)%10;
            int d=(i/10)%10;
            int e=i%10;
            if (a==e && b==d) {
                System.out.print(i+" ");
            }
        }
    }
}
