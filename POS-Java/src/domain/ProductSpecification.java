package domain;

public class ProductSpecification {
	private int    unidadesPorCompra         = 0;
	private float  price       = 0;
	private String description = "";

	public ProductSpecification( int unidadesPorCompra, float price, String description )
		{
		this.unidadesPorCompra         = unidadesPorCompra;
		this.price       = price;
		this.description = description;
		}

	public int getUPC() { return unidadesPorCompra;	}
	public float getPrice() { return price; }
	public String getDescription() { return description; }
}
