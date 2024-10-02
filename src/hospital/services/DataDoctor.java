package hospital.services;
import hospital.model.Doctor;
import java.util.ArrayList;
public class DataDoctor {
    private ArrayList<Doctor> data;
    public DataDoctor() {
        data = new ArrayList<>();
        data.add(new Doctor("Dr. Pedro Alvarado", "pedro.alvarado@hospital.com", "Cardiología", "555-1234", "yo", "123"));
        data.add(new Doctor("Dra. Lucía Torres", "lucia.torres@hospital.com", "Dermatología", "555-5678", "luciatorres", "lucia456"));
        data.add(new Doctor("Dr. Miguel López", "miguel.lopez@hospital.com", "Pediatría", "555-9101", "miguellopez", "miguel789"));
        data.add(new Doctor("Dra. Carolina Morales", "carolina.morales@hospital.com", "Ginecología", "555-1122", "caromorales", "carolina101"));
        data.add(new Doctor("Dr. Eduardo Reyes", "eduardo.reyes@hospital.com", "Neurología", "555-3344", "eduardoreyes", "edu202"));
    }
    public Doctor login(String usuario, String contraseña) {
        for (Doctor doctor : data) {
            if (doctor.getUsuario().equals(usuario) && doctor.getContraseña().equals(contraseña)) {
                return doctor;
            }
        }
        return null;
    }
    public ArrayList<Doctor> getDoctores() {
        return data;
    }
}