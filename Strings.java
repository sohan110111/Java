public class Strings {
    public static void main(String[] args) {
        String greeting = "Hello world";
        System.out.println(greeting);

        String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the text string is : " + text.length());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());

        String textPosition = "Please locate where 'locate' occurs!";
        System.out.println(textPosition.indexOf("locate"));

        String firstName = "John", lastName = "Doe";
        System.out.println(firstName.concat(lastName));
        
        // here print Single quote and double quote 
        String doubleQuote = "Hello \"Bangladesh\"";
        System.out.println(doubleQuote);
        String singleQuote = "I'm alright"; // and here no need to use \'
        System.out.println(singleQuote);
        String backslash = "The character is called \\ backslash";
        System.out.println(backslash);

        String NewLine = "Hello \n USA";
        System.out.println(NewLine);
        String CarriageReturn = "Hello\rWorld";
        System.out.println(CarriageReturn);
        String Tab = "Hello\tWorld";
        System.out.println(Tab);
        String Backspace = "Hel\blo world";
        System.out.println(Backspace);
        String FromFeed = "Hello\fworld"; // Page breaking ASCII control character
        System.out.println(FromFeed);

        // Numbers are added by plus(+) and String are concatenate 
        int x = 10, y = 3, z = x + y;
        System.out.println(z); // output = 13

        String m = "5", n = "7", l = m + n;
        System.out.println(l); // output = 57
        
        String j = "9";
        int k = 10;
        String u = j + k;
        System.out.println(u); // output = 910
    }
}