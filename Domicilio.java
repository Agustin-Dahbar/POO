package Clases;

import Clases.Persona;

public class Domicilio {
	 
	//Atributos que deben ser privados para no poder modificarse en otra clase y solo en esta.
	private String calle;
	private int numero;
	public String ciudad;
	
	//Constructor por defecto
	public Domicilio() 
	{
		this.calle = "";
		this.numero = 10;
		this.ciudad = "";
	}
	
	//Constructor parametrizado
	public Domicilio(String calle, int numero, String ciudad) 
	{
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
	}
	
	//Metodo obligatorio para que al crear objetos con el constructor anterior se impriman lo deseado y no su identificador de la clase seguido de @ y un código hexadecimal. Ej del código indeseado devuelto en caso de no existir este metodo: Clases.Domicilio@50040f0c
	@Override
    public String toString() 
	{
        return  calle + " " +  numero + " " + ciudad;
    }
	
	
	//METODOS GETTERS. Devolverán atributos de la clase. Se usa el tipado que devolverán.
	//Le damos ambientacion y tipado (public string) luego su nombre y sus () que indican que son metodos.
	public String getCalle() 
	{
		return calle; //Devolvemos solo un atributo.
	}
	
	public String getCiudad() 
	{
		return ciudad;
		
	}
	
	
	public int getNumero() 
	{
		return numero;
	}
	
	
	//Obtendremos dos atributos en un metodo pero tienen que ser del mismo tipo.
	public String getCiudadCalle() 
	{
		return ciudad + calle; //Devolvemos dos atributos concatenandolos.
	}
	
	//Metodo con el que devolveremos un objeto de la clase Domicilio.
	public Domicilio getDomicilio() 
	{
		return new Domicilio(calle, numero, ciudad);
	}
	
	//Metodo que crea un objeto de la clase persona a pesar de estar en la clase domicilio.
	//Esto sucede porque la clase persona es pública pero además requerimos hacer el import de la línea 3.
	public Persona crearPersonaEnClaseDomicilio(String nombre, String apellido, int edad) 
	{
		return new Persona(nombre, apellido, edad);
	}

	
	
	//METODOS SETTERS:  (actualizan el valor de los atributos) SE USAN CON VOID.
	public void setCiudad(String ciudad)
	{
		this.ciudad = ciudad;
	}
	
	public void setCalle(String calle) 
	{
		this.calle = calle;
	}
	
	public void setNumero(int numero) 
	{
		this.numero = numero;
	}
	
	//También podemos hacer metodo setter que modifique todos los atributos.
	public void setCiudadCalleNumero(String ciudad, String calle, int numero) 
	{
		this.ciudad = ciudad;
		this.calle = calle;
		this.numero = numero;
	}

	
	//METODO GETTER. Devuelve un objeto de la clase Domicilio, por eso se tipa con ella (NO MODIFICA DATOS DE LOS ATRIBUTOS por eso no es void).
	public Domicilio devolverObjeto() 
	{
		return new Domicilio(calle, numero, ciudad);
	}
	
	
	
}
