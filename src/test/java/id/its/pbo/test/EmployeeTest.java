package id.its.pbo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import id.its.pbo.Employee;

class EmployeeTest {
	
	Employee employee, employee2;
	
	@BeforeEach
	void setUp() {
		employee = new Employee("Elshe", "Angely", 120.5);
		employee2 = new Employee("Ingwer", "Ludwig", -40.1);
	}
	
	@Test
	@DisplayName("Mengambil input nama")
	void testGetName() {
		String name = "Elshe" + "Angely";
		String fromInput = this.employee.getFirstName() + this.employee.getLastName();
		assertEquals(name, fromInput);
	}
	
	@Test
	@DisplayName("Mengambil input salary")
	void testGetInputSalary() {
		assertEquals(120.5, this.employee.getMonthlySalary());
	}
	
	@Test
	@DisplayName("Mengambil input salary yang kurang dari 0")
	void testGetInputLessThanZero() {
		assertEquals(0, this.employee2.getMonthlySalary());
	}
	
	@Test
	@DisplayName("Mendapatkan salary tahunan")
	void testGetYearlySalary() {
		assertEquals(1446, this.employee.getYearlySalary());
	}
	
	@Test
	@DisplayName("Mendapatkan raised salary dalam satu bulan")
	void testGetRaisedSalary() {
		this.employee.raiseSalary();
		assertEquals(132.55, this.employee.getMonthlySalary());
	}
}
