package Companies;
import java.util.Scanner;

public class Register {


    public void registration() {

        Scanner myObj = new Scanner(System.in);

        System.out.print("Please enter your company name: ");

        String companyName = myObj.nextLine();

        System.out.print("Please enter established year of your company: ");

        int establishedYear = myObj.nextInt();

        System.out.print("Please enter your industry name: ");

        myObj.nextLine();
        String industry = myObj.nextLine();

        System.out.println("Your entered company name is: " + companyName);

        System.out.println("Your entered established year of your company is: " + establishedYear);

        System.out.println("Your entered industry name is: " + industry);

    }

}
