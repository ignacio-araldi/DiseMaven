package disenio.disenio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



import javax.swing.JLabel;
import javax.swing.JTextField;

public class Loguin extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	public Loguin() {
		getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(67, 37, 46, 14);
		getContentPane().add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(132, 34, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(32, 85, 81, 14);
		getContentPane().add(lblContrasea);
		
		textField_1 = new JTextField();
		textField_1.setBounds(132, 82, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLoguearse = new JButton("Loguearse");
		btnLoguearse.setBounds(45, 177, 89, 23);
		getContentPane().add(btnLoguearse);
		EventoLog eventolog =new EventoLog();
		btnLoguearse.addActionListener(eventolog);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(206, 177, 89, 23);
		getContentPane().add(btnCancelar);
		Cancelar canc = new Cancelar();
		btnCancelar.addActionListener(canc);
		
		
		Loguearse melogueo= new Loguearse();
		
		btnLoguearse.addActionListener(melogueo);
		
	
	}
	
	private class EventoLog implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("usuario logueado");
		}
	}
	
	private class Loguearse implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//iniciarsesion
			//verificar que el logueo coincida con lo nuestro y hacer un if para q se haga
			//lo que sigue abajo
			
			
	
			
			}
	}
	
	private class Cancelar implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
	
    }
}
