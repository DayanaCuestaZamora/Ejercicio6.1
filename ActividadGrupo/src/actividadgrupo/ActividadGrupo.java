/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadgrupo;

/**
 *
 * @author Aprendiz
 */
public class ActividadGrupo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        System.out.println("lina marcela barrera garcia");
        Anime objeto = new Anime();
        objeto.setNombre("Noragami");
        System.out.println("Nombre" + "  : " + objeto.getNombre());
        
        Sunami objeto1 = new Sunami();
        System.out.println("kevin rincon mendez");
        objeto1.setNombre("soacha");
        System.out.println(objeto1.getNombre());
    
        System.out.println("johan narvaez gonzalez ");
        Celular objeto2 = new Celular();
        objeto2.setMarca("ALCATEL");
        System.out.println(objeto2.getMarca());
        
           System.out.println("Dayana cuesta zamora");
        Memoria objeto3 = new Memoria();
        objeto3.setMarca("SanDisk");
        System.out.println(objeto3.getMarca());
    }

}
