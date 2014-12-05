package domain;

class SaleLineItem {
  private int	quantity;
  private	ProductSpecification	productSpec;

   public SaleLineItem(ProductSpecification specification, int quantity )
	{
		this.productSpec = specification;
		this.quantity = quantity;
	}

	public float subtotal() { return quantity * productSpec.getPrice(); }

}
