
package model;


public class PerroModel extends AnimalModel{
    
    private String pedigree;
    
    public PerroModel(String pedigree){
        this.pedigree = pedigree;
    }
    
    public PerroModel(String nombre,String raza, int edad, String pedigree){
        super(nombre,raza,edad);
        this.pedigree = pedigree;
    }
    public String getPedigree(){
        return pedigree;
    }
    public void setPedigree(String pedigree){
        this.pedigree = pedigree;
        
    }
    @Override
    public String toString(){
        return "informacion del perro\n" + super.toString() + "\npedigree: "+
                pedigree;
    }
}