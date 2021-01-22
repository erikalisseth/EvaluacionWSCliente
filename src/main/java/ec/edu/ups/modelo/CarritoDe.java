package ec.edu.ups.modelo;

import java.io.Serializable;

public class CarritoDe implements Serializable {

	
	private int cod_carro;
	private int cantida;
	private Producto producto;
	private double subtotal;
	
	public CarritoDe() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getCod_carro() {
		return cod_carro;
	}


	public void setCod_carro(int cod_carro) {
		this.cod_carro = cod_carro;
	}


	public int getCantida() {
		return cantida;
	}


	public void setCantida(int cantida) {
		this.cantida = cantida;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public double getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}


	
}
