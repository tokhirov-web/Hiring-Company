package Employees;
import java.util.Scanner;

public class LogIn {


    public void empDataCheck(String name, int ID) {

        Scanner sc = new Scanner(System.in); // Creating scanner obj

        int i = 3;

        while (true) {


            System.out.print("Please, enter your Name --> ");
            String checkName = sc.nextLine(); // Here, the user puts an input
            System.out.println();
            System.out.print("Please, enter your ID : ");
            int checkId = sc.nextInt();
            System.out.println();

            if ((checkName.compareTo(name) == 0) && (checkId == ID)) {
                break;
            } else {
                i--;
                System.out.println("You have " + i + " attemps left");
            }

            if (i == 0) {
                System.out.println("Incorrect user Name or ID, please contact us for verification");
                break;
            }

        }

    }
}