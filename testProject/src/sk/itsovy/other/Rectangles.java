package sk.itsovy.other;

import java.util.Scanner;

public class Rectangles {

    public void rectangle3() {
        Scanner in=new Scanner(System.in);

        System.out.println("Number of rows: ");
        int rows = in.nextInt();
        System.out.println("Number of columns: ");
        int columns = in.nextInt();
        System.out.println("Character: ");
        char c = in.next().charAt(0);

        int x=rows, y=columns;

        for (; rows>0; rows--) {
            for (; columns>0; columns--) {
                System.out.print(c+" ");
            }
            columns+=y;
            System.out.println();
        }

        rows+=x;
        System.out.println();

        for (; rows>0; rows--) {
            for (; columns>0; columns--)
                if (rows==(x-x+1) || rows==x || columns==(y-y+1) || columns==y) {
                    System.out.print(c+" ");
                } else {
                    System.out.print("  ");
                }
            columns+=y;
            System.out.println();
        }
    }
}