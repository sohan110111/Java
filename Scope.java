public class Scope {
    public static void main(String[] args) {
        
        // here can not accessible below of x value
        // System.out.println(x); //this line of code will become error location: class Scope
        // here have any block of code (like : if, while, else if, for etc ) they are not access value of x
        int x = 100;
        // Now below line of code can be access of value x
        System.out.println(x);


    }
}