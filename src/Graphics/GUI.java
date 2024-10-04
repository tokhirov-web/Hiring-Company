package Graphics;

import java.awt.*;
import java.awt.event.*;

public class GUI extends Frame {

    Frame frame;

    TextField field1;
    TextField field2;

    List theList;

    Button button;


    GUI() {
        frame = new Frame("Hiring Company");

        field1 = new TextField("Enter the step number that you want to see");

        button = new Button("Click");

        theList = new List();

        button.setBounds(490, 100, 150, 30);

        field1.setBounds(380, 70, 400, 30);

        theList.setBounds(380, 160, 400, 400);



        Perform other = new Perform(this);

        button.addActionListener(other);


        frame.add(field1);

        frame.add(theList);

        frame.add(button);


        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}


class Perform implements ActionListener {

    GUI gObj;
    String userInput = " ";

    String step3 = "";
    Perform(GUI gObj) {
        this.gObj = gObj;
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == gObj.button) {
            userInput = gObj.field1.getText();
            int num = 0;
            try {
                num = Integer.parseInt(userInput);
            }
            catch (NumberFormatException q) {
                gObj.theList.removeAll();
                gObj.theList.add("Enter the numbers only");
            }

            if(num == 2) {

                gObj.theList.removeAll();
                gObj.theList.add("byte numOfBranches = 3;");
                gObj.theList.add("String branchOneName = \"Nuke\";");
                gObj.theList.add("String branchTwoName = \"Inferno\";");
                gObj.theList.add("String branchThreeName = \"Mirage\"");
                gObj.theList.add("String branchThreeName = \"Mirage\"");
                gObj.theList.add("boolean siriusIsActive = false;");
                gObj.theList.add("boolean mirageIsActive = false;");
                gObj.theList.add("byte numOfWorkers = 67;");
                gObj.theList.add("float companyExpenses = 3462.78f;");
                gObj.theList.add("boolean salaryIsGiven = false;");
                gObj.theList.add("float givenSalary = 0f;");
                gObj.theList.add("byte jobsNum = 5;");
                gObj.theList.add("byte jobSeekersNum = 3;");
                gObj.theList.add("String empOneName = \"Michael Jefferson\";");
                gObj.theList.add("String empOneProfession = \"Electrical Engineer\";");
                gObj.theList.add("byte employeeOneId = 9;");
                gObj.theList.add("byte employeeOneAge = 28;");
                gObj.theList.add("final boolean hasDegree1 = true;");
                gObj.theList.add("byte experienceYears1 = 3;");
                gObj.theList.add("final float employeeOneGpa = 3.4f;");
                gObj.theList.add("byte contractDaysLeft1 = 31;");
                gObj.theList.add("String companyOneName = \"Saneg LLC\";");
                gObj.theList.add("final short companyOneEstYear = 2004;");
                gObj.theList.add("float companyOneRevenue = 3440001.45f;");
                gObj.theList.add("short avgSalary1 = 3000;");
                gObj.theList.add("final boolean licenesed1 = true;");
                gObj.theList.add("String industry1 = \"Engineering\";");
                gObj.theList.add("String companyTwoName = \"Apple Inc.\";");
                gObj.theList.add("final short companyTwoEstYear = 1978;");
                gObj.theList.add("float companyTwoRevenue = 34400045561.45f;");
                gObj.theList.add("short avgSalary2 = 5000;");
                gObj.theList.add("final boolean licenesed2 = true;");
                gObj.theList.add("String industry2 = \"IT\";");
            }
            else if (num == 3) {
                gObj.theList.removeAll();
                gObj.theList.add("If: \nToo many potential candidates;");
                gObj.theList.add("if-else: No enough employees in the database;");
                gObj.theList.add("if-else-if (in method): FaceBook Inc. is profitable;");
                gObj.theList.add("nested if (in a method): The employee is eligible for consideration;");
                gObj.theList.add("Switch case: The employee can work in Saneg LLC");
                gObj.theList.add("The employee can work in Saneg LLC");
            }
            else if (num == 4) {
                gObj.theList.removeAll();

                gObj.theList.add("Day 1");
                gObj.theList.add("Day 2");
                gObj.theList.add("Day 3");
                gObj.theList.add("Day 4");
                gObj.theList.add("Day 5");
                gObj.theList.add("Day 6");
                gObj.theList.add("Day 7");
                gObj.theList.add("Day 8");
                gObj.theList.add("Day 9");
                gObj.theList.add("Day 10");
                gObj.theList.add("Day 11");
                gObj.theList.add("Day 12");
                gObj.theList.add("Day 13");
                gObj.theList.add("Day 14");
                gObj.theList.add("Day 15");
                gObj.theList.add("Day 16");
                gObj.theList.add("Day 17");
                gObj.theList.add("Day 18");
                gObj.theList.add("Day 19");
                gObj.theList.add("Day 20");
                gObj.theList.add("Day 21");
                gObj.theList.add("Day 22");
                gObj.theList.add("Day 23");
                gObj.theList.add("Day 24");
                gObj.theList.add("Day 25");
                gObj.theList.add("Day 26");
                gObj.theList.add("Day 27");
                gObj.theList.add("Day 28");
                gObj.theList.add("Day 29");

                gObj.theList.add("All workers have received their salary");

                gObj.theList.add("The average salary according to the company's revenue is : 453691.4");

                gObj.theList.add(" ");;

                gObj.theList.add("Michael Jefferson has 31 days of the contract left");
                gObj.theList.add("Michael Jefferson has 30 days of the contract left");
                gObj.theList.add("Michael Jefferson has 29 days of the contract left");
                gObj.theList.add("Michael Jefferson has 28 days of the contract left");
                gObj.theList.add("Michael Jefferson has 27 days of the contract left");
                gObj.theList.add("Michael Jefferson has 26 days of the contract left");
                gObj.theList.add("Michael Jefferson has 25 days of the contract left");
                gObj.theList.add("Michael Jefferson has 24 days of the contract left");
                gObj.theList.add("Michael Jefferson has 23 days of the contract left");
                gObj.theList.add("Michael Jefferson has 22 days of the contract left");
                gObj.theList.add("Michael Jefferson has 21 days of the contract left");
                gObj.theList.add("Michael Jefferson has 20 days of the contract left");
                gObj.theList.add("Michael Jefferson has 19 days of the contract left");
                gObj.theList.add("Michael Jefferson has 18 days of the contract left");
                gObj.theList.add("Michael Jefferson has 17 days of the contract left");
                gObj.theList.add("Michael Jefferson has 16 days of the contract left");
                gObj.theList.add("Michael Jefferson has 15 days of the contract left");
                gObj.theList.add("Michael Jefferson has 14 days of the contract left");
                gObj.theList.add("Michael Jefferson has 13 days of the contract left");
                gObj.theList.add("Michael Jefferson has 12 days of the contract left");
                gObj.theList.add("Michael Jefferson has 11 days of the contract left");
                gObj.theList.add("Michael Jefferson has 10 days of the contract left");
                gObj.theList.add("Michael Jefferson has 9 days of the contract left");
                gObj.theList.add("Michael Jefferson has 8 days of the contract left");
                gObj.theList.add("Michael Jefferson has 7 days of the contract left");
                gObj.theList.add("Michael Jefferson has 6 days of the contract left");
                gObj.theList.add("Michael Jefferson has 5 days of the contract left");
                gObj.theList.add("Michael Jefferson has 4 days of the contract left");
                gObj.theList.add("Michael Jefferson has 3 days of the contract left");
                gObj.theList.add("Michael Jefferson has 2 days of the contract left");
                gObj.theList.add("Michael Jefferson has 1 days of the contract left");

                gObj.theList.add(" ");

                gObj.theList.add("Potential employers:");
                gObj.theList.add("Google FaceBook Eriell Walmart Pearson");


                gObj.theList.add(" ");

                gObj.theList.add("No match");
                gObj.theList.add("No match");
                gObj.theList.add("Eriell. Match");



            }
            else if (num == 5) {
                gObj.theList.removeAll();

                gObj.theList.add("static final String companyName = \"Hire LLC\";");
                gObj.theList.add("static final short establishedYear = 2024;");
                gObj.theList.add("static float revenue = 30400785.56f;");

                gObj.theList.add(" ");

                gObj.theList.add("Michael Jefferson has got a degree");
                gObj.theList.add("FaceBook Inc. has got a license");

                gObj.theList.add(" ");

                gObj.theList.add("FaceBook Inc. is profitable");

                gObj.theList.add("Project Manager");
                gObj.theList.add("HR manager");
                gObj.theList.add("Petrolium Engineer");
                gObj.theList.add("Electrical Engineer");
                gObj.theList.add("Software Developer");
                gObj.theList.add("0");

                gObj.theList.add(" ");
                gObj.theList.add("static {");
                gObj.theList.add("  short currentYear = 2024;");
                gObj.theList.add("  boolean companyIsAlive = true;");
                gObj.theList.add("}");









            }
            else if (num == 6) {
                gObj.theList.removeAll();

                gObj.theList.add("String[] jobSeekersDataBase = new String[8];");
                gObj.theList.add("jobSeekersDataBase[0] = \"Antony Joshua\";");
                gObj.theList.add("jobSeekersDataBase[1] = \"Tiffany Jons\";");
                gObj.theList.add("jobSeekersDataBase[2] = \"Melonie Katelin\";");

                gObj.theList.add(" ");

                gObj.theList.add("String[][] companiesDataBase = new String[20][2];");
                gObj.theList.add("companiesDataBase[0][0] = companyOneName;");
                gObj.theList.add("companiesDataBase[0][1] = industry1;");
                gObj.theList.add("companiesDataBase[1][0] = companyTwoName;");
                gObj.theList.add("companiesDataBase[1][1] = industry2;");
                gObj.theList.add("companiesDataBase[2][0] = companyThreeName;");
                gObj.theList.add("companiesDataBase[2][1] = industry3;");
                gObj.theList.add("companiesDataBase[3][0] = companyFourName;");
                gObj.theList.add("companiesDataBase[3][1] = industry4;");

                gObj.theList.add(" ");

                gObj.theList.add("Information about the companies: ");
                gObj.theList.add("Saneg LLC : Engineering :");
                gObj.theList.add("Apple Inc. : IT : ");
                gObj.theList.add("Google Inc. : IT : ");
                gObj.theList.add("FaceBook Inc. : IT :");
                gObj.theList.add("Blablabla : muffins : ");

                gObj.theList.add(" ");

                gObj.theList.add("Current list of potential employees:");
                gObj.theList.add("Antony Joshua");
                gObj.theList.add("Tiffany Jons");
                gObj.theList.add("Melonie Katelin");
                gObj.theList.add("Name");

                gObj.theList.add(" ");

                gObj.theList.add("String[][] potentialCompsDB = {");
                gObj.theList.add("  {potentialComps[0], \"IT\"},");
                gObj.theList.add("  {potentialComps[1]},");
                gObj.theList.add("  {potentialComps[2], \"Petrol\"},");
                gObj.theList.add("  {potentialComps[3]}");
                gObj.theList.add("}");
            }
            else {
                gObj.theList.removeAll();

                gObj.theList.add("No such step");


            }

        }
    }
}