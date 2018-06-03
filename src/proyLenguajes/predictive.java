package proyLenguajes;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;
import proyLenguajes.keyboard;

public class predictive extends keyboard{
			
	//DECLARES DICTIONARY
	static Hashtable<String, ArrayList> dictionary = new Hashtable<String, ArrayList>();
	static Enumeration letters;  //abecedario1 para imprimir el diccionario
	static Enumeration letters2; //abecedario2 para realizar la búsqueda
	static String str; //donde se guarda la clave que se buscara en el diccionario
	public static String s, temp;
	public static ArrayList<String> result;			//donde se guarda el resultado de la busqueda
	public static String[] options = {" ", "", ""}; //inicializa las opciones qeu solo pueden ser 3

	
public static void main(String[] args){	
	
	proyLenguajes.keyboard  keyboard = new proyLenguajes.keyboard();  //creacion de interfaz
	createsDictionary();											 //se llena el diccionario
} 	
	public static String printDictionary(String s){	
		letters = dictionary.keys(); //guardamos llaves de forma que tengamos el abecedario
		while(letters.hasMoreElements()){ //ciclo para imprimir banco de palabras actual.
			str = (String) letters.nextElement();
			ArrayList<String[]> test1 = (dictionary.get(str));
			for(int i=0; i<test1.size(); i++){
				String [] test2 = test1.get(i);
				//System.out.println(str + ": " +  Arrays.toString(test2));
			}
		}
		return s;
	}	
	
	public static String buscaOpciones2(String s){
		result = new ArrayList<String>();
		options[0]=" "; //inicializamos arreglo de opciones cada vez que se modifica la cadena
		options[1]=" ";
		options[2]=" ";
		String s1 = Character.toString(s.charAt(0)); //agarramos primera letra de la cadena
		letters2=dictionary.keys(); //guarada abecedario
		ArrayList<String[]> test2 = (dictionary.get(str)); //test2 guarda el conjunto de palabras de una letra
		//conseguimos el conjunto de palabras que coinciden con la primera letra de la cadena
		while(letters2.hasMoreElements()){ //recorremos abecedario
			str = (String) letters2.nextElement(); //str guarda cada letra del alfabeto para comparar
			if(s1.equals(str)){ 
				test2 = dictionary.get(str); //test guarda el array que cpincide con la primera letra dela cadena
			}	
		}
		for(int i=0; i<test2.size(); i++){ //String[] "a"
			String[] test3 = test2.get(i); //each word in String[j]
			for(int j=0; j<test3.length; j++){
				String test4 = test3[j]; // word
				if(s.length()==1){
					if(test4.length()<=2){
						result.add(test4); //si la cadena.length es 1, se guardan palabra de tamaño 2
					}						
				}
				if(s.length()>1){
					if(test4.matches(s+".*")){ //Se busca la expresion que contenga cadena actual concatenada con cualquier cosa
						result.add(test4);
					}						
				}
			}
		}
		System.out.println("RESULT: "+result);
		for(int i=0; i<result.size(); i++){ //De las opciones resultantes guardamos solo 3
			if(result.size()>3){
				break;
			}
			options[i] = result.get(i);
		}
		System.out.println("OPTIONS:"+Arrays.toString(options));
		return s;
	}
	
public static void createsDictionary(){
	
	//fills words in arrays		
	ArrayList<String[]> aDict = new ArrayList<String[]>();
	aDict.add(new String[]{"ah", "ay", "al", "asi", "aun", "aqui", "ayer","azul", "año", "ahorita", "ante" });
	aDict.add(new String[]{"adios","ahora","algo", "amor", "arte", "atras", "arriba", "acabo", "abrazo", "agua", "agrego", "aburrido"});

	ArrayList<String[]> bDict = new ArrayList<String[]>();
	bDict.add(new String[]{"bueno", "buenos", "besos", "bye", "bien", "bonito", "bajo","blog"});
	
	ArrayList<String[]> cDict = new ArrayList<String[]>();
	cDict.add(new String[]{"como", "cada", "casi", "cerca", "cero", "creo", "cuando", "cierto", "cigarro", "clave"});
	cDict.add(new String[]{"con", "cenar", "comer", "comida", "cabe", "chamarra", "chueco", "carne"});

	ArrayList<String[]> dDict = new ArrayList<String[]>();
	dDict.add(new String[]{"de", "dijo", "dice", "dia", "doy", "dale", "dame", "daño"});
	dDict.add(new String[]{"dos", "desde", "despues", "durante", "duele", });
	
	ArrayList<String[]> eDict = new ArrayList<String[]>();
	eDict.add(new String[]{"el", "ella","era", "eres", "este", "estos", "edad", "entre"});
	eDict.add(new String[]{"en", "equipo", "equis","entonces", "empieza", "equipo","eterno", "europa", "epoca", "estamos", "explico", "excelente"});
	
	ArrayList<String[]> fDict = new ArrayList<String[]>();
	fDict.add(new String[]{"fue", "fueron", "foto", "falta", "flor", "facil"});
	fDict.add(new String[]{"feliz", "falta", "favor", "felicidades", "final", "fumar"});
	
	ArrayList<String[]> gDict = new ArrayList<String[]>();
	gDict.add(new String[]{"gracias", "gente"});
	gDict.add(new String[]{"gran", "ganas", "gym", "guadalajara", "guardar"});
	
	ArrayList<String[]> hDict = new ArrayList<String[]>();
	hDict.add(new String[]{"hola","hoy","hay","hasta", "he", "hermoso", "hubo", "hago", "hagamos" });
	hDict.add(new String[]{"hemos", "hizo", "hablar", "hablo", "hace", "hacer", "hijo", "hija", "hacia"});
	
	ArrayList<String[]> iDict = new ArrayList<String[]>();
	iDict.add(new String[]{"igual", "ire","igual", "igualmente", "iba", "increible", "intento", "imposible" });
	iDict.add(new String[]{"ir", "izquierda","iphone", "ideal", "idea","internet", "inicio", "icono"  });
	
	ArrayList<String[]> jDict = new ArrayList<String[]>();
	jDict.add(new String[]{"ja", "je", "jefe", "jugar", "jugando", "joven", "juntar"});
	jDict.add(new String[]{"junto", "jamas","jirafa", "juego", "juez", "jitomate" });
	
	ArrayList<String[]> kDict = new ArrayList<String[]>(); ////////////////////////
	kDict.add(new String[]{"karma", "kilos", "kayak"});
	
	ArrayList<String[]> lDict = new ArrayList<String[]>();
	lDict.add(new String[]{"la", "libro", "lentes", "llevar", "lastima", "lamentablemente"});
	lDict.add(new String[]{"los", "luego", "lugar","llevo", "lejos", "luchar", "loco", "luna"});
	
	ArrayList<String[]> mDict = new ArrayList<String[]>();
	mDict.add(new String[]{"me", "mañana", "mas", "mejor", "menos", "mucho", "muchas"});
	mDict.add(new String[]{"mi", "mama", "mal","mientras", "mira", "morir", "manzana"});
	
	ArrayList<String[]> nDict = new ArrayList<String[]>();
	nDict.add(new String[]{"no", "ni", "nada", "nadie", "nunca"});
	nDict.add(new String[]{"nos", "necesito", "nuestro", "ninguno", "necesitamos", "nube"});
	
	ArrayList<String[]> oDict = new ArrayList<String[]>();
	oDict.add(new String[]{"odio", "omitir", "oración", "opcion", "oficial", "operacion", "obsesion", "ofrecer", });
	oDict.add(new String[]{"otra", "oh", "ojala"});
	
	ArrayList<String[]> pDict = new ArrayList<String[]>();
	pDict.add(new String[]{"por", "pense", "para", "puerta", "parece", "pienso", "porque", "plus", "pantalon", "playera"});
	pDict.add(new String[]{"pero", "pregunta", "pues", "publicacion", "publique", "pasion", "porcion", "patron", "platano", "pescado", "pollo"});
	
	ArrayList<String[]> qDict = new ArrayList<String[]>();
	qDict.add(new String[]{"que", "queso", "quemar", "querer", "quisiera", "quererte"});
	qDict.add(new String[]{"quiero"});
	
	ArrayList<String[]> rDict = new ArrayList<String[]>(); ///////**********
	rDict.add(new String[]{"re","respuesta", "recibir", "restaurante", "razon", "recuerdo", "ropa", "raton", "romantico", });
	rDict.add(new String[]{"real", "reto", "racion", "robar"});
	
	ArrayList<String[]> sDict = new ArrayList<String[]>();
	sDict.add(new String[]{"si", "segun", "sin", "sobre", "salida", "salir", "sol", "suerte"});
	sDict.add(new String[]{"se", "seria", "sin", "sus", "sabes", "sobre", "subir", "sangre", "saltar", "salario"});
	
	ArrayList<String[]> tDict = new ArrayList<String[]>();
	tDict.add(new String[]{"te", "tras", "trabajo", "tomar", "tambien", "tal",  });
	tDict.add(new String[]{"tengo", "tenemos", "tres", "tu", "tus", "tiene", "todo", "tan"});
	
	ArrayList<String[]> uDict = new ArrayList<String[]>();
	uDict.add(new String[]{"un","usted", "ustedes", "utiliza", "ultimo", "uber", "ubicacion", "uva"});
	uDict.add(new String[]{"una", "usar", "uso"});
	
	ArrayList<String[]> vDict = new ArrayList<String[]>();
	vDict.add(new String[]{"vamos", "ven", "vente", "ve", "ver", "vidrio", "ventana", "vista", "vuelta"});
	vDict.add(new String[]{"voy", "vete", "vuelve", "vuelvo", });
	
	ArrayList<String[]> wDict = new ArrayList<String[]>();
	wDict.add(new String[]{"web", "el", "ella"});

	ArrayList<String[]> xDict = new ArrayList<String[]>();/////////
	xDict.add(new String[]{"como"});
	
	ArrayList<String[]> yDict = new ArrayList<String[]>();
	yDict.add(new String[]{"yo", "yay", "yucatan", "yes", });
	yDict.add(new String[]{"ya"});
	
	ArrayList<String[]> zDict = new ArrayList<String[]>();
	zDict.add(new String[]{"zona", "zapato", "zurdo", "zacatecas", });
		
	//Agrega al diccionario llaves y valores(Arraylist con palabras)
	dictionary.put("a",aDict);
	dictionary.put("b",bDict);
	dictionary.put("c",cDict);
	dictionary.put("d",dDict);
	dictionary.put("e",eDict);
	dictionary.put("f",fDict);
	dictionary.put("g",gDict);
	dictionary.put("h",hDict);
	dictionary.put("i",iDict);
	dictionary.put("j",jDict);
	dictionary.put("k",kDict);
	dictionary.put("l",lDict);
	dictionary.put("m",mDict);
	dictionary.put("n",nDict);
	dictionary.put("o",oDict);
	dictionary.put("p",pDict);
	dictionary.put("q",qDict);
	dictionary.put("r",rDict);
	dictionary.put("s",sDict);
	dictionary.put("t",tDict);
	dictionary.put("u",uDict);
	dictionary.put("v",vDict);
	dictionary.put("w",wDict);
	dictionary.put("x",xDict);
	dictionary.put("y",yDict);
	dictionary.put("z",zDict);			
	
}
	
					
}
