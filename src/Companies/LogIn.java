package Companies;
import java.util.Scanner;

public class LogIn {

    boolean compName = false;
    boolean compIndustry = false;

    public void compNameCheck(String name) {

        Scanner sc = new Scanner(System.in); // Creating scanner obj

        int i = 3;

        while(true) {

            System.out.print("Please, enter the name of your company --> ");
            String checkName = sc.nextLine(); // Here, the user puts an input
            System.out.println();

            if(checkName.compareTo(name) == 0) {
                break;
            } else {
                i--;
                System.out.println("You have " + i + " attemps left");
            }

            if (i == 0) {
                System.out.println("Incorrect company name, please contact us for verification");
                break;
            }

        }

    }

    public void CompIndustryCheck(String industry) {

        Scanner sc = new Scanner(System.in); // Creating scanner obj

        int i = 3;

        while(true) {

            System.out.print("Please, enter the industry name of your company --> ");
            String checkIndustry = sc.nextLine(); // Here, the user puts an input
            System.out.println();

            if(checkIndustry.compareTo(industry) == 0) {
                break;
            } else {
                i--;
                System.out.println("You have " + i + " attemps left");
            }

            if (i == 0) {
                System.out.println("Incorrect industry name, please contact us for verification");
                break;
            }

        }


    }

}
