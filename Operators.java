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

    }
}