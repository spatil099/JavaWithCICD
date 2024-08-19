package org.knime.devops.exercise;

import io.micronaut.core.util.ArgumentUtils;

public class DevopsExercise {
	public static void main(String[] args) {
		if(ArgumentUtils.requirePositive("Test", 5) == 5){
			System.out.println("Yes, it works!");
		};
	}

	public static boolean otherMethod(String arg) {
		return arg.isBlank();
	}
}
