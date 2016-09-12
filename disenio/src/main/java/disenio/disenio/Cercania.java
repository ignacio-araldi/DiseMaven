package disenio.disenio;

import disenio.POI;

public interface Cercania {
	Boolean calculoDeCercania(double latitud,double longitud ,POI unPoi);
	
	Boolean calculoDeCercania(int comuna,POI unPoi);
	
}
