package chamorro.edisson.abstractas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Temporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reloj mireloj=new Reloj();
		
		mireloj.ejecutarTemporizador(3000,true);
		
		JOptionPane.showMessageDialog(null, " pulsa ok para terminar ");
	}

}
class Reloj{
	
	
	public void ejecutarTemporizador(int intervalo, boolean sonido) {
		
		/*class DameLaHora implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Date ahora=new Date();
				System.out.println(" Te pongo la hora cada 3 seg:"+ ahora);
			}
			
		}
		ActionListener oyente=new DameLaHora();*/
		
		Timer miTemporizador=new Timer(intervalo,new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Date ahora=new Date();
				System.out.println(" Te pongo la hora cada 3 seg:"+ ahora);
			}
			
		});
		
		if(sonido) Toolkit.getDefaultToolkit().beep();
		
		miTemporizador.start();
	}
	
	
	
}
