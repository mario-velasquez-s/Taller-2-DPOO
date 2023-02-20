package modelo;

public class productoAjustado implements producto{
	
	// Atributos
	
	private String nombre;
	private int precio;
	private ingrediente[] agregados;
	private ingrediente[] eliminados;
	
	// Constructor
	
	public productoAjustado(productoMenu base, 
			ingrediente[] losAgregados, ingrediente[] losEliminados)
	{
		this.nombre = base.getNombre();
		this.precio = base.getPrecio();
		this.agregados = losAgregados;
		this.eliminados = losEliminados;
		
		for(ingrediente agregado: agregados)
		{
			precio = precio + agregado.getCostoAdicional();
			nombre = nombre + " con " + agregado.getNombre();
		}
		
		for(ingrediente eliminado: eliminados)
		{
			nombre = nombre + " sin " + eliminado.getNombre();
		}
	}

	@Override
	public int getPrecio() {
		return precio;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}

}
