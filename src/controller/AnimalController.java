package controller;
import model.AnimalModel;


public class AnimalController {
    private AnimalModel animal_model;
    public void registrarAnimal(String nombre, String raza, int edad){
        animal_model = new AnimalModel(nombre,raza,edad);
    }
    public AnimalModel mostrarAnimal(){
        return animal_model;
    }
    protected String jugar (){
        return "jugando desde clase animal";
    }
    protected String dormir(){
        return "durmiendo desde la clase animal";
    }
    protected String comer(){
        return "comiendo desde la clase animal";
    }
}