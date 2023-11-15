package main;
/**
 * clase circulo
 */
public class Circulo {
	/**
	 * atributos
	 */
	private int radio;
	private double area;
	private double perimetro;
	final private double pi = 3.14;
	
	/**
	 * Constructor del radio 
	 * @param radio
	 */
	public Circulo (int radio) {//para construir el circulo necesitamos el radio ()
		this.radio = radio;
		this.area = 0;
		this.perimetro = 0;
	}
	
	/**
	 * metodo de retorno del area
	 * @return
	 */
	public double getArea () {
		return this.area;
	}
	
	/**
	 * metodo que retorna el perimetro
	 * @return
	 */
	public double getPerimetro () {
		return this.perimetro;
	}
	
	
	/**
	 * metodo para calcular el area
	 */
	public void calcularArea() {
		this.area = this.pi * (this.radio * this.radio);
	}
	
	/**
	 * metodo que calcula el perimetro
	 */
	public void calcularPerimetro() {
		this.perimetro = 2 * this.pi * this.radio;
	}
	
	
}

