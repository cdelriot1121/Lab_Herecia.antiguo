
package controller;

import model.GatoModel;

public class GatoController extends AnimalController {

    private GatoModel gato_model;

    public void registrarGato(String nombre, String raza, int edad, String uso_caja_arena){
        gato_model = new GatoModel(nombre,raza,edad,uso_caja_arena);
    }

    public GatoModel mostrarGato() {
        return gato_model;
    }

    @Override
    public String jugar() {
        return "jugando desde la clase gato";
    }

    @Override
    public String comer() {
        return "comiendo desde la clase gato";
    }

    @Override
    public String dormir() {
        return "durmiendo desde la clase gato";
    }
}
