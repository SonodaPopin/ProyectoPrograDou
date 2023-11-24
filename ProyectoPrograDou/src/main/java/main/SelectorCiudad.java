package main;

public class SelectorCiudad {
	int actual;
	public SelectorCiudad(int actual) {
		this.actual = actual;
	}
	public void Anterior() {
		actual--;
	}
	public void Siguiente() {
		actual++;
	}
}
