package ec.edu.ups.conexion;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class conexion {

	private String WS_PRODUCTO = "http://localhost:18080/EvaluacionWSErikaMorocho/rest/productos/guardarProductos";
	private String WS_AGREGAR="http://localhost:8080/EvaluacionWSErikaMorocho/rest/productos/agregarProductos";
	private String WS_CARRITO="http://localhost:8080/EvaluacionWSErikaMorocho/rest/productos/carrito";
	private String WS_LISTARPROD="http://localhost:8080/EvaluacionWSErikaMorocho/rest/productos/listadoProductos";
	
	
	public void producto(int id) {
		Client client = ClientBuilder.newClient();
		
		
		WebTarget target = client.target(
				WS_PRODUCTO).queryParam("id", id);

		target.request().get();
		client.close();	
	}
	
}

