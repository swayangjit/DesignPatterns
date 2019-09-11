package com.swayangjit.monostate;

public class Monostate {
	private static String stateVariable = null;

	// Allow explicit constructions
	public Monostate() {
	}

	// Returns the current state
	public String getStateVariable() {
		return stateVariable;
	}

	/*
	 * Sets the new state, since the state variable is static. All states are
	 * updated.
	 */
	public void setStateVariable(String stateVariable) {
		Monostate.stateVariable = stateVariable;
	}
}
