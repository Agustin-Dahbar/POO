package Clases;

public class Test {

	public static void main(String[] args) 
	{	
		//Creamos una persona con el constructor de los 3 parametros.
		Persona miPersona = new Persona("Agustin", "Dahbar", 23); 
		
		//Creamos una variable que almacenará el nombre y apellido. Los obtendrá mediante un metodo getter de la clase Persona que al que accederá mediante la instancia de su clase/objeto y notación de puntos.
		String nombreApellido = miPersona.devolverNombreApellido(); 
		System.out.println(nombreApellido); //Imprimimos el nombre y apellido.
		
		//Metodos setters con los que actualizaremos los 3 atributos del objeto creado
		miPersona.cambiarNombreEdad("Guillermo", 35); //Mediante metodos setters le cambiamos los datos, nombre y edad.
		miPersona.cambiarApellido("Messi"); // y apellido
		System.out.println(miPersona.devolverDatosCompletos()); //Imprimimos los nuevos datos.
		
		
		
		//Creamos una segunda persona
		Persona segundaPersona = new Persona(); //Instancia de la clase == objeto.
		
		//Mediante metodos setters le asignamos nombres edad y apellido a la nueva persona.
		segundaPersona.cambiarNombreEdad("Matias", 19); 
		segundaPersona.cambiarApellido("Carbonaro");
		
		//Usamos un metodo getter por lo tanto requerimos una variable para almacenar su retorno.
		String nameSurname = segundaPersona.devolverNombreApellido(); 
		System.out.println(nameSurname);
		
		

		//Creamos un objeto de la clase Domicilio, este objeto tiene tres atributos los inicializamos con el constructor correspondiente.
		Domicilio domicilio = new Domicilio("Av Libertador", 5300, "CABA");		
		System.out.println(domicilio); //Imprimimos este objeto. Esta es la manera más rapida de crearlo.
		

		//Tambien podemos crear un objeto sin argumentarle valores y luego con metodos settears inicializar los que deseemos.
		Domicilio segundoDomicilio = new Domicilio();
		//Parados en el objeto y mediante notación de punto accedemos a los metodos que argumentamos con los valores que deseemos vayan a los atributos.
		segundoDomicilio.setCalle("Yatay");
		segundoDomicilio.setNumero(440);
		segundoDomicilio.setCiudad("CABA");
		
		//Ahora estos datos que setteamos en los atributos los obtendremos en variables mediantem metodos getters.
		String calle = segundoDomicilio.getCalle();
		int numero = segundoDomicilio.getNumero();
		String ciudad = segundoDomicilio.getCiudad();
		
		System.out.println(calle + " " + numero + " " + ciudad);
		
		Persona hola = new Persona("Agustin", "Dahbar", 23);
		System.out.println(hola);
		
		//En resumen podemos crear objetos mediante constructores con múltiples argumentos o por defecto y luego con metodos especificamos los atributos a asignarles valor.
	}

}
