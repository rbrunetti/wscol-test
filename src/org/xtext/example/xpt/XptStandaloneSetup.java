/*
* generated by Xtext
*/
package org.xtext.example.xpt;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XptStandaloneSetup extends XptStandaloneSetupGenerated{

	public static void doSetup() {
		new XptStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

