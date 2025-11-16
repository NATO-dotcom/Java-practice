import java.util.Arrays;
import java.util.Scanner;
public class Arr {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
