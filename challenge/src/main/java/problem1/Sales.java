package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);//6
        System.out.print("Enter the number of sales people : ");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int max=sales[0];
        int highest=1;
        int min=sales[0];
        int lowest=1;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if (sales[i]>=max){
                highest=i;
                max=sales[i];
            }
            if (sales[i]<=min){
                lowest=i;
                min=sales[i];
            }
        }
        System.out.println("\nTotal sales: " +sum);
        double average=((double)sum)/((double)SALESPEOPLE);
        System.out.println("\nAverage: " + average); //1
        System.out.println("\nSalesperson "+highest+" had the highest sale with $" + max); //2
        System.out.println("\nSalesperson "+lowest+" had the lowest sale with $" + min); //3
        System.out.print("Enter a value : ");
        int seuil = scan.nextInt();
        int sum2=0;
        System.out.println("Sales people who exceeded "+seuil+" :"); //4
        for (int i=0; i<sales.length; i++) {
            if (sales[i] > seuil)
            {
                System.out.println(" " + (i+1) + " " + sales[i]);
                sum2 += sales[i];
            }

        }
        System.out.println("\nTotal sales: " +sum2);//4


    }
}