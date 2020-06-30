public class Switch {
    public static void main(String[] args) {
        int key = 4;
        switch (key) {
            case 1:
                System.out.println("Case 1 is unlocked.");
                break;
            case 2:
                System.out.println("Case 2 is unlocked.");
                break;
            case 3:
                System.out.println("Case 3 is unlocked.");
                break;
            case 4:
                System.out.println("Case 4 is unlocked."); 
                break;
            case 5:
                System.out.println("Case 5 is unlocked.");
                break;
            case 6:
                System.out.println("Case 6 is unlocked.");
                break;
        
            default:
                break;
        }
        // Output = Case 4 is unlocked.

        // Now default value is executed 
        int day = 7;
        switch (day) {
            case 1 :
                System.out.println("Saturday");
                break;
            case 2 : 
                System.out.println("Sunday");
                break;
            default : 
                System.out.println("Default block is executed looking forward weekend day.");
        }

    }
}