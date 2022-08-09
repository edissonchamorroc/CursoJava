package chamorro.edisson.threads;

public class SincronizarHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SincronizaThreads hilo1 = new SincronizaThreads();
		SincronizaThreads2 hilo2 = new SincronizaThreads2(hilo1);
		SincronizaThreads2 hilo3 = new SincronizaThreads2(hilo2);
		hilo1.start();
		hilo2.start();
		hilo3.start();
		System.out.println("se terminó");
	}

}
class SincronizaThreads extends Thread{
		
	public void run() {
		
		for(int i=0;i<20;i++) {
		System.out.println("Ejecutando hilo "+ getName());
		}
	}
}
class SincronizaThreads2 extends Thread{
	
	private Thread hilo;
	
	public SincronizaThreads2(Thread hilo) {
		this.hilo = hilo;
	}
	
	public void run() {
		
		try {
			hilo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<20;i++) {
		System.out.println("Ejecutando hilo "+ getName());
		}
	}
}