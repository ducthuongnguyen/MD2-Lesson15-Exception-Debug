package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a:");
            int a = input.nextInt();
            System.out.println("Enter b: ");
            int b = input.nextInt();
            System.out.println("Enter c: ");
            int c = input.nextInt();
            IllegalTriangleException.checkTriangle(a,b,c);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        input.close();
    }
}
