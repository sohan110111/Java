public class TypeCasting {
    public static void main(String[] args) {
        /* two different type casting : 
        Such as : widening type casting(it's automatically type casting) and narrowing type casting.
        Widening type casting : byte -> short -> int -> long -> float -> double 
        Narrowing type casting : vice versa of widening type casting*/
        
        // widening type casting 
        int myInt = 9;
        double myDouble = myInt; // automatically type casting  : int ot double
        System.out.println(myInt); // output = 9
        System.out.println(myDouble); // output = 9.0

        // Narrowing type casting 
        double doubleValue = 3.1416;
        int integerValue = (int) doubleValue; // manually type casting : Double to int 
        System.out.println(doubleValue); // 3.1416
        System.out.println(integerValue); // 3
    }
}