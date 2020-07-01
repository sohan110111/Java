
public class Methods {
    static void myMethods() {
        System.out.println("I just got executed.");
    }
    public static void main(String[] args) {
        myMethods(); // output = I just got executed 
        // now call a method can also multiple times code reuse 
        myMethods();
        myMethods();
    }
}
