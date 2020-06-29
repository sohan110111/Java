public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.max(5, 6)); // 6
        System.out.println(Math.min(5, 6)); // 2.23606797749979
        System.out.println(Math.sqrt(5)); // 25
        System.out.println(Math.abs(-3.1416)); // 3.1416 
        System.out.println(Math.random()); // This method given output between 0.0(inclusive), and 1.0(exclusive) like : 0.3508128363488753

        // Now control the random number 
        System.out.println((int)(Math.random() * 10)); // Here given output = 0 to 9
        
    }
}