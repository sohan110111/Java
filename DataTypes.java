public class DataTypes {
    public static void main(String[] args) {

        int x = 5, y = 6;
        System.out.println(x + y);

        int myNum = 5;
        System.out.println(myNum);

        float myFloatNum = 'D';
        System.out.println(myFloatNum);

        char myLetter = 'D';
        System.out.println(myLetter);

        boolean myBool = true;
        System.out.println(myBool);

        String myText = "Hello";
        System.out.println(myText);

        // Primitive data types : byte, short, int, long, float, double, boolean and char
        // Non-primitive data types : String, Arrays, Classes etc.
        // byte = 1 byte, short = 2 bytes, int = 4 bytes, long = 8 bytes, float = 4 bytes, double = 8 bytes, boolean = 1 bit, char = 2 bytes;

        byte byteValue = 100; // It can store integer numbers from -128 to 127
        System.out.println(byteValue);

        short shortValue = 5000; // It can stor integer -32768 to 32767
        System.out.println(shortValue);

        int integerValue = 100000; // -2147483648 to 2147483647
        System.out.println(integerValue);

        long longValue = 15000000000L; // -9223372036854775808 to 9223372036854775807 (Note that should end the value with an "L")
        System.out.println(longValue);

        float floatValue = 5.57f; // 3.4e-038 to 3.4e+038 (Note that should end the value with an "f")
        // here "e" to indicate the power of 10
        System.out.println(floatValue); 
        
        double doubleValue = 19.99d; // 1.7e-308 to 1.7e+308 (Note that should end the value with a "d")
        System.out.println(doubleValue);

        /* The precision  of float is only six or seven decimal digits, 
        while double variables have a precision of about 15 digits. */
        
        // #Scientific numbers 
        float f1 = 35e3f; // 35 times 10 to the power  3
        System.out.println(f1); // 35000.0
        double d1 = 12E4d; // or understand that  12 * Math.pow(10, 4); or {12 * (10*10*10*10)}
        System.out.println(d1); // 120000.0

        // boolean values are mostly use for conditional tasting  
        boolean isJavaFun = true;
        System.out.println(isJavaFun);
        boolean isFishTasty = false;
        System.out.println(isFishTasty);
        
        char myGrade = 'B';
        System.out.println(myGrade);

        char a = 65, b = 66, c = 67;
        //System.out.println(a + b + c); //output = 198
        System.out.println(a + " " + b + " " + c); // output = A B C (Here show ascii value)

        // Now string data types is used to store text
        String text = "Hello world";
        System.out.println(text);
    }
}