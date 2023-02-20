package modelo;

public class productoMenu implements producto {

	// Atributos
	
	private String nombre;
	private int precioBase;
	
	// Constructor
	
	public productoMenu(String elNombre, int elPrecioBase)
	{
		this.nombre = elNombre;
		this.precioBase = elPrecioBase;
	}
	
	// Metodos
	
	
	@Override
	public int getPrecio() {
		return precioBase;
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
