package chamorro.edisson.threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//en este ejercicio se usara un lock y unlock para bloquear codigo hasta que un hilo realice su accion
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco banco = new Banco();

		for (int i = 0; i < 100; i++) {
			EjecutandoTransferencia r = new EjecutandoTransferencia(banco, i, 2000);

			Thread hilo = new Thread(r);

			hilo.start();
		}
	}

}

class Banco {

	private final double[] cuentas;
	private Lock bloqueoMetodoTransferencia = new ReentrantLock();
	private Condition saldoSuficiente;

	public Banco() {
		cuentas = new double[100];

		for (int i = 0; i < 100; i++) {

			cuentas[i] = 2000;
		}
		saldoSuficiente = bloqueoMetodoTransferencia.newCondition();
	}

	public void transferencia(int cuentaOrigen, int cuentaDestino, double dinero) throws InterruptedException {
		// bloquea codigo para que se ejecute por hilo
		bloqueoMetodoTransferencia.lock();

		try {
			// if (cuentas[cuentaOrigen] >= dinero) {
			while (cuentas[cuentaOrigen] < dinero) {
			
					System.out.println("hilo "+Thread.currentThread().getName()+" dormido");
					saldoSuficiente.await();
		
			}
			System.out.println(Thread.currentThread().getName());
			cuentas[cuentaDestino] += dinero;
			cuentas[cuentaOrigen] -= dinero;
			// System.out.println(dinero + " de la cuenta " + cuentaOrigen + " a la cuenta "
			// + cuentaDestino);
			System.out.printf("%10.2f de %d para la cuenta %d%n", dinero, cuentaOrigen, cuentaDestino);
			// System.out.println(getSaldoTotal());
			System.out.printf("Saldo total %10.2f%n", getSaldoTotal());
			saldoSuficiente.signalAll();

		} finally {
			bloqueoMetodoTransferencia.unlock();
		}

	}

	public double getSaldoTotal() {

		double sumaSaldoBanco = 0;

		for (double e : cuentas) {

			sumaSaldoBanco += e;
		}
		return sumaSaldoBanco;
	}

}

class EjecutandoTransferencia implements Runnable {

	private Banco banco;
	private int cuentaOrigen;

	public EjecutandoTransferencia(Banco banco, int cuentaOrigen, double cantidadMaxima) {
		this.banco = banco;
		this.cuentaOrigen = cuentaOrigen;
		this.cantidadMaxima = cantidadMaxima;
	}

	private double cantidadMaxima;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			int cuentaDestino = (int)(Math.random() * 100);

			double cantidadATransferir = cantidadMaxima * Math.random();

			try {
				banco.transferencia(cuentaOrigen, cuentaDestino, cantidadATransferir);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}