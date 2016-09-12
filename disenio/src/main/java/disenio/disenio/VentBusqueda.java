package disenio.disenio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentBusqueda extends JFrame implements ActionListener {
	
	private JPanel panel;
    private JLabel texto ,texto2;           // etiqueta o texto no editable
    private JTextField caja , caja2;        // caja de texto, para insertar datos
    private JButton boton , boton2;          // boton con una determinada accion

    public VentBusqueda() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }

    private void configurarVentana() {
        this.setTitle("Busqueda");                   // colocamos titulo a la ventana
        this.setSize(400, 300);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

    private void inicializarComponentes() {
        // creamos los componentes
        texto = new JLabel();
        texto2 = new JLabel();
        caja = new JTextField();
        caja2 = new JTextField();
        boton = new JButton();
        boton2 = new JButton();
        // configuramos los componentes
        texto.setText("Usuario");    // colocamos un texto a la etiqueta
        texto.setBounds(150, 25, 100, 25);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        caja.setBounds(150, 50, 100, 25);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        texto2.setText("Contrase�a");    // colocamos un texto a la etiqueta
        texto2.setBounds(150, 75,100, 25); 
        caja2.setBounds(150, 100, 100, 25);
        
        boton.setText("Ok");   // colocamos un texto al boton
        boton.setBounds(100, 150, 75, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        boton.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        boton2.setText("Cancelar");
        boton2.setBounds(250, 150, 120, 30); 
        boton2.addActionListener(this);
        // adicionamos los componentes a la ventana
        this.add(texto);
        this.add(texto2);
        this.add(caja);
        this.add(caja2);
        this.add(boton);
        this.add(boton2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String usuario = caja.getText();   // obtenemos el contenido de la caja de texto
        String contra = caja2.getText();
       // if(usuarioExiste(usuario , contra)){}
       // JOptionPane.showMessageDialog(this, "Hola " + usuario + ".");    // mostramos un mensaje (frame, mensaje)
        HolaMundoSwing vent = new HolaMundoSwing();
        vent.setVisible(true);
    }

}
