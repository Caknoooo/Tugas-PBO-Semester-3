package id.its.pbo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import id.its.pbo.Date;

class DateTest {

	Date date;
	
	@BeforeEach
	void setUp() throws Exception {
		date = new Date(11,11,2002);
	}

	@Test
	@DisplayName("Dapat melakukan test input integer date")
	void testDayInput() {
		int day = date.getDay();
		assertEquals(day, this.date.getDay()+0);
	}
	
	@Test
	@DisplayName("Dapat melakukan test input integer month")
	void testMonthInput() {
		int month = date.getMonth();
		assertEquals(month, this.date.getMonth()+0);
	}
	
	@Test
	@DisplayName("Dapat melakukan test input integer year")
	void testYearInput() {
		int year = date.getYear();
		assertEquals(year, this.date.getYear()+0);
	}
	
	@Test
	@DisplayName("Dapat melakukan input Date sederhana")
	void testDisplayDate() {
		assertEquals("11/11/2002",this.date.displayDate());
	}

}
