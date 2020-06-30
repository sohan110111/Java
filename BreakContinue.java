public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break; // here will be jump out of the loop
            }

            System.out.println(i); // output = 0, 1, 2, 3
        }
        //Now i is one kind of local variable 
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue; // Here break the one iteration (in the loop), and the specify statement occurs with condition  
            }

            System.out.println(i); // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        }

        // break, continue in while loop 
        int i = 0; 
        while (i < 10) {
            System.out.println(i); // 0, 1, 2, 3
            i++;
            if (i == 4) {
                break;
            }
        }

        // now here i = 4
        while (i < 10) {
            if (i == 4) {
               i++;
               continue;
            }
            System.out.println(i); // 5, 6, 7, 8, 9
            i++;
        }

    }
}