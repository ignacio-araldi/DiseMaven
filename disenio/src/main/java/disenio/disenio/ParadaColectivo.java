package disenio.disenio;

import java.util.Set;

import disenio.POI;

public class ParadaColectivo extends POI{
	
	public ParadaColectivo (int nuevoNro) {
			super();
			setRadioLimite(1);
		}
	
	public ParadaColectivo () {
		super();
	}
	
    public ParadaColectivo(int id,String nombre, double latitud, double longitud,Set<String> palabras){
		super(nombre,latitud,longitud,palabras);
    	setId(id);
    }
	
    public Boolean calculoDisponibilidad () { 
    		return true;
    	}

	}