import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Define the array
        Scanner userInput = new Scanner(System.in); //user input
        System.out.println("What is the index number: ");
        int index = userInput.nextInt();
        //burada getElemEntAtIndex methodunu dene
        try {
            int element = getElementAtIndex(myArray, index);
            System.out.println("Value of the index: " + element);
        }   // with exception e object throw the error if it happens
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getElementAtIndex(int[] array, int index) throws Exception {
        if (index < 0 || index >= array.length) {
            throw new Exception("Invalid Index: " + index);
        }
        return array[index];
    }
}