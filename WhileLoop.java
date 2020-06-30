public class WhileLoop {
    public static void main(String[] args) {
        int i = 0; 
        while (i < 5) {
            System.out.println(i);
            i++; // i means iterable 
        }

        // do/while It's block of code executed 1 times then it checks while in condition then it's block of code  to be executed
        // now i = 5 is the latest value 
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }   
}