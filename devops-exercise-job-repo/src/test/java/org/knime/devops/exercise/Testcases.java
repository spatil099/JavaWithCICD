package org.knime.devops.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testcases {

	@Test
	void succeedingTest() {
		// does nothing on purpose
	}
	
	
	@Test
	void failingTest() {
		assertEquals(1, 2, "Test fails on purpose");
	}

	@Test
	void testOtherMethod() {
		boolean r =	DevopsExercise.otherMethod("12");
	}
}
