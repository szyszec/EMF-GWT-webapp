/**
 */
package org.eclipse.example.library.presentation;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.EditorEntryPoint;

/**
 * This is the entry point.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryEditorEntryPoint extends EditorEntryPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void onModuleLoad() {
		super.onModuleLoad();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void registerPackages(EPackage.Registry packageRegistry) {
		packageRegistry.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void configureItemProviderAdapterFactories(ComposedAdapterFactory adapterFactory) {
		adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected String getApplicationTitle() {
		return "Library Application";
	}
}
