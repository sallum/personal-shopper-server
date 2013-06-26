package com.personalshopper;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

/**
 * Guice servlet context listener for creating Injector and setting required
 * modules
 * 
 * @author Ignacio Mulas
 * 
 */
public class GuiceContextListener extends GuiceServletContextListener {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new GuiceJerseyModule(), new GuiceServiceModule());
	}
}
