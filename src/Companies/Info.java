package Companies;

public class Info {

    //    Profile comp
    public static void licenseCheck(String company, boolean license) {
        if (license == true) {
            System.out.println("\n" + company + " has got a license");
        } else {
            System.out.println("\n" + company + " does not have a license");
        }
    }

    public void profitability(String company, float revenue, float expenses) {
        if (revenue > expenses) {
            System.out.println(company + " is profitable");
        } else if (revenue == expenses) {
            System.out.println(company + " is stable");
        } else if (revenue < expenses) {
            System.out.println(company + " is losing it's money");
        }
    }

        //      Profile comp
        public String companyOneName = "Saneg LLC";
        public final short companyOneEstYear = 2004;
        public float companyOneRevenue = 3440001.45f;
        public short avgSalary1 = 3000;
        public final boolean licenesed1 = true;
        public String industry1 = "Engineering";

        //      Profile comp
        public String companyTwoName = "Apple Inc.";
        public final short companyTwoEstYear = 1978;
        public float companyTwoRevenue = 34400045561.45f;
        public short avgSalary2 = 5000;
        public final boolean licenesed2 = true;
        public String industry2 = "IT";

        //      Profile comp
        public String companyThreeName = "Google Inc.";
        public final short companyThreeEstYear = 1998;
        public float companyThreeRevenue = 3440456561.45f;
        public short avgSalary3 = 4000;
        public final boolean licenesed3 = true;
        public String industry3 = "IT";

        //      Profile comp
        public String companyFourName = "FaceBook Inc.";
        public final short companyFourEstYear = 2005;
        public float companyFourRevenue = 343234561.45f;
        public float companyFourExpenses = 34234252.454f;
        public short avgSalary4 = 3000;
        public final boolean licenesed4 = true;
        public String industry4 = "IT";



}
