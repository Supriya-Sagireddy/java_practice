import java.sql.SQLOutput;
import java.util.Scanner;
public class HospitalUtil {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nAdd patient");
            System.out.println("Add doctor");
            System.out.println("Display all Patients");
            System.out.println("Display all Doctors");
            System.out.println("update patient by id ");
            System.out.println("remove patient by id");
            System.out.println("remove doctor by id");
            System.out.println("update doctor by id");
            System.out.println("Exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                        System.out.println("Enter patientId");
                        int patientId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter name");
                        String Name = scanner.nextLine();
                        System.out.println("Enter age");
                        int Age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter Diagnosis");
                        String Diagnosis = scanner.nextLine();

                        Patient patientList = new Patient(patientId, Name, Age, Diagnosis);
                        hospital.addPatient(patientList);
                        System.out.println("patient details added");
                    break;
                case 2:
                        System.out.println("Enter doctorId");
                        int doctorId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter name");
                        String name = scanner.nextLine();
                        System.out.println("Enter specialization");
                        String Specialization = scanner.nextLine();


                        Doctor doctorList = new Doctor(doctorId, name, Specialization);
                        hospital.addDoctor(doctorList);
                        System.out.println("doctor details added");
                    break;
                case 3:
                    System.out.println("Displaying all patients");
                    hospital.displayAllPatients();
                    break;
                case 4:
                    System.out.println("Displaying all Doctors");
                    hospital.displayAllDoctors();
                    break;
                case 5:
                    System.out.println("Enter UpdatedpatientId");
                    int updatedPatientId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Updatedname");
                    String UpdatedName = scanner.nextLine();
                    System.out.println("Enter Updatedage");
                    int UpdatedAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter UpdatedDiagnosis");
                    String UpdatedDiagnosis = scanner.nextLine();

                    Patient updatedPatientList = new Patient(updatedPatientId, UpdatedName, UpdatedAge, UpdatedDiagnosis);
                    hospital.addPatient(updatedPatientList);
                    System.out.println("patient details updated");
                    break;
                case 6:
                    System.out.print("Enter Patient ID to remove: ");
                    int removePatientId = scanner.nextInt();
                    hospital.removePatientById(removePatientId);
                    break;
                case 7:
                    System.out.println("Enter UpdatedDoctorId");
                    int updatedDoctorId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Updated name");
                    String updatedname = scanner.nextLine();
                    System.out.println("Enter Updated specialization");
                    String updatedSpecialization = scanner.nextLine();

                    Doctor updatedDoctorList = new Doctor(updatedDoctorId, updatedname, updatedSpecialization);
                    hospital.addDoctor(updatedDoctorList);
                    System.out.println("Doctor details updated");
                    break;
                case 8:
                    System.out.print("Enter Patient ID to remove: ");
                    int removeDoctorId = scanner.nextInt();
                    hospital.removeDoctorById(removeDoctorId);
                    break;
                case 9:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Please enter valid option.");
            }

        }
    }
}
