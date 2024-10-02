package backEnd;

import hospital.model.Doctor;
import hospital.services.DataDoctor;
import java.util.HashMap;

public class BackEnd {

    public HashMap<String, String> validarDatos(String usuario, String contraseña) {
        DataDoctor dataDoctor = new DataDoctor();
        HashMap<String, String> response = new HashMap<>();

        Doctor doctor = dataDoctor.login(usuario, contraseña);

        if (doctor != null) {

            response.put("Nombre", doctor.getNombre());
            response.put("Correo", doctor.getCorreo());
            response.put("Especialidad", doctor.getEspecialidad());
        } else {

            response.put("Error", "Credenciales incorrectas");
        }

        return response;
    }
}