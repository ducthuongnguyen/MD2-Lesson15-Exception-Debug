package Practice3;

public class CalculationExample {
    static void calculate(int x, int y){
        try {
            int sum = x+y;
            int minus = x-y;
            int multiple = x*y;
            int division = x/y;
            System.out.println("Sum of x+y: " +sum);
            System.out.println("Minus of x & y: "+minus);
            System.out.println("Multiple of x & y: "+multiple);
            System.out.println("Division of x/y: "+division);
        }
        catch (Exception e){
            System.err.println("Inccur exception: "+ e.getMessage());
        }
    }
}
