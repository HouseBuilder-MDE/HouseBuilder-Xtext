/*
 * generated by Xtext 2.25.0
 */
package it.univaq.disim.housebuilder.xtext.ui.tests;

import com.google.inject.Injector;
import it.univaq.disim.housebuilder.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class HouseBuilderUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtextActivator.getInstance().getInjector("it.univaq.disim.housebuilder.xtext.HouseBuilder");
	}

}
