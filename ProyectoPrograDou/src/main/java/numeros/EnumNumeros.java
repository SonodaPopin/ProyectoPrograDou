package numeros;

/**
 * Enum que ordena los números disponibles para representar fechas
 */
public enum EnumNumeros {
	NOCERO(new Numero1()),
	UNO(new Numero1()),
	DOS(new Numero2()),
	TRES(new Numero3()),
	CUATRO(new Numero4()),
	CINCO(new Numero5()),
	SEIS(new Numero6()),
	SIETE(new Numero7()),
	OCHO(new Numero8()),
	NUEVE(new Numero9()),
	DIEZ(new Numero10()),
	ONCE(new Numero11()),
	DOCE(new Numero12()),
	TRECE(new Numero13()),
	CATORCE(new Numero14()),
	QUINCE(new Numero15()),
	DIECISEIS(new Numero16()),
	DIECISIETE(new Numero17()),
	DIECIOCHO(new Numero18()),
	DIECINUEVE(new Numero19()),
	VEINTE(new Numero20()),
	VEINTIUNO(new Numero21()),
	VEINTIDOS(new Numero22()),
	VEINTITRES(new Numero23()),
	VEINTICUATRO(new Numero24()),
	VEINTICINCO(new Numero25()),
	VEINTISEIS(new Numero26()),
	VEINTISIETE(new Numero27()),
	VEINTIOCHO(new Numero28()),
	VEINTINUEVE(new Numero29()),
	TREINTA(new Numero30()),
	TREINTAYUNO(new Numero31());
	
    Numero num;
    EnumNumeros (Numero num){
        this.num = num;
    }
    /**
     * Método que entrega un panel con la imagen del número solicidato
     * @param a - número solicitado
     * @return - panel con el número dibujado
     */
    public static Numero getNumero(int a) {
        return EnumNumeros.values()[a].num;
    }
}
