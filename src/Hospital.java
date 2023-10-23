import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Hospital {
    private List<Patient> patientList=new ArrayList<>();
    private List<Doctor> doctorList=new ArrayList<>();
    public void addPatient(Patient patient){
        patientList.add(patient);
    }


    public void addDoctor(Doctor doctor){
        doctorList.add(doctor);
    }
    public void updatedPatientId(int patientId,String name, int age, String diagnosis){
        for(Patient patient:patientList){
            if(patient.getPatientId()== patientId){
                patient.setAge(age);
                patient.setDiagnosis(diagnosis);
                patient.setName(name);
                System.out.println("Patient details updated successfully.");
                return;
            }
        }
        System.out.println("Patient with ID " + patientId + " not found.");
    }

    public void updatedDoctorId(int doctorId,String name, String Specialazation){
        for(Doctor doctor:doctorList){
            if(doctor.getDoctorId()==doctorId){
                doctor.setName(name);
                doctor.setSpecialization(Specialazation);
                System.out.println("Doctor details updated successfully.");
                return;
            }
        }
        System.out.println("Doctor with ID " + doctorId + " not found.");
    }
    public void displayAllPatients() {
        System.out.println("All Patients:");
        for (Patient patient : patientList) {
            System.out.println("PatientId: " + patient.getPatientId());
            System.out.println("Name: " + patient.getName());
            System.out.println("Age: " + patient.getAge());
            System.out.println("Diagnosis: " + patient.getDiagnosis());


        }
    }
    public void displayAllDoctors(){
        System.out.println(("All Doctors:"));
        for (Doctor doctor : doctorList){
            System.out.println("DoctorId: " + doctor.getDoctorId());
            System.out.println("Name: " + doctor.getName());
            System.out.println("Specialization: " + doctor.getSpecialization());
        }
    }

    public void removePatientById(int patientId){
        for (Patient patient:patientList){
            if(patient.getPatientId()==patientId){
                patientList.remove(patient);
                System.out.println("Patient with ID " + patientId + " removed successfully.");
                return;
            }
            System.out.println("Patient with ID " + patientId + " not found.");
        }
    }

    public void removeDoctorById(int DoctorId){
        for(Doctor doctor:doctorList){
            if(doctor.getDoctorId()== DoctorId){
                doctorList.remove(doctor);
                System.out.println("Doctor with ID " + DoctorId + " removed successfully.");
                return;
            }
        }
        System.out.println("Doctor with ID " + DoctorId + " not found.");
    }




}