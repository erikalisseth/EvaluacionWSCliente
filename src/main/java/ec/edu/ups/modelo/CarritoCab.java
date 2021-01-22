package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.List;


public class CarritoCab implements Serializable{

	
	private int cod_carritocb;
	private Cliente cliente;
	private double total;
	private List<CarritoDe>listaCarritoDe;
	
	
	public CarritoCab() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getCod_carritocb() {
		return cod_carritocb;
	}


	public void setCod_carritocb(int cod_carritocb) {
		this.cod_carritocb = cod_carritocb;
	}


	

	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public List<CarritoDe> getListaCarritoDe() {
		return listaCarritoDe;
	}


	public void setListaCarritoDe(List<CarritoDe> listaCarritoDe) {
		this.listaCarritoDe = listaCarritoDe;
	}


	
}
