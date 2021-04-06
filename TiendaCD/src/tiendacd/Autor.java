/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendacd;

import java.util.ArrayList;

/**
 *Esta clase define objetos autor con sus atributos correspondientes
 * @author Diurno
 */
public class Autor {
    //campos
     private String nombre;
     private int edad;
     private ArrayList<Album> albumes;
     private String[] premios;
     
     
     /**
      * 
      * @param nombre es el nombre del artista 
      * @param edad es la edad del artista
      */
    public Autor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.albumes = new ArrayList<>();
        this.premios = new String[10];
    }
    
    /**
     * 
     * @return nombre del autor
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * 
     * @param nombre string introducido para establecerse como nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @return edad del autor
     */
    
    public int getEdad() {
        return edad;
    }

    /**
     * 
     * @param edad int introducido para establecerse como edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * 
     * @return devuelve un array de String con los premios ganados
     */
    public String[] getPremios() {
        return premios;
    }

    /**
     * 
     * @param premios Array  de
     * String introducido para establecerse como los premios ganados
     */
    public void setPremios(String[] premios) {
        this.premios = premios;
    }
    
    /**
     *añade un album nuevo en el arrayList de albums 
     * de un autor
     * @param album album introducido para ser añadido al arrayList de autor
     */
    public void introduceAlbum(Album album){
        albumes.add(album);
    }
    
    /**
     * elimina un album del arrayList de albums
     * de un autor
     * @param album album introducido para borrar el objeto Album que sea igual a este contenido en el ArrayList albumes
     */
    public void borraAlbum(Album album){
        albumes.remove(album);
    }
    
    /**
     * añade un premio al array premios si este no estaba ya contenido en el array.
     * Se coloca en una posición vacia
     * 
     * @param premio String con el nombre de un premio que se 
     * intentará añadir a el array 
     * 
     * 
     * @return devuelve true si el premio se ha introducido y false 
     * si no
     */
    public boolean ganaPremio(String premio){
        for (int i = 0; i <premios.length; i++) {
                if(premios[i].equalsIgnoreCase(premio)){
                 return false; 
            }
                if(premios[i].isEmpty()){
                  premios[i]=premio;
          }
        }
       return true;
    }
     
     
}
