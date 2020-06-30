public class Arrays {
    public static void main(String[] args) {
        // note : Array is used to store in same type variable of value in put in one variable 
        String[] cars = {"BMW", "Volvo", "Toyota", "Ford", "Mazda", "Lamborghini"};
        System.out.println("My favorite car is : " + cars[5]);

        cars[0] = "Opel";
        System.out.println("The brand new car is : " + cars[0]); // Now Opel instead of car Opel
        System.out.println(cars.length); // output = 6

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]); // Opel, Volvo, Toyota, Ford, Mazda, Lamborghini
        } 

        for (String i : cars) {
            System.out.println(i); // here print the array of all element 
        }

        // Now represent two dimensional array  
        int[][] myNumbers = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        System.out.println(myNumbers[1][0]); // 6

        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]); // output = 1 to 10
            }
        }
    }
}