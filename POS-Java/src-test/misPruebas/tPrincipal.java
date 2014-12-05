package misPruebas;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import workflow.POST;
import domain.Store;


@SuppressWarnings("deprecation")
public class tPrincipal {

	Store t;
	POST p;
	
	@Before
	public void setUp() throws Exception {
		t = new Store();
		p = t.getPOST();
		
		p.EnterItem(1,1);
		p.EnterItem(2,2);
		p.EnterItem(1,1);
		p.endSale();
		p.makePayment(650);
	}

	@Test
	public void testVideoStore() {
		Assert.assertTrue(p.getSale().total()==600.0);
		Assert.assertTrue(p.getSale().getBalance()==50.0);
	}

}
