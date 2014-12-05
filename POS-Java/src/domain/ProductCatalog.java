package domain;

import java.util.*;

public class ProductCatalog {
  private Hashtable productSpecifications = new Hashtable();

  public ProductCatalog() {
    ProductSpecification ps;
	newProduct(1);
	newProduct(2);
	newProduct(3);
	newProduct(4);
  }

private void newProduct(int x) {
	ProductSpecification ps = new ProductSpecification(x, x*100, "product "+x);
    productSpecifications.put(new Integer(x), ps);
}

  public ProductSpecification specification(int unidadesPorCompra) {
    return (ProductSpecification) productSpecifications.get(new Integer(unidadesPorCompra));
  }
}
