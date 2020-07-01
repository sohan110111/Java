public class MethodParameters {
    static void myMethod(String FirstName) {
        System.out.println(FirstName + " Refsnes");
    }

    static void myMethod(String FirstName, int age) {
        System.out.println(FirstName + " is " + age);
    }

    static int myMethod(int x) {
        return x + 3;
    }

    static int myMethod(int x, int y) {
        return x + y;
    }

    // A method with if...else
    static void voteNoticed(int instantAge) {
        if (instantAge < 18) {
            System.out.println("You are denied to voted : Your age under 18.");
        } else {
            System.out.println("You are allowed to voted.");
        }
    }
    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");

        //Now method call with multiple arguments 
        myMethod("Liam", 20);
        myMethod("Jenny", 21);
        myMethod("Anja", 22);

        System.out.println(myMethod(5)); // output = 8
        System.out.println(myMethod(5, 3));

        int returnValue = myMethod(10, 15); // It's easier to maintain
        System.out.println(returnValue); // output = 25

        voteNoticed(24);
    }
}