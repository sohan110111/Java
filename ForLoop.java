public class ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i); // output = 0 to 4
        }

        // Now the loop print the even value 0 between 10
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i); // output = 0, 2, 4, 6, 8, 10
        }

        // for each loop
        /* syntax:
         for (type variableName : arrayName) {
            code block statements are executed 
         } */

         String[] cars = {"BMW", "Mazda", "Ford", "Volvo"};
         for (String catchValue : cars) {
             System.out.println(catchValue);
         }

    }
}