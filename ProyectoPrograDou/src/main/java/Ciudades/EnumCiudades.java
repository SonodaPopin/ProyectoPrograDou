package Ciudades;

/**
 * Enum que ordena las ciudades disponibles para viajar
 */
public enum EnumCiudades {
    ANTOFAGASTA(new Antofagasta()),
    ARICA(new Arica()),
	CALAMA(new Calama()),
	CHILLÁN(new Chillán()),
	CONCEPCIÓN(new Concepcion()),
	COPIAPÓ(new Copiapó()),
	IQUIQUE(new Iquique()),
	LASERENA(new LaSerena()),
	LOSÁNGELES(new LosÁngeles()),
	PUERTOMONTT(new PuertoMontt()),
	SANTIAGO(new Santiago()),
	TALCA(new Talca()),
	TEMUCO(new Temuco()),
	VALDIVIA(new Valdivia()),
	VALPARAÍSO(new Valparaíso());	
	
    Ciudad lugar;
    EnumCiudades (Ciudad lugar){
        this.lugar = lugar;
    }
    /**
     * Método para obtener un panel con el nombre de la ciudad en la posición entregada
     * @param a - posición en el enum de la ciudad
     * @return - panel con el nombre de la ciudad
     */
    public static Ciudad getCiudad(int a) {
        return EnumCiudades.values()[a].lugar;
    }
}
