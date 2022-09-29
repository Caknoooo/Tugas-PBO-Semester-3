package id.its.pbo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import id.its.pbo.Invoice;

class InvoiceTest {

	Invoice invoice;
	
	@BeforeEach
	void setUp() throws Exception {
		invoice = new Invoice("ABC123", "barang", 2, 2000.0);
	}
	
	@Test
	@DisplayName("Dapat melakukan input String sederhana")
	void testInputString() {
		boolean check=true;
		if(!this.invoice.getPartNumber().getClass().equals(String.class)) {
			check=false;
		}
		if(!this.invoice.getPartDescription().getClass().equals(String.class)) {
			check=false;
		}
		assertTrue(check, "Must be string value");
	}

	@Test
	@DisplayName("Dapat melakukan perhitungan Harga dan jumlah sederhana")
	void testGetInvoiceAmount() {
		assertEquals(4000.0, this.invoice.getInvoiceAmount());
	}

}
