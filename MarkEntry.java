import java.util.Scanner;
public class MarkEntry {
    public static void main(String[]args)
    {
        int[]marks = new int[10];
        Scanner input = new Scanner(System.in);

        // Read 10 marks from the user
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        // Print the entered marks
        System.out.println("You entered:");
        for (int mark : marks) {
            System.out.println(mark);
        }
        input.close();
    }

}
