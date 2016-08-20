import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class Main {
    public static void main(String[] args) {

        DoctorDetails[] dd = new DoctorDetails[3];
        dd[0] = new DoctorDetails("Test doctor number 1","surname","dep");
        dd[1] = new DoctorDetails("s","s","s");
        dd[2] = new DoctorDetails("s","s","s");

        String[] PD1Appointments = {"Throat infection on Wednesday 16th", "Pill appointment on Friday 4th at 17:47"};
        String[] PD2Appointments = {"Appointment for face reconstruction on Toma", "Yeah yeah"};
        String[] PD3Appointments = {"awesome", "Cool"};

        PatientDetails[] PD = new PatientDetails[3];
        PD[0] = new PatientDetails("John", "Jonny", "n/a", 174, PD3Appointments, false, 5);
        PD[1] = new PatientDetails("Helena", "bullshit", "f", 18, PD1Appointments, true, 1);
        PD[2] = new PatientDetails("Ross", "Fletchure", "f", 18, PD2Appointments, true, 3);

        int menuInput;
        System.out.println("Welcome to the Helena and Ross doctors surgery: \n"
                + "Please choose an option:\n"
                + "      1) Patients\n"
                + "      2) Doctors\n"
                + "      3) Nurses\n");
        Scanner s = new Scanner(System.in);
        menuInput=s.nextInt();

        while (menuInput != 4){
            switch (menuInput){
                case 1: {
                    // PD.length = number of patients

                    System.out.println("This is the patient screen. \n" +
                            "Please select an option from the list below: \n");

                    for (int loopCounter = 0; loopCounter < PD.length; loopCounter++){
                        System.out.println("      " + (loopCounter + 1) + ") " + PD[loopCounter].firstName + " " + PD[loopCounter].lastName);
                    }

                    System.out.println(
                            // Concat these to the end of the menu
                            // TODO - Add new patient
                            "      " + (PD.length + 1) + ") Display all patients" +
                            "\n      " + (PD.length + 2 ) + ") Return to menu");

                    do {
                            menuInput = s.nextInt();
                            // if input is less than the number of patients get that patient else switch case the other options
                            if (menuInput <= PD.length && menuInput > 0) PD[menuInput - 1].display();
                                // other options
                            else {
                                if (menuInput == PD.length + 1) {
                                    // display all
                                    for (PatientDetails patient : PD) patient.display();
                                } else if (menuInput == PD.length + 2) {
                                    // new patient
                                    System.out.println("This screen is still under development ");
                                } else if (menuInput == PD.length + 2) {
                                    break;
                                } else {
                                    System.out.println("Not a valid option");
                                    break;
                                }
                            }
                    } while (menuInput != PD.length + 2);
                }
                case 2: {
                    // doctors
                }
                case 3: {
                    //nurses
                }
                default: {
                    //exit
                }
            }
        }
    }
}
