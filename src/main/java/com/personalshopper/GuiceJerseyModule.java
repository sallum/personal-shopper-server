package com.personalshopper;

import java.util.HashMap;
import java.util.Map;

import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

/**
 * Guice servlet module for configuring Jersey
 * 
 * @author Ignacio Mulas
 * 
 */
public class GuiceJerseyModule extends JerseyServletModule {
	private static final String SERVICES_PACKAGES = "com.personalshopper.services;org.codehaus.jackson.jaxrs";

	/**
	 * {@link Override}
	 */
	@Override
	protected void configureServlets() {
		Map<String, String> jerseyConfigurationParameters = new HashMap<String, String>();
		// Tell Jersey where to look for services
		jerseyConfigurationParameters.put(PackagesResourceConfig.PROPERTY_PACKAGES, SERVICES_PACKAGES);
		// Enable/Disable tracing (will create usefull headers in HTTP respons)
		jerseyConfigurationParameters.put(ResourceConfig.FEATURE_TRACE, Boolean.TRUE.toString());
		// jerseyConfigurationParameters.put("com.sun.jersey.config.property.WebPageContentRegex",
		// "/*.html");
		// Route all requests through GuiceContainer
		serve("/rip/*").with(GuiceContainer.class, jerseyConfigurationParameters);
	}
}
