package chamorro.edisson.ejercicioInterfaces;

import javax.swing.JOptionPane;

public class Coche implements Vehiculo {

	public Coche(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String Acelerar(int valor) {

		if ((velocidad + valor) < Vehiculo.VelMax) {
			velocidad += valor;
		} else {
			JOptionPane.showMessageDialog(null, " El carro supera el limite de 120 Km/h");
		}

		return "El carro esta acelerando, ahora con una velocidad de: " + velocidad + " Km/h";
	}

	@Override
	public String Frenar(int valor) {

		if (velocidad >= 0) {
			velocidad -= valor;
		} else {
			JOptionPane.showMessageDialog(null, " El carro ya está detenido ");
			velocidad = 0;
		}
		return "El carro esta frenando, ahora con una velocidad de: " + velocidad + " Km/h";
	}

	@Override
	public int Plazas() {

		return 5;
	}

	private int velocidad;

}
