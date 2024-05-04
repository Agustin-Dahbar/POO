package Clases;

public class Persona
{
	private String nombre;
	private String apellido;
	private int edad;
	
	//Este constructor creara una persona sin datos. Esto es != a null. Es el por defecto.
	public Persona() 
	{
		nombre = "";
		apellido = "";
	}
	
	//Este constructor parametrizado creará una persona con los 3 atributos posibles, estos datos se obtendrán mediate los parámetros que están del constructor.
	public Persona(String nombre, String apellido, int edad) 
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	//La palabra this. hace referencia a la clase en la que estamos parados en esta caso persona (línea de código 3) 
	//Usa un punto para acceder de esta forma al atributo de la clase mencionada, esto se llama notación de punto y sirve para vincular.
	
	//También se pueden crear constructores que modifiquen el valor de algunos atributos, no deben ser todos. Ej:
	public Persona(String nombre) 
	{
		this.nombre = nombre;
	}
	
	//Ahora se crearán los métodos de la clase que operarán con sus atributos, serán públicos para así poder llamarse en otras clases que los necesitemos.
	//Pueden ser void (si no retornan nada) o tipados en caso de retornar algo del tipo indicado (obviamente).
	
	//LOS METODOS QUE MODIFICAN VALORES (VOID) SON SETTERS. LOS QUE LOS DEVUELVEN (TIPADOS) SON GETTERS.
	
	//METODOS SETTERS: SE USAN CON VOID POR MODIFICAR VALORES. (ACCIÓN UPDATE)
	//Requerirán parámetros para poder modificar el valor de los atributos de la clase.
	public void cambiarApellido(String apellido) 
	{
		this.apellido = apellido;
	}
	
	//Otro que modificará 2 de los 3 valores de atributos del objeto de la clase Persona. 
	public void cambiarNombreEdad(String nombre, int edad) 
	{
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	//METODOS GETTERS: En vez de void se usa el tipado de lo que devolverá. VOID == SETTERS. TIPADOS == GETTERS.
	public String devolverNombreApellido()
	{
		return this.nombre + this.apellido;
	}
	
	//Metodo que tipamos con la clase, esto significa que devuelve un objeto de la misma. Debe devolver todos sus atributos. 
	//En el bloque de código (desarrollo del metodo) retornamos una instancia de la clase parametrizando sus atributos.
	public Persona devolverDatosCompletos() 
	{
		return new Persona(nombre, apellido, edad);
	}
	
	
	//UNIÓN DE CLASES:
	//Creamos un metodo setter en la clase Persona que hereda de otra clase (Domicilio) uno de sus metodos PÚBLICOS (por eso podemos heredarlo).
	public void otroMetodo(Domicilio objetoDomicilio) 
	{
		objetoDomicilio.setCiudad("toronto"); //Modificamos un atributo del objeto "objetoDomicilio" mediante el metodo que lo hace.
											  //No podemos modificar el valor de los atributos directa,emte por ser privados, 
											  //pero si mediante un metodo público.
	}
	
	//Para heredar metodos públicos de otras clases debemos utilizar una instancia de esta clase y  acceder al metodo mediante notación de puntos.
	//La instancia de clase en este caso es "objetoDomicilio", si, el objeto. Una instancia de clase es lo mismo que un objeto.
		
}
