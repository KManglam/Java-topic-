// Define a class named Exercise2.
public class Exercise2 {
    
    public static void main(String[] args) {      
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i : my_array)
            // Add each element to the sum.
            sum += i;
        // Print the sum of the array elements.
        System.out.println("The sum is " + sum);
    }
}
