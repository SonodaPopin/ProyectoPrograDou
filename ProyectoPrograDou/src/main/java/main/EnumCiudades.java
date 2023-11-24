package main;

import Ciudades.*;

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
    public static Ciudad getCiudad(int a) {
        return EnumCiudades.values()[a].lugar;
    }
}
