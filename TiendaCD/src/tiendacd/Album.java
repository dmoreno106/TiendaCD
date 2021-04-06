/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendacd;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *Esta clase define objetos Album con los atributos dados 
 * @author Diurno
 */


public class Album {
  
   private ArrayList<CD> cds;
   private int numeroAlbum;
   private LocalDate fechaEstreno;

   /**
    * 
    * @param numeroAlbum es el numero de album publicado su un autor por orden cronologico
    * @param fechaEstreno es la fecha en la que se estrenó el album
    */
    public Album(int numeroAlbum, LocalDate fechaEstreno) {
        this.cds = new ArrayList<>();
        this.numeroAlbum = numeroAlbum;
        this.fechaEstreno = fechaEstreno;
    }
    
    /**
     * 
     * @return devuelve un ArrayList de objetos "CD"
     */
    public ArrayList<CD> getCds() {
        return cds;
    }

    /**
     * 
     * @param cds Arraylist de objetos "CD" insertado para establecer una lista de CD
     */
    public void setCds(ArrayList<CD> cds) {
        this.cds = cds;
    }

    /**
     * 
     * @return devuelve el número del album
     */
    public int getNumeroAlbum() {
        return numeroAlbum;
    }

    /**
     * 
     * @param numeroAlbum int que se establece como el número del album
     */
    public void setNumeroAlbum(int numeroAlbum) {
        this.numeroAlbum = numeroAlbum;
    }

    /**
     * 
     * @return devuelve la fecha de estreno del album
     */
    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    /**
     * 
     * @param fechaEstreno LocalDate que establece la fecha de estreno del album 
     */
    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }
    
    
    
    /**
     * añade un CD al arrayList de CD del album
     * @param cd objeto CD a introducir
     */
       public void introduceCD(CD cd){
        cds.add(cd);
    }
     
       /**
        * cd borra un objeto CD del arrayList de CD (si ya contenía el objeto)
        * @param cd   objeto CD a borrar
        */
      public void borraCD(CD cd){
          cds.remove(cd);
      }
      
      
}
