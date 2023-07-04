
import java.awt.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;
public class intro extends Frame{
	//variables para controlar el timer
	private Timer timer;
	private int segundos;
	//en esta variable se almacenara la imagen de fondo
	public ImageIcon imagenFondo;
	
	//constructor de la ventana de inicio
	public intro(){
		//asignamos la imagen que contendra a la variable imageIcon
		imagenFondo=new ImageIcon("fondo.jpg");
		setSize(600,400);
		setUndecorated(true);
    	setResizable(false);
		setBackground(Color.white);
		setTitle(" Cargando.. ");
		//para centrar en la pantalla
		Dimension Pantalla=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frame=this.getSize();
		setLocation((Pantalla.width/2-(frame.width/2)),Pantalla.height/2-(frame.height/2));
		setVisible(true);
	//pertenecen al timer
    	timer = new Timer();
		segundos = 0;
		timer.schedule(new again(),0, 1*300);
	//finalizan el timer
	
	}
	
	public void paint(Graphics g){
		g.drawImage(imagenFondo.getImage(),0,0,600,400,null);
    	g.setColor(Color.blue);
    	g.setFont(new Font("Arial", Font.BOLD, 18));
    	String s="CARGANDO.. "+new Integer(segundos).toString()+" %";
	   	g.drawString(s,150,400);
	}

class again extends TimerTask {
	public void run(){
		repaint();
		if(segundos==100){
			timer.cancel();
			String nombre1="";
    		nombre1=JOptionPane.showInputDialog(null,"Nombre del Jugador","Memorama en Java", JOptionPane.PLAIN_MESSAGE);
    		if(nombre1!=null){
    			Memorama coordenada= new Memorama();
    	   			coordenada.NOMBRE(nombre1);
    		}
    		else{
    			System.exit(0);
    		}
		}
		segundos=segundos+4;
	}
}
	public static void main(String args[]){
		intro i=new intro();
	}
}
