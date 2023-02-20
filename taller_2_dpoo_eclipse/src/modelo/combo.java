package modelo;

public class combo implements producto{
	
	// Atributos
	
	private String nombreCombo;
	private double descuento;
	private productoMenu[] itemsCombo;
	
	// Constructor
	
	public combo(String elNombre, double elDescuento)
	{
		this.nombreCombo = elNombre;
		this.descuento = elDescuento;
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
