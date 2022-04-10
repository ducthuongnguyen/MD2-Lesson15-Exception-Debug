package Ex1;

public class IllegalTriangleException {

    static void checkTriangle(int a, int b, int c) throws TriangleEdgesException {

        if (a<0 || b<0 || c<0 || a+b<=c || a+c<=b || b+c<=a){
            throw new TriangleEdgesException("Error! The triangle is not valid!");
        }else {
            System.out.println("This is a triangle!");
        }
    }
}
