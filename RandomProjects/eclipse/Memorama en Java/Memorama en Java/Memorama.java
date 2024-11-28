

//Paquetes Utilizados para este Programa
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;

public class Memorama extends Frame implements MouseListener,MouseMotionListener{
	//Tablero del Juego se declara la matriz de 4 * 4 donde se colocaran las cartas en una forma aleatoria formando 8 parejas. 
	//REPRESENTAMOS LOS ELEMENTOS DE LA MATRIZ CON UN 0 AL INICIO DEL JUEGO YA QUE AL INICIO TODAS LAS CARTAS SE ENCUANTRAN
	//OCULTAS.
	private int tablero[][]={{0,0,0,0},
							 {0,0,0,0},
							 {0,0,0,0},
							 {0,0,0,0}};
	private boolean arriba[][];
	//private boolean bocaArriba[][];
	
	//CX y CY establecen el centro geométrico de las gráficas
	private final int CX=100;
	private final int CY=100;
	
	//guardar el valor del timer cuando se le da una pausa
	private int T;
	
	//para contar el numero de clic que da el jugador y el numero de errores
	private int NE=0;
	private int NC=0;
	private int k;
	private int l;
	
	//para saber que cartas se encuentran boca arriba	
	private int Arriba=0;
	private int carta1=0;
	private int carta2=0;
	//EX y EY establecen el tamaño de las gráficas
	private final int EX=100;
	private final int EY=100;
	
	//Variables con las cuales sabemos la posicion y movimiento del mouse
	private int mcy,mcx;
	private int mmx,mmy;
	
	//declaramos la variable r que almacenara el valor del random
	private Random r=new Random();
	
	
	//declamamos los objetos donde se cargaran la imagenes
	public ImageIcon imagenFondo;
	public ImageIcon imagenOculta;
	public ImageIcon imagen1;
	public ImageIcon imagen2;
	public ImageIcon imagen3;
	public ImageIcon imagen4;
	public ImageIcon imagen5;
	public ImageIcon imagen6;
	public ImageIcon imagen7;
	public ImageIcon imagen8;
	public String nombre;
	//la variable o y p guardan temporalmente las posiciones de la segunda carta al momento de ser volteada
	public int o;
	public int p;
	//lleva el control de las parejas encontradas
	public int parejas;
			
	//INSTANCIAMOS LAS VARIABLES PARA CONTROLAR EL TIMER
	private Timer timer;
	private int segundos;
	private boolean pausa=false;
			
	//Constructores********************
    public Memorama(){ 
    	 
        int i,j,k,l;
		addMouseListener(this);  //Escuchamos eventos de raton
        addMouseMotionListener(this); // y de movimientos de raton
    	setSize(1024,768);//**********************
    	
    	//Inicialización de la matriz arriba
    	arriba=new boolean[4][4];
    	for(i=0;i<4;i++)
    		for(j=0;j<4;j++)
    			arriba[i][j]=false;
    	
    	//Coloca las cartas en forma aleatoria, realiza este proceso hasta llenar la matriz
    	//asi se forman las parejas colocando cada una 2 veces pero en diferente posicion
    	for(k=1;k<=8;k++)
    		for(l=1;l<=2;l++){
    			do{
    				i=r.nextInt(4);
    				j=r.nextInt(4);
    			}while(tablero[i][j]!=0);
    			tablero[i][j]=k;
    		}
    		
    	//cargamos la imagenes
    	imagenOculta=new ImageIcon("oculta2.png");
    	imagenFondo=new ImageIcon("fondo.png");
    	imagen1=new ImageIcon("1.jpg");
    	imagen2=new ImageIcon("2.jpg");
    	imagen3=new ImageIcon("3.jpg");
    	imagen4=new ImageIcon("4.jpg");
    	imagen5=new ImageIcon("5.jpg");
    	imagen6=new ImageIcon("6.jpg");
    	imagen7=new ImageIcon("7.jpg");
    	imagen8=new ImageIcon("8.jpg");
    	
    	//pertenecen al timer
    		timer = new Timer();
			segundos = 120;
			//segundos = nivel;
			timer.schedule(new again(),0, 1*1000);
	//finalizan el timer
    	
    	//Termina de colocar las cartas de forma aleatoria
    	setUndecorated(true);
    	setResizable(false);
		setBackground(new Color(130,158,16));//Parte del Constructor
		setTitle(" MEMORAMA ");
		//para centrar en la pantalla
		Dimension Pantalla=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frame=this.getSize();
		setLocation((Pantalla.width/2-(frame.width/2)),Pantalla.height/2-(frame.height/2));
		setVisible(true);//Termina el Constructor
	}
	
	/*En este metodo se manda llamar a las Imagenes segun el valor v
    *si v tiene el valor de 0 esta oculta
    *si v tiene el valor de 1 y menor que 8 muestra la imagen que le corresponde de acuerdo al random 
    */
    
    public void dibCuadro(Graphics g, int px, int py,int v){
    	switch(v){
    		case 0:	g.drawImage(imagenOculta.getImage(),px,py,98,98,null);
    				break;
    		case 1:	g.drawImage(imagen1.getImage(),px+4,py+4,90,90,null);
    				break;
    		case 2:	g.drawImage(imagen2.getImage(),px+4,py+4,90,90,null);
    				break;
    		case 3:	g.drawImage(imagen3.getImage(),px+4,py+4,90,90,null);
    				break;
    		case 4:	g.drawImage(imagen4.getImage(),px+4,py+4,90,90,null);
    				break;
    		case 5:	g.drawImage(imagen5.getImage(),px+4,py+4,90,90,null);
    				break;
    		case 6:	g.drawImage(imagen6.getImage(),px+4,py+4,90,90,null);
    				break;
    		case 7:	g.drawImage(imagen7.getImage(),px+4,py+4,90,90,null);
    				break;
    		case 8:	g.drawImage(imagen8.getImage(),px+4,py+4,90,90,null);
    				break;		
    	}
    }
    //este metodo hace el cambio de la variable que viene desde el main para ser puesta en pantalla
    public void NOMBRE(String n){
    	nombre=n;
    }
    
    //METODO DONDE SE DIBUJA EN TABLERO DE JUEGO
    public void paint(Graphics g){
    	g.drawImage(imagenFondo.getImage(),0,0,1024,768,null);
    	g.setColor(Color.black);//Color de las letra 
		g.setFont(new Font("Arial", Font.BOLD, 22));//Tipo de letras
		g.drawString("! Miguel Angel, Hector Tello, Pedro Villa !",200,60);//nosotros
		g.setColor(Color.white);//Otro color
		g.drawString("! Miguel Angel, Hector Tello, Pedro Villa !",198,58);// nosotros 
    	g.setColor(Color.black);
       	int i,j;
    		for(i=0;i<4;i++){
	    		for(j=0;j<4;j++){
	    			if(arriba[i][j])
	    				dibCuadro(g,CX+j*EX,CY+i*EY,tablero[i][j]);
	    			else
	    				dibCuadro(g,CX+j*EX,CY+i*EY,0);
    			}
    		}
    		
    	//salir
    	g.setColor(Color.red);
    	g.fillRect(600,250,150,30);
    	
    	//pausar
    	g.setColor(Color.orange);
    	g.fillRect(599,380,150,30);
    	
    	//Inicio de Nuevo Juego
    	g.setColor(Color.green);
    	g.fillRect(599,310,150,30);
    	
    	//contenido de las opciones del juego
    	g.setFont(new Font("Arial", Font.BOLD, 16));
    	g.setColor(Color.white);    				
    	g.drawString("Salir del Juego",615,270);
    	g.setColor(Color.black); 
	   	g.drawString("Nuevo Juego",620,330);
	   	g.setColor(Color.blue); 
	   	g.drawString("Pausar",635,400);
	   	g.setColor(new Color(25,85,62));
	   	g.drawString("Nombre del Jugador: ",200,600);
	   	g.setColor(Color.black);
	   	g.drawString(""+nombre,400,620);
	   	g.setColor(new Color(45,52,0));
	   	String s="Tiempo: "+new Integer(segundos).toString();
	   	g.drawString(s,200,660);
	   	
    }
    
    //MEDODO DONDE SE REALIZA LA MAYORIA DE LOS PROCESOS DEL JUEGO
    public void mouseClicked(MouseEvent me){
    	NC=NC+1;//numero de clicks
    	mcx=me.getX();//toma la posicion del clic en x
    	mcy=me.getY();//toma la posicion del clic en y
       	int i,j;
       	//este if veridicva que se de clic sonbre el area de juego
    	if((mcx>=CX)&&(mcy>=CY)&&(mcx<=(CX+4*EX))&&(mcy<=(CY+4*EY))&&!pausa){
    		i=(mcy-CY)/EY;
    		j=(mcx-CX)/EX;
    	//nos sirve para verificar que la carta que se intenta voltear esta oculta y el numero de parejas es menos que 7
    	if(arriba[i][j]!=true&&parejas<=7){
    		if(!arriba[i][j]){
    			Arriba=Arriba+1;
    			arriba[i][j]=true;//Voltea la carta boca Arriba
    			//este if toma la posicion de tablero[i][j] y se las asigna a o y p que son de la primera carta
    			//y la variable carta guarda el valor de la primera carta
    			if(Arriba==1){
    				carta1+=tablero[i][j];
    				o=i;
    				p=j;
    			}
    			//cuando Arriba vale 2 la variable carta2 toma el valor de la posicion de tablero[i][j]
    			if(Arriba==2){
    				carta2+=tablero[i][j];
    				//compara el valor de las dos cartas si son iguales determina que es una pareja
    				if(carta1==carta2){
    					JOptionPane.showMessageDialog(null,"Forman una pareja","Memorama en Java", JOptionPane.PLAIN_MESSAGE);
    					//regresamos el valor de las variables a sus valores iniciales
		    			Arriba=0;
    					carta1=0;
    					carta2=0;
    					//colocamos las cartas en vardadero para dejarlas visibels durante el resto del juego
    					arriba[i][j]=true;
    					arriba[o][p]=true;
    					//contabilizamos el numero de parejas
    					parejas=parejas+1;
    					//si el numero de parejas a llegado a 8 entonces damos por concluido el juego
    					if(parejas==8){
    						//detenemos el timer
    						timer.cancel();
    						//mandamos el mensaje de fin de juego
    						JOptionPane.showMessageDialog(null,"Fin del Juego..!!","Memorama en Java", JOptionPane.PLAIN_MESSAGE);	
    						//mandamos el numero de clicks y de erroes
    						//JOptionPane.showMessageDialog(null,"Numero Total de Clicks: "+NC,"Memorama en Java", JOptionPane.PLAIN_MESSAGE);
    						JOptionPane.showMessageDialog(null,"Numero Total de Errores: "+NE,"Memorama en Java", JOptionPane.PLAIN_MESSAGE);
    							if(NE<=6){
    								JOptionPane.showMessageDialog(null,"Juego Excelente.."+"\n"+" FELICIDADES..!! "+"\n"+nombre,"Memorama en Java - [ Resultado ]", JOptionPane.PLAIN_MESSAGE);	
    							}
    							else if(NE<=8){
    								JOptionPane.showMessageDialog(null,"Juego Bueno !!","Memorama en Java - [ Resultado ]", JOptionPane.PLAIN_MESSAGE);	
    							}
    							else if(NE<=12){
    								JOptionPane.showMessageDialog(null,"Juego Regular !!","Memorama en Java - [ Resultado ]", JOptionPane.PLAIN_MESSAGE);	
    							}
    							else{
    								JOptionPane.showMessageDialog(null,"Almenos lo Terminaste","Memorama en Java - [ Resultado ]", JOptionPane.PLAIN_MESSAGE);	
    							}
    					}
		    		}
		    		else{
		    			//si el valor de las cartas no es igual regresamos el 
		    			//valor de las variables y colocamos las posiciones de las cartas en falso
		    			//ya que estas no forman una pareja
		    			NE=NE+1;
		    			JOptionPane.showMessageDialog(null,"No forman pareja..!!","Memorama en Java", JOptionPane.PLAIN_MESSAGE);
    					Arriba=0;
    					carta1=0;
    					carta2=0;
    					arriba[i][j]=false;
    					arriba[o][p]=false;;
	   				}
	   			}
    	  }
    	  else{
    	 	arriba[i][j]=false;//Cata oculta
    	  }//fin de la comparacion
    	  }//fin del arriba
    	}//fin del if de mcx mcy 
    	
    	//avisa si el juego esta en pausa y el jugador intenta volter una carta
    	if(pausa&&!(mcx>=600&&mcx<=750&&mcy>=250&&mcy<=280)&&!(mcx>=600&&mcx<=750&&mcy>=380&&mcy<=410)){
    		JOptionPane.showMessageDialog(null,"El juego esta en pausa..","Memorama en Java", JOptionPane.PLAIN_MESSAGE);
    	}
    	//termina la aplicacion     	
    	if(mcx>=600&&mcx<=750&&mcy>=250&&mcy<=280){
    		System.exit(0);
    	}
    	//pone en pausa el juego
    	if(mcx>=600&&mcx<=750&&mcy>=380&&mcy<=410){
    		pausa=!pausa;
    			if(pausa){
  					T=segundos; 
  					timer.cancel();
  					JOptionPane.showMessageDialog(null,"Juego en pausa..","Memorama en Java", JOptionPane.PLAIN_MESSAGE);  			
    			}
    			//quita la pausa el juego
    			else{
    				//si el juego ha terminado y el usuario da un clic sobre el area de pausa 
    				//verifica si no ha terminado aun el juego
    				if(parejas<8){
    					//Para quitar la pausa e inicializar nuevamente le timer
    					JOptionPane.showMessageDialog(null,"Continua el juego..","Memorama en Java", JOptionPane.PLAIN_MESSAGE);
    					timer = new Timer();
						segundos = T;
						timer.schedule(new again(),0, 1*1000);
					}
					else{
						JOptionPane.showMessageDialog(null,"El Juego ha Terminado..!!","Memorama en Java", JOptionPane.PLAIN_MESSAGE);
					}
    			}
    	}
    	//para reinizializar el juego
    	if(mcx>=599&&mcx<=749&&mcy>=310&&mcy<=340){
    		timer.cancel();
    		String nombre1="";
    		nombre1=JOptionPane.showInputDialog(null,"Nombre del nuevo Jugador","Memorama en Java", JOptionPane.PLAIN_MESSAGE);
    		Memorama newPlayer= new Memorama();
    		newPlayer.NOMBRE(nombre1);
    		repaint();
    	}
    }
 	//metodo mouseMoved: no requerido para el programa hasta ahora
 	public void mouseMoved(MouseEvent me){
 	}
 	//metodo mousePressed: no requerido para el programa hasta ahora
 	public void mousePressed(MouseEvent e){
    }
    //metodo mouseReleased: no requerido para el programa hasta ahora
    public void mouseReleased(MouseEvent e){
    }
    //metodo mouseEntered: no requerido para el programa hasta ahora	
	public void mouseEntered(MouseEvent me){
	}
	//metodo mouseExited: no requerido para el programa hasta ahora
	public void mouseExited(MouseEvent me){
	}
 	//metodo mouseDragged: no requerido para el programa hasta ahora
    public void mouseDragged(MouseEvent e){
    }

	//clase donde se lleva acabo el proceso del timer
class again extends TimerTask {
	public void run() {
		repaint();
		if(segundos==30){
			JOptionPane.showMessageDialog(null,"Case termina el Juego: "+"\n"+segundos+" Segunos ","Aviso..!!",JOptionPane.PLAIN_MESSAGE);
		}
		if(segundos<=0){
			JOptionPane.showMessageDialog(null,"Fin del Juego"+" ","MEMORAMA",JOptionPane.PLAIN_MESSAGE);
			timer.cancel(); 
			JOptionPane.showMessageDialog(null,"Numero de clicks"+NC);
		}
		segundos--;
	}
}
	//Metodo main: Punto de Inicio para la Ejecución el Programa si es que no se desea ejecuntar desde el intro
/*public static void main(String args[])
    {
    	String nombre1="";
    	nombre1=JOptionPane.showInputDialog(null,"Nombre del Jugador","Memorama en Java", JOptionPane.PLAIN_MESSAGE);
    	if(nombre1!=null){
    	   	Memorama coordenada= new Memorama();
    	   	coordenada.NOMBRE(nombre1);
    	}	
 }*/
}