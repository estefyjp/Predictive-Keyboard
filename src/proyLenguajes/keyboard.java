package proyLenguajes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;


public class keyboard extends JFrame{
	static JFrame frame;
	private JButton btnQ = new JButton("Q");
	private JButton btnW = new JButton("W");
	private JButton btnE = new JButton("E");
	private JButton btnR = new JButton("R");
	private JButton btnT = new JButton("T");
	private JButton btnY = new JButton("Y");
	private JButton btnU = new JButton("U");
	private JButton btnI = new JButton("I");
	private JButton btnO = new JButton("O");
	private JButton btnP = new JButton("P");
	private JButton btnA = new JButton("A");
	private JButton btnS = new JButton("S");
	private JButton btnD = new JButton("D");
	private JButton btnF = new JButton("F");
	private JButton btnG = new JButton("G");
	private JButton btnH = new JButton("H");
	private JButton btnJ = new JButton("J");
	private JButton btnK = new JButton("K");
	private JButton btnL = new JButton("L");
	private JButton btnZ = new JButton("Z");
	private JButton btnX = new JButton("X");
	private JButton btnC= new JButton("C");
	private JButton btnV = new JButton("V");
	private JButton btnB = new JButton("B");
	private JButton btnN = new JButton("N");
	private JButton btnM = new JButton("M");

	int w =20;
	int h =10;
	public Color BLACK;
	
	public static JTextField cadena= new JTextField(); //donde el usuario ingresa la cadena
	public JLabel entra; //label que defina el textfield de la entrada
	public JLabel resultado; //muestra al usuario que cadena está ingresando
	public JLabel validacion; //label que defina el textfield de la entrada
	public JLabel instr1; //label que defina el textfield de la entrada

	public JButton opcion1 = new JButton(" ");
	public JButton opcion2 = new JButton(" ");
	public JButton opcion3 = new JButton(" ");
	public static String cadenaEntradaTEXT = " ";  //la cadena actual 
	public static String cadenaEntradaBOTON = "";  //la cadena actual 
	public String s;
	public String opt1, opt2, opt3; //opciones de plabras que se muestran a usuario
	
	//división de paneles para border layout
    JPanel northPanel = new JPanel();
    JPanel centerpanel = new JPanel();
    JPanel southpanel = new JPanel();
	
	public keyboard(){
		frame = new JFrame("Text");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout()); //border layout divide en secciones el frame
		//frame.setContentPane(new JLabel(new ImageIcon("/Users/EstefyJacobo/Documents/workspace/aeroRoot/src/skyline.png")));
		createGUI();
		frame.setPreferredSize(new Dimension(800, 200));
		/*for (int i = 0; i < getContentPane().getComponentCount(); i++) {
            getContentPane().getComponent(i).setBackground(Color.BLACK);
        }
		centerpanel.setBackground(BLACK);
		northPanel.setBackground(BLACK);
		southpanel.setBackground(BLACK);*/
        frame.add(centerpanel,BorderLayout.CENTER);
        frame.add(northPanel,BorderLayout.NORTH);
        frame.add(southpanel,BorderLayout.SOUTH);
		frame.pack();
		
		frame.setVisible(true);
	}
	
	private void createGUI() {
        //NORTH
        //cadena = new JTextField();
        entra = new JLabel("Entra: ");
        resultado = new JLabel("Cadena: ");
        cadena.setPreferredSize(new Dimension(200,24));
        northPanel.add(entra);
        northPanel.add(cadena);
	  	northPanel.add(resultado);

	  	
	  	//SOUTH
		instr1 = new JLabel("Los símbolos permitidos en el lenguaje son {A-Z, a-z}");
	  	validacion = new JLabel("Validación");
	  	southpanel.add(instr1);
	  	southpanel.add(opcion1);
	  	southpanel.add(opcion2);
	  	southpanel.add(opcion3);
	  	southpanel.add(validacion);		


              
        //CENTER
        centerpanel.setPreferredSize(new Dimension(800,400));
        centerpanel.add(btnQ); 
        btnQ.addActionListener(new ActionListener(){  //cada boton tiene su action listener para detectar que fue ingrsada una letra
            public void actionPerformed(ActionEvent e) {
            	botones('q');							//se manda llamar botones que modificara la cadena ingresada y llama funcion de busqueda
            }
        });
        centerpanel.add(btnW);
        btnW.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('w');
            }
        });      
        centerpanel.add(btnE);
        btnE.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('e');
            }
        });
        centerpanel.add(btnR);
        btnR.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent r) {
            	botones('r');
            }
        });
        centerpanel.add(btnT);
        btnT.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('t');
            }
        });
        centerpanel.add(btnY);
        btnY.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('y');
            }
        });
        centerpanel.add(btnU);
        btnU.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('u');
            }
        });
        centerpanel.add(btnI);
        btnI.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('i');
            }
        });      
        centerpanel.add(btnO);
        btnO.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('o');
            }
        });
        centerpanel.add(btnP);
        btnP.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('p');
            }
        });
        centerpanel.add(btnA);
        btnA.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('a');
            }
        });
        centerpanel.add(btnS);
        btnS.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('s');
            }
        });
        centerpanel.add(btnD);
        btnD.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('d');
            }
        });
        centerpanel.add(btnF);
        btnF.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('f');
            }
        });
        centerpanel.add(btnG);
        btnG.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('g');
            }
        });
        centerpanel.add(btnH);
        btnH.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('h');
            }
        });
        centerpanel.add(btnJ);
        btnJ.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('j');
            }
        });
        centerpanel.add(btnK);
        btnK.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('k');
            }
        });
        centerpanel.add(btnL);
        btnL.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('l');
            }
        });
        centerpanel.add(btnZ);
        btnZ.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('z');
            }
        });
        centerpanel.add(btnX);
        btnX.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('x');
            }
        });
        centerpanel.add(btnC);
        btnC.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('c');
            }
        });
        centerpanel.add(btnV);
        btnV.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('v');
            }
        });
        centerpanel.add(btnB);
        btnB.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('b');
            }
        });
        centerpanel.add(btnN);
        btnN.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('n');
            }
        });
        centerpanel.add(btnM);
        btnM.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	botones('m');
            }
        }); 
        ////////////////// OPCIONES ACTION LISTENERS
        opcion1.addActionListener(new ActionListener(){   //Ya sea que se elija la opcion 1, 2, 3 se actualizará la cadena, el cuadro de texto
            public void actionPerformed(ActionEvent e) {  // y el display de la cadena.
            	cadena.setText(opcion1.getText());
            	cadenaEntradaTEXT = opcion1.getText();
  	          resultado.setText("Cadena: "+cadenaEntradaTEXT);
  	  	  	  northPanel.add(resultado);

            }
        }); 
        opcion2.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	cadena.setText(opcion2.getText());
            	cadenaEntradaTEXT = opcion2.getText();
  	          resultado.setText("Cadena: "+cadenaEntradaTEXT);
  	  	  	  northPanel.add(resultado);
            }
        });
        opcion3.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
            	cadena.setText(opcion3.getText());
            	cadenaEntradaTEXT = opcion3.getText();
  	          resultado.setText("Cadena: "+cadenaEntradaTEXT);
  	  	  	  northPanel.add(resultado);
            }
        });
        ///////////////// TEXTFIELD
        cadena.addKeyListener(new KeyListener(){ 
        	public void keyTyped(KeyEvent e) {
        	  char t = e.getKeyChar();
        	  int asccii = (int)t;
        	  if((asccii>=65)&&(asccii<=90)||(asccii>=97)&&(asccii<=122)){        		  	
        	  	  cadenaEntradaTEXT = cadena.getText()+t; //Se obtiene el string que contenga el textfield + la tecla presionada
        	  	  predictive.printDictionary(cadenaEntradaTEXT);
        	  	  predictive.buscaOpciones2(cadenaEntradaTEXT); //manda llamar metodo que busca opciones
        	  	  resultado.setText("Cadena: "+cadenaEntradaTEXT); //Se actualiza display cadena
        	  	  northPanel.add(resultado);
        	  	  displayOptions();	
        	  	  validacion.setText("cadena valida");
        	  	  southpanel.add(validacion);
        	  }
        	  else{
        		  validacion.setText("cadena NO valida");
        	  	  southpanel.add(validacion);	
        	  }
  	      	}
  	      	public void keyPressed(KeyEvent e) {
  	      	}
  	      	public void keyReleased(KeyEvent e) {
  	      	}   
  	       	    	
        });

	}
	public char botones(char ch){ //Siempre que se presiona un boton del teclado
		  String c= Character.toString(ch);
		  cadenaEntradaBOTON = cadenaEntradaBOTON+c;   //Se obtiene el valor actual de la cadena+ la letra del boton presionado
		  predictive.printDictionary(cadenaEntradaBOTON);
		  predictive.buscaOpciones2(cadenaEntradaBOTON);
		  resultado.setText("Cadena: "+cadenaEntradaBOTON);
	  	  northPanel.add(resultado);
	  	  displayOptions();	
		
		return ch;
	}
	public void displayOptions(){  //actualiza los valores de los 3 botones que contienen las 3 opciones que predicen la palabra a ingresar
		  opt1 = predictive.options[0];  //options es el arreglo que contiene 3 palabras que vienen del arreglo del resultado de busqueda de match
	  	  opcion1.setText(opt1);
	  	  opt2 = predictive.options[1];
	  	  opcion2.setText(opt2);
	  	  opt3 = predictive.options[2];
	  	  opcion3.setText(opt3);
	  	  System.out.println("op1: "+opcion1.getText());	
	  	  System.out.println("op2: "+opcion2.getText());	
	  	  System.out.println("op3: "+opcion3.getText());	
	  	  southpanel.add(opcion1);
	  	  southpanel.add(opcion2);
	  	  southpanel.add(opcion3);
		
	}
	 //public static void main(String[] args) {
		 

	    
	//}
}
