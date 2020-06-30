public class IfElse {
    public static void main(String[] args) {
        int x = 10, y = 11;
        if (x < y) { // Here the logical condition from mathematics is alright then execute next statement 
            System.out.println("10 is less than 11.");
        }

        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good Evening.");
        } // Output shows Good Evening

        int time2 = 22;
        if (time2 < 18) {
            System.out.println("First condition is executed.");
        } else if (time2 > 20) { // Note : else if is one kind of conditional statement generator  
            System.out.println("2nd condition is executed");
        } else {
            System.out.println("Otherwise the last statement is executed.");
        }

        // Ternary Operator that means it consist of three operands. It's work a simple if else statement write in a single line 
        System.out.println((8 < 12) ? "Condition true executed." : "False condition executd.");
        // Syntax of ternary operator (condition) ? Expression true : Expression false
    }
}