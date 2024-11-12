
package view;
import controller.AnimalController;
import controller.GatoController;
import controller.PerroController;
import javax.swing.JOptionPane;

public class MainView {
    public static void main(String[] args) {
        AnimalController animal_controller = new AnimalController();
        animal_controller.registrarAnimal("Nombre General", "Raza general", 10);
        JOptionPane.showMessageDialog(null, animal_controller.mostrarAnimal(), 
        "INFORMACION DEL ANIMAL", JOptionPane.INFORMATION_MESSAGE);

        //Perro Controller
        PerroController perro_controller = new PerroController();
        perro_controller.registrarPerro("rambo", "doger argentino", 11, "raza pura");
        JOptionPane.showMessageDialog(null, perro_controller.mostrarPerro(), 
        "INFORMACION DEL PERRO", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, perro_controller.comer(), 
        "ACCION DEL PERRO", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, perro_controller.jugar(), 
        "ACCION DEL PERRO", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, perro_controller.dormir(), 
        "ACCION DEL PERRO", JOptionPane.INFORMATION_MESSAGE);
        

        //Gato Controller
        GatoController gato_controller = new GatoController();
        gato_controller.registrarGato("risitos", "persa", 7, "uso correcto de caja de arena");
        JOptionPane.showMessageDialog(null,gato_controller.mostrarGato(),
            "INFORMACION DEL GATO", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,gato_controller.comer(),
            "ACCION DEL GATO",      JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,gato_controller.jugar(),
            "ACCION DEL GATO",      JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,gato_controller.dormir(),
            "ACCION DEL GATO",      JOptionPane.INFORMATION_MESSAGE);
    }
    
}
