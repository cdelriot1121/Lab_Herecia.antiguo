package controller;

import model.PerroModel;

public class PerroController extends AnimalController {

    private PerroModel perro_model;


    public void registrarPerro(String nombre, String raza, int edad, String pedigree)
{       perro_model = new PerroModel(nombre, raza ,edad , pedigree);
    }
    public PerroModel mostrarPerro() {
        return perro_model;

    }
    
    @Override
    public String comer() {
        return "comiendo desde la clase perro";
    }

    @Override
    public String jugar() {
        return "jugando desde la clase perro";
    
    }

    @Override
    public String dormir() {
        return "durmiendo desde la clase perro";
    }
}