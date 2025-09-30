 import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] temperature;
        temperature=new double[7];
        for(int i=0;i<temperature.length;i++)
        {
            System.out.println("Enter temp" + (i+1));
            temperature[i]= input.nextDouble();
        }
        System.out.println();
        System.out.println("Temp entered:");
        System.out.println();
        for(int i=0;i< temperature.length;i++) {
            System.out.println("day" + (i + 1) + " " + temperature[i]);
        }

        input.close();
    }
}
