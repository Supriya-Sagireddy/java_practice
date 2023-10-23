import java.util.Objects;
public class Doctor {
    private int doctorId;
    private String name;
    private String specialization;

    public Doctor(int doctorId, String name, String specialization){
        this.doctorId=doctorId;
        this.name=name;
        this.specialization=specialization;
    }
    public int getDoctorId(){
        return doctorId;
    }
    public void setDoctorId(int doctorId){
        this.doctorId=doctorId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSpecialization(){
        return specialization;
    }
    public void setSpecialization(String specialization){
        this.specialization=specialization;
    }
}
