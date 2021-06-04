package com.qa.ims.controllers;

import org.junit.Test;

import com.qa.ims.controller.Action;
import nl.jqno.equalsverifier.EqualsVerifier;

public class ActionTest {

	
	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(Action.class).verify();
	}
}
