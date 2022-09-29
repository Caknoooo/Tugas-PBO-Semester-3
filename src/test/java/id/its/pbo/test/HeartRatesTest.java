package id.its.pbo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.*;

import id.its.pbo.HeartRates;

class HeartRatesTest {

	HeartRates heartRates;
    @BeforeEach
    void setUp() {
        heartRates = new HeartRates("Elshe", "Angely", 16, 11, 2002);
    }
    
    @Test
    @DisplayName("Mendapatkan input tanggal")
    void testGetDate() {
    	assertEquals(16, this.heartRates.getDay());
    }
    
    @Test
    @DisplayName("Mendapatkan input bulan")
    void testGetMonth() {
    	assertEquals(11, this.heartRates.getMonth());
    }
    
    @Test
    @DisplayName("Mendapatkan input tahun")
    void testGetYear() {
    	assertEquals(2002, this.heartRates.getYear());
    }
    
    @Test
    @DisplayName("Mendapatkan input nama")
	void testGetName() {
		String name = "Elshe" + "Angely";
		String fromInput = this.heartRates.getFirstName() + this.heartRates.getLastName();
		assertEquals(name, fromInput);
	}
    
    @Test
    @DisplayName("Mendapatkan tanggal lahir")
    void testGetBirthDate() {
        LocalDate ld = LocalDate.of(2002, 11, 16);
        assertEquals(ld, this.heartRates.getBirthDate());
    }

    @Test
    @DisplayName("Mendapatkan usia dalam tahun")
    void testGetAge() {
        assertEquals(19, heartRates.getAge());
    }

    @Test
    @DisplayName("Mendapatkan maksimum heart rate")
    void testGetMaxHeartRate() {
        assertEquals(201, heartRates.getMaxHeartRate());
    }

    @Test
    @DisplayName("Mendapatkan range bawah dari person heart rate")
    void testGetLowerRangeHeartRate() {
        assertEquals(100.5, heartRates.getLowerRangeHeartRate());
    }

    @Test
    @DisplayName("Mendapatkan range atas dari person heart rate")
    void testGetUpperRangeHeartRate() {
        assertEquals(170.85, heartRates.getUpperRangeHeartRate());
    }
}
