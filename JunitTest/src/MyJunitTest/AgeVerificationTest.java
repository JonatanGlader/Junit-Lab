package MyJunitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AgeVerificationTest {

	@Test
	void testIsMinor() {
		int ageMinor = 17;	
		AgeVerification ageVer = new AgeVerification();
		assertTrue(ageVer.isMinor(ageMinor));	//if true, person is a minor
	}
	@Test
	void testIsNotMinor() {
		int ageAdult = 18;
		AgeVerification ageVer = new AgeVerification();
		assertTrue(ageVer.isMinor(ageAdult));	//if false, person isn't an adult
	}

}
