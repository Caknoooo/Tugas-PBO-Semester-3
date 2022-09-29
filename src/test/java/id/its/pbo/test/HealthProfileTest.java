package id.its.pbo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import id.its.pbo.HealthProfile;

class HealthProfileTest {

	HealthProfile healthProfile;
	
	@BeforeEach
	void setUp() throws Exception {
		healthProfile = new HealthProfile("Ingwer","Ludwig","Laki-laki",11,11,2002,66.9291,149.914);
	}
	
	@Test
	@DisplayName("Dapat melakukan perhitungan Age sederhana")
	void testGetAge() {
		assertEquals(19, this.healthProfile.getAge(11,11,2002));
	}
	
	@Test
	@DisplayName("Dapat melakukan perhitungan MaxHeartRate sederhana")
	void testGetMaxHeartRate() {
		healthProfile.setBirthDay(11);
		healthProfile.setBirthMonth(11);
		healthProfile.setBirthYear(2002);
		assertEquals(201.0, this.healthProfile.getMaxHeartRate());
	}
	
	@Test
	@DisplayName("Dapat melakukan perhitungan TargetHeartRate sederhana")
	void testGetTargetHeartRate() {
		healthProfile.setBirthDay(11);
		healthProfile.setBirthMonth(11);
		healthProfile.setBirthYear(2002);
		assertEquals("101 - 171", this.healthProfile.getTargetHeartRate());
	}
	
	@Test
	@DisplayName("Dapat melakukan perhitungan BMI sederhana")
	void testBMI() {
		healthProfile.setHeight(66.9291);
		healthProfile.setWeight(149.914);
		assertEquals(23.52705387882634, this.healthProfile.BMI());
	}

}
