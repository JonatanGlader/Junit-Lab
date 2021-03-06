import static org.junit.Assert.fail;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;

public class StandardTestClass {

	    @BeforeAll
	    static void initAll() {
	    }

	    @BeforeEach
	    void init() {
	    }

	    @Test
	    void succeedingTest() {
	    }

	    @Test
	    void failingTest() {
	        fail("a failing test");
	    }

	    @Test
	    @Disabled("for demonstration purposes")
	    void skippedTest() {
	        // not executed
	    }

	    @Test
	    void abortedTest() {
	        assumeTrue("abc".contains("Z"));
	        fail("test should have been aborted");
	    }

	    @AfterEach
	    void tearDown() {
	    }

	    @AfterAll
	    static void tearDownAll() {
	    }

}
