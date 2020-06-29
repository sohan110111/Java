public class Strings {
    public static void main(String[] args) {
        String greeting = "Hello world";
        System.out.println(greeting); // output = Hello world

        String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the text string is : " + text.length()); // output = The length of the text string is : 26
        System.out.println(greeting.toUpperCase()); // output = HELLO WORLD
        System.out.println(greeting.toLowerCase()); // output = hello world

        String textPosition = "Please locate where 'locate' occurs!";
        System.out.println(textPosition.indexOf("locate")); // output = 7

        String firstName = "John", lastName = "Doe";
        System.out.println(firstName.concat(lastName)); // output = JohnDoe
        
        // here print Single quote and double quote 
        String doubleQuote = "Hello \"Bangladesh\"";
        System.out.println(doubleQuote); // output = Hello "Bangladesh"
        String singleQuote = "I'm alright"; // and here no need to use (\')
        System.out.println(singleQuote); // output = I'm alright
        String backslash = "The character is called \\ backslash";
        System.out.println(backslash); // output = The character is called \ backslash

        String NewLine = "Hello \n USA";
        System.out.println(NewLine); /* output = Hello
                                                  USA */
        String CarriageReturn = "Hello\rWorld";
        System.out.println(CarriageReturn); // output = World
        String Tab = "Hello\tWorld";
        System.out.println(Tab); // output = Hello   World
        String Backspace = "Hel\blo world"; 
        System.out.println(Backspace); // output =  Helo world
        String FromFeed = "Hello\fworld"; // Page breaking ASCII control character
        System.out.println(FromFeed); // output =  Hello♀world

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