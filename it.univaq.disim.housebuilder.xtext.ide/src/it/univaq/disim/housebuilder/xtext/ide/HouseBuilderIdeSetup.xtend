/*
 * generated by Xtext 2.25.0
 */
package it.univaq.disim.housebuilder.xtext.ide

import com.google.inject.Guice
import it.univaq.disim.housebuilder.xtext.HouseBuilderRuntimeModule
import it.univaq.disim.housebuilder.xtext.HouseBuilderStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class HouseBuilderIdeSetup extends HouseBuilderStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new HouseBuilderRuntimeModule, new HouseBuilderIdeModule))
	}
	
}
