package problem2;

import java.util.Scanner;
public class IntegerListTest
{
    static IntegerList list = new IntegerList(10);
    static Scanner scan = new Scanner(System.in);
    //-------------------------------------------------------
// Create a list, then repeatedly print the menu and do what the
// user asks until they quit
//-------------------------------------------------------
    public static void main(String[] args)
    {
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0)
        {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }
    //--------------------------------------
// Do what the menu item calls for
//--------------------------------------
    public static void dispatch(int choice)
    {
        int loc;
        switch(choice)
        {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                System.out.println("How big should the list be?");
                int size = scan.nextInt();
                //size=6;
                list = new IntegerList(size);
                list.randomize();
                //list.list= new int[]{1,2,3,1,6,7};

                break;
            case 2:
                list.print();
                break;
            case 3:
                if (list!=null) {
                    System.out.println("Enter the new value : ");
                    int newVal = scan.nextInt();
                    list.addElement(newVal);
                }
                else  {
                    System.out.println("Create first the list");
                }
            case 4:
                if (list!=null) {
                    System.out.println("Enter the value you want to remove: ");
                    int val = scan.nextInt();
                    list.removeFirst(val);
                }
                else  {
                    System.out.println("Create first the list");
                }
            case 5:
                if (list!=null) {
                    System.out.println("Enter the value you want to remove: ");
                    int val = scan.nextInt();
                    list.removeALL(val);
                }
                else  {
                    System.out.println("Create first the list");
                }

            default:
                System.out.println("Sorry, invalid choice");
        }
    }
    //----------------------------
// Print the user's choices
//----------------------------
    public static void printMenu()
    {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Create a new list (** do this first!! **)");
        System.out.println("2: Print the list");
        System.out.println("3: Add an element to  the list");
        System.out.println("4: Remove the first occurrence  of a value from the list");
        System.out.println("5: Remove the all occurrences  of a value from the list");
        System.out.print("\nEnter your choice: ");
    }
}
