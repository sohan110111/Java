public class Operators {
    public static void main(String[] args) {
        int x = 100 + 50;
        System.out.println(x); // 150

        int sum1 = x + 250; // 150 + 250 = 400
        int sum2 = sum1 + 250; // 400 + 250 = 650
        int sum3 = sum1 + sum2; // 400 + 650 = 1050
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        int m = 10, n = 5;
        System.out.println(m + n); // 10 + 5 = 15
        System.out.println(m - n); // 10 - 5 = 5
        System.out.println(m * n); // 10 * 5 = 50
        System.out.println(m / n); // 10 / 5 = 2
        System.out.println(m % n); // 10 % 5 = 0
        System.out.println(++n); // 6 Here my opinion before increase value then print. (pre-increment)
        System.out.println(n++); // 6 And here before print value of the variable then it stored the increasing value of that variable. (post-increment)
        System.out.println(n); // 7
        System.out.println(--m); // 9 (pre-decrement)
        System.out.println(m--); // 9 (post-decrement)
        System.out.println(m); // 8

        int a = 5; // Here discussion Assignment Operator (=)
        System.out.println(a);
        a += 10; // additional assignment operator a = 5 + 10
        System.out.println(a); // 15
        System.out.println(a -= 5); // 15 - 5 = 10
        System.out.println(a *= 5); // 10 * 5 = 50
        System.out.println(a /= 2); // 50 / 2 = 25
        System.out.println(a %= 2); // 25 % 2 = 1

        // Now discussion bitwise operator 
        int l = 5;
        System.out.println(l &= 3); //(AND operation) Here, corresponding binary (0101 & 0011) = 0001 of corresponding decimal value is  1
        System.out.println(l); // 1 => It given same output before and after statement before statement is called assignment operator
        System.out.println(5 | 3); // (OR-Operation) (0101 | 0011 = 0111 of decimal value 7) in this way remind that one bit is true(1) that's called the resultant value is true
        System.out.println(5 ^ 3); // (X-OR) (0101 ^ 0011 = 0110 of decimal value 6)
        System.out.println(~5); // (NOT-Operation) two's complement notation : ~x = (-x) - 1; output : -6
        System.out.println(5 >> 3); // (Bit right-shift) (0101 = 0.101 of decimal value 0)
        System.out.println(5 << 3); // (Bit left-shift) (like 0101.000 = 101000 of decimal value 40)
        System.out.println(1000000000 >> 2); // 25000000 here the value accept till integer or the widening type is not support 
        //System.out.println(12345678934567 >> 2 ); // here integer number is too large or floating the integer size
        //System.out.println(10.0 >> 2); // bad operand types for binary operator types : double
        System.out.println((-1 >> 1)); //-1
        // Now discussion Comparison Operators 
        System.out.println(5 == 3); // false
        System.out.println(5 != 3); // true
        System.out.println(5 > 3); // true
        System.out.println(5 < 3); // false
        System.out.println(5 <= 3); // false
        System.out.println(5 >= 3); // true

        // Logical Operators
        System.out.println(5 > 3 && 5 < 10); // true
        System.out.println(5 < 3 || 5 < 2); // false
        System.out.println(!(5 > 3 && 5 < 10)); // false

        //Bitwise Zero fill right and left shift operator
        System.out.println(1 >>> 1); // 0
        System.out.println(-1 >>> 1); // 2147483647
        

    }
}