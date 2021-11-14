package chamorro.edisson.ejercicioInterfaces;

import javax.swing.JOptionPane;

public class Moto implements Vehiculo {
	public Moto(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String Acelerar(int valor) {

		if (velocidad + valor < VelMax) {
			velocidad += valor;
		} else {
			JOptionPane.showMessageDialog(null, " El carro supera el limite de 120 Km/h");
		}

		return "La moto está acelerando, ahora con una velocidad de: " + velocidad + " Km/h";
	}

	@Override
	public String Frenar(int valor) {

		if (velocidad >= 0) {
			velocidad -= valor;
		} else {
			velocidad = 0;
		}
		return " La moto está frenando, ahora con una velocidad de: " + velocidad + " Km/h";
	}

	@Override
	public int Plazas() {

		return 2;
	}

	public int getVelocidad() {
		return velocidad;
	}

	private int velocidad;

}
