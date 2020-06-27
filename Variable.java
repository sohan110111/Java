// syntax: type variable_name = value;

public class Variable {
    public static void main(String[] args) {
        String name = "My Name is : Sohan";
        System.out.println(name);

        int myRollNumber = 18;
        System.out.println("My roll number is : " + myRollNumber);

        int age;
        age = 20;
        System.out.println("My age is : " + age);

        int myMoney = 50000;
        myMoney = 10000; // myMoney is updated
        System.out.println("My present money is : " + myMoney);

        final int myId = 1937820118;
        System.out.println("My id is : " + myId);

        String num = "8";
        System.out.println(num);
        System.out.println(num + myId); // here just combine
        
        String person = "John";
        System.out.println("Hello : " + person);


        String firstName = person;
        String lastName = " Doe";
        System.out.println(firstName + lastName);

    }
}