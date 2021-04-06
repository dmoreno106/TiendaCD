/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendacd;

/**
 *Esta clase define objetos CD con sus atributos correspondientes
 * @author Diurno
 */
public class CD {
    private String nombre;
    private String genero;
    private double precio;
    private int nExistencias;
    
    /**
     * 
     * @param nombre define el nombre del CD
     * @param precio establece el precio que tendrá el CD
     * @param existencias establece el numero de nExistencias del CD
     * @param genero define el genero del CD
     */
    public CD(String nombre,double precio, int existencias,String genero) {
        this.nombre = nombre;
        this.precio = precio;
        this.nExistencias = existencias;
        this.genero=genero;
    }

    /**
     * 
     * @return devuelve el nombre del CD
     */
    
    public String getNombre() {
        return nombre;
    }
    
    /**
     * 
     * @param nombre String introducido para establecer el nombre del CD
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return  devuelve el precio del CD
     */
    public double getPrecio() {
        return precio;
    }
    
    /**
     * 
     * @param precio double introducido para establecer el precio del CD
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * 
     * @return devuelve el numero de nExistencias del CD
     */
    public int getExistencias() {
        return nExistencias;
    }

    /**
     * 
     * @param existencias int introducido para establecer el numero de existencias del CD
     */
    public void setExistencias(int existencias) {
        this.nExistencias = existencias;
    }

    /**
     * 
     * @return devuelve el genero del CD
     */
    public String getGenero() {
        return genero;
    }

    /**
     * 
     * @param genero String introducido para establecer el genero del CD
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    /**
     * metodo que añade existencias del CD a las actuales
     * @param existencias numero de existencias que se añaden
     */
    public void aumentaExistencias(int existencias){
        setExistencias(existencias+getExistencias());
    }
    
    /**
     * establece un descuento en el precio del CD
     * @param descuento indica el descuento que se le aplica en % (siendo 5 un 5% de descuento)
     */
    public void descuento(int descuento){
        setPrecio(precio*(descuento/100));
    }
}