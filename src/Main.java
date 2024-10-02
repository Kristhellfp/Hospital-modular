import hospital.controller.LoginController;
import hospital.view.LoginView;
import backEnd.BackEnd;
import hospital.services.DataSala;
import hospital.view.SalaView;
import hospital.controller.LoginController;


public class Main {
    public static void main(String[] args) {
        // Crear instancia de la vista de login
        LoginView loginView = new LoginView();

        // Crear instancia del backend
        BackEnd backEnde = new BackEnd();
        LoginView loginView1 = new LoginView();


        // Crear y mostrar la vista de salas
        SalaView salasView = new SalaView();
        DataSala dataSalas = new DataSala();
        BackEnd backEnd = new BackEnd();
    }
}
