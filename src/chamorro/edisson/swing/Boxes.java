package chamorro.edisson.swing;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Boxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBox marcoBox = new MarcoBox();
	}

}

class MarcoBox extends JFrame {

	public MarcoBox() {

		setTitle("Disposicion");
		setBounds(100, 200, 200, 200);
		// ------ primer box
		JLabel nUsuario = new JLabel("Nombre");
		JTextField cUsuario = new JTextField(10);
		cUsuario.setMaximumSize(cUsuario.getPreferredSize());
		Box cajaUsuario = Box.createHorizontalBox();
		cajaUsuario.add(nUsuario);
		cajaUsuario.add(Box.createHorizontalStrut(10));
		cajaUsuario.add(cUsuario);
		// --------------- segundo box
		JLabel nPass = new JLabel("Contraseña");
		JTextField cPass = new JTextField(10);
		cPass.setMaximumSize(cUsuario.getPreferredSize());
		Box cajaPassword = Box.createHorizontalBox();
		cajaPassword.add(nPass);
		cajaPassword.add(Box.createHorizontalStrut(10));
		cajaPassword.add(cPass);
		// --------------- tercer box
		JButton boton1 = new JButton("Ok");
		JButton boton2 = new JButton("Cancel");
		
		Box cajaBotones = Box.createHorizontalBox();
		cajaBotones.add(boton1);
		
		cajaBotones.add(Box.createGlue());
		cajaBotones.add(boton2);
		//-------- vertical box 
		Box cajaVertical = Box.createVerticalBox();
		cajaVertical.add(cajaUsuario);
		cajaVertical.add(cajaPassword);
		cajaVertical.add(cajaBotones);
		
		add(cajaVertical);
		setVisible(true);
		
	}
}