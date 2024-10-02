package hospital.controller;

import backEnd.BackEnd;
import hospital.view.LoginView;

import java.util.HashMap;

public class LoginController {

    private LoginView loginView;
    private BackEnd backEnde;

    public LoginController(LoginView loginView, BackEnd backEnde) {
        this.loginView = loginView;
        this.backEnde = backEnde;
        this.loginView.addLoginListener(e -> handleLogin());
    }

    public LoginController() {
        super();
    }

    private void handleLogin() {

        String usuario = loginView.getUsuario();
        String contreseña = loginView.getPassword();


        HashMap<String, String> result = backEnde.validarDatos(usuario, contreseña);


        if (result.containsKey("Error")) {

            System.out.println("Error: " + result.get("Error"));
        } else {

            System.out.println("Login exitoso:");
            System.out.println("Nombre: " + result.get("Nombre"));
            System.out.println("Correo: " + result.get("Correo"));
            System.out.println ("Especialidad: " + result.get("Especialidad"));
        }
    }
}