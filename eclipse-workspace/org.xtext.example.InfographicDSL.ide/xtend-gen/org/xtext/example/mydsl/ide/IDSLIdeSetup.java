/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.IDSLRuntimeModule;
import org.xtext.example.mydsl.IDSLStandaloneSetup;
import org.xtext.example.mydsl.ide.IDSLIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class IDSLIdeSetup extends IDSLStandaloneSetup {
  @Override
  public Injector createInjector() {
    IDSLRuntimeModule _iDSLRuntimeModule = new IDSLRuntimeModule();
    IDSLIdeModule _iDSLIdeModule = new IDSLIdeModule();
    return Guice.createInjector(Modules2.mixin(_iDSLRuntimeModule, _iDSLIdeModule));
  }
}
