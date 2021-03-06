/*******************************************************************************
 * Copyright (c) 2015 Karim Ali and Ondřej Lhoták.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Karim Ali - initial API and implementation and/or initial documentation
 *******************************************************************************/
package averroes.exceptions;

import org.apache.bcel.verifier.VerificationResult;

/**
 * A utility class that creates the necessary assertions used by Averroes.
 * 
 * @author karim
 * 
 */
public class Assertions {

	/**
	 * Create an assertion that an object is not null.
	 * 
	 * @param obj
	 * @param message
	 */
	public static void notNullAssertion(Object obj, String message) {
		if (obj == null) {
			throw new AssertionError(message);
		}
	}

	/**
	 * Create an assertion that a {@link VerificationResult} has the value {@value VerificationResult#VR_OK}. This means
	 * that BCEL successfully verified the class file of the given class name.
	 * 
	 * @param verificationResult
	 * @param className
	 * @param methodName
	 */
	public static void verificationResultOKAssertion(VerificationResult verificationResult, String className,
			String methodName) {
		if (!verificationResult.equals(VerificationResult.VR_OK)) {
			throw new AssertionError(System.getProperty("line.separator").concat(className)
					.concat(System.getProperty("line.separator")).concat(methodName)
					.concat(System.getProperty("line.separator")).concat(verificationResult.toString()));
		}
	}

	/**
	 * Create an assertion that some input argument is unknown to Averroes.
	 * 
	 * @param argument
	 */
	public static void unknownArgument(String argument) {
		throw new AssertionError("uknown argument: " + argument);
	}
}
