package disenio.disenio;

import java.util.Set;

import disenio.POI;

public class LocalComercial extends POI {
    public LocalComercial () {
    		super();
        } 
    public LocalComercial(String nombre, double latitud, double longitud,Set<String> palabras)
    {
    	super(nombre, latitud, longitud,palabras);
    }
	
}