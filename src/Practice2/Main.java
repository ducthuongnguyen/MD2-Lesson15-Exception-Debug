package Practice2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] arr = arrayExample.createRandom();

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the index of random element: ");
        int x = input.nextInt();
        try {
            System.out.println("The value of element at index "+x+" is: "+ arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("The index you entered is out of array limitation.");
        }
        System.out.println("finished!");
    }
}
