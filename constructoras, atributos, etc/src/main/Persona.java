package main;

public class Persona {
	/**
	 * atributos
	 */
	private String nombre;
	private String apellidos;
	private int edad;
	private String dni;

	
	/**
	 * Constructora
	 * @param nombre
	 * @param apellidos
	 */
	public Persona (String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		}
	/**
	 * Constructora2
	 * @param dni
	 * @param edad
	 */
	public Persona (String dni, int edad) {
		this.edad = edad;
		this.dni = dni;
		}
	
	/**
	 * este metodo retorna el nombre
	 * @return
	 */
	public String getNombre () {
		return this.nombre;
	}
	
	/**
	 * este metodo retorna el apellido
	 * @return
	 */
	public String getApellido () {
		return this.apellidos;
	}
}
