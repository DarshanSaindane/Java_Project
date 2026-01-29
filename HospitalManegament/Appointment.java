public class Appointment
{
    private Patient patient;
    private Doctor doctor;
    private String data;

    public Appointment(Patient patient, Doctor doctor, String data){
        this.patient = patient;
        this.doctor =  doctor;
        this.data = data;
    }

    public String toString()
    {
        return "Appointment: [Patient: " + patient + ", Doctor: " + doctor + ", Date: " + data + "]";
    }

}