/**
 */
package de.ubt.ai7.csv_validator.caches.dataStructures.provider;

import de.ubt.ai7.csv_validator.caches.dataStructures.util.dataStructuresAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class dataStructuresItemProviderAdapterFactory extends dataStructuresAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dataStructuresItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedElementItemProvider cachedElementItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedElementAdapter() {
		if (cachedElementItemProvider == null) {
			cachedElementItemProvider = new CachedElementItemProvider(this);
		}

		return cachedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.NamedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementItemProvider namedElementItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamedElementAdapter() {
		if (namedElementItemProvider == null) {
			namedElementItemProvider = new NamedElementItemProvider(this);
		}

		return namedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedDelimitersItemProvider cachedDelimitersItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedDelimiters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedDelimitersAdapter() {
		if (cachedDelimitersItemProvider == null) {
			cachedDelimitersItemProvider = new CachedDelimitersItemProvider(this);
		}

		return cachedDelimitersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedAbstractToken} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedAbstractTokenItemProvider cachedAbstractTokenItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedAbstractToken}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedAbstractTokenAdapter() {
		if (cachedAbstractTokenItemProvider == null) {
			cachedAbstractTokenItemProvider = new CachedAbstractTokenItemProvider(this);
		}

		return cachedAbstractTokenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedTokenItemProvider cachedTokenItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedToken}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedTokenAdapter() {
		if (cachedTokenItemProvider == null) {
			cachedTokenItemProvider = new CachedTokenItemProvider(this);
		}

		return cachedTokenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedConstraintItemProvider cachedConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedConstraintAdapter() {
		if (cachedConstraintItemProvider == null) {
			cachedConstraintItemProvider = new CachedConstraintItemProvider(this);
		}

		return cachedConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedContentConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedContentConstraintItemProvider cachedContentConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedContentConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedContentConstraintAdapter() {
		if (cachedContentConstraintItemProvider == null) {
			cachedContentConstraintItemProvider = new CachedContentConstraintItemProvider(this);
		}

		return cachedContentConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedPrimaryKeyConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedPrimaryKeyConstraintItemProvider cachedPrimaryKeyConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedPrimaryKeyConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedPrimaryKeyConstraintAdapter() {
		if (cachedPrimaryKeyConstraintItemProvider == null) {
			cachedPrimaryKeyConstraintItemProvider = new CachedPrimaryKeyConstraintItemProvider(this);
		}

		return cachedPrimaryKeyConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedForeignKeyConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedForeignKeyConstraintItemProvider cachedForeignKeyConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedForeignKeyConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedForeignKeyConstraintAdapter() {
		if (cachedForeignKeyConstraintItemProvider == null) {
			cachedForeignKeyConstraintItemProvider = new CachedForeignKeyConstraintItemProvider(this);
		}

		return cachedForeignKeyConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedNodeExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedNodeExpressionItemProvider cachedNodeExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedNodeExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedNodeExpressionAdapter() {
		if (cachedNodeExpressionItemProvider == null) {
			cachedNodeExpressionItemProvider = new CachedNodeExpressionItemProvider(this);
		}

		return cachedNodeExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedRegionToken} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedRegionTokenItemProvider cachedRegionTokenItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedRegionToken}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedRegionTokenAdapter() {
		if (cachedRegionTokenItemProvider == null) {
			cachedRegionTokenItemProvider = new CachedRegionTokenItemProvider(this);
		}

		return cachedRegionTokenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedAtomicType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedAtomicTypeItemProvider cachedAtomicTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedAtomicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedAtomicTypeAdapter() {
		if (cachedAtomicTypeItemProvider == null) {
			cachedAtomicTypeItemProvider = new CachedAtomicTypeItemProvider(this);
		}

		return cachedAtomicTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedListType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedListTypeItemProvider cachedListTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedListType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedListTypeAdapter() {
		if (cachedListTypeItemProvider == null) {
			cachedListTypeItemProvider = new CachedListTypeItemProvider(this);
		}

		return cachedListTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedCompoundType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedCompoundTypeItemProvider cachedCompoundTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedCompoundType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedCompoundTypeAdapter() {
		if (cachedCompoundTypeItemProvider == null) {
			cachedCompoundTypeItemProvider = new CachedCompoundTypeItemProvider(this);
		}

		return cachedCompoundTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedTLElementItemProvider cachedTLElementItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedTLElementAdapter() {
		if (cachedTLElementItemProvider == null) {
			cachedTLElementItemProvider = new CachedTLElementItemProvider(this);
		}

		return cachedTLElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLConstant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedTLConstantItemProvider cachedTLConstantItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLConstant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedTLConstantAdapter() {
		if (cachedTLConstantItemProvider == null) {
			cachedTLConstantItemProvider = new CachedTLConstantItemProvider(this);
		}

		return cachedTLConstantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutputVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedTLOutputVariableItemProvider cachedTLOutputVariableItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutputVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedTLOutputVariableAdapter() {
		if (cachedTLOutputVariableItemProvider == null) {
			cachedTLOutputVariableItemProvider = new CachedTLOutputVariableItemProvider(this);
		}

		return cachedTLOutputVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedTLVariableBindingItemProvider cachedTLVariableBindingItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLVariableBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedTLVariableBindingAdapter() {
		if (cachedTLVariableBindingItemProvider == null) {
			cachedTLVariableBindingItemProvider = new CachedTLVariableBindingItemProvider(this);
		}

		return cachedTLVariableBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLTypeInspector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedTLTypeInspectorItemProvider cachedTLTypeInspectorItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLTypeInspector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedTLTypeInspectorAdapter() {
		if (cachedTLTypeInspectorItemProvider == null) {
			cachedTLTypeInspectorItemProvider = new CachedTLTypeInspectorItemProvider(this);
		}

		return cachedTLTypeInspectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedTLStatementItemProvider cachedTLStatementItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedTLStatementAdapter() {
		if (cachedTLStatementItemProvider == null) {
			cachedTLStatementItemProvider = new CachedTLStatementItemProvider(this);
		}

		return cachedTLStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedTLOutputItemProvider cachedTLOutputItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedTLOutputAdapter() {
		if (cachedTLOutputItemProvider == null) {
			cachedTLOutputItemProvider = new CachedTLOutputItemProvider(this);
		}

		return cachedTLOutputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLLoop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedTLLoopItemProvider cachedTLLoopItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLLoop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedTLLoopAdapter() {
		if (cachedTLLoopItemProvider == null) {
			cachedTLLoopItemProvider = new CachedTLLoopItemProvider(this);
		}

		return cachedTLLoopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedTransformationProgramItemProvider cachedTransformationProgramItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTransformationProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedTransformationProgramAdapter() {
		if (cachedTransformationProgramItemProvider == null) {
			cachedTransformationProgramItemProvider = new CachedTransformationProgramItemProvider(this);
		}

		return cachedTransformationProgramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLIf} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedTLIfItemProvider cachedTLIfItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLIf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedTLIfAdapter() {
		if (cachedTLIfItemProvider == null) {
			cachedTLIfItemProvider = new CachedTLIfItemProvider(this);
		}

		return cachedTLIfItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLBoolExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachedTLBoolExprItemProvider cachedTLBoolExprItemProvider;

	/**
	 * This creates an adapter for a {@link de.ubt.ai7.csv_validator.caches.dataStructures.CachedTLBoolExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCachedTLBoolExprAdapter() {
		if (cachedTLBoolExprItemProvider == null) {
			cachedTLBoolExprItemProvider = new CachedTLBoolExprItemProvider(this);
		}

		return cachedTLBoolExprItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (cachedElementItemProvider != null) cachedElementItemProvider.dispose();
		if (namedElementItemProvider != null) namedElementItemProvider.dispose();
		if (cachedDelimitersItemProvider != null) cachedDelimitersItemProvider.dispose();
		if (cachedAbstractTokenItemProvider != null) cachedAbstractTokenItemProvider.dispose();
		if (cachedTokenItemProvider != null) cachedTokenItemProvider.dispose();
		if (cachedConstraintItemProvider != null) cachedConstraintItemProvider.dispose();
		if (cachedContentConstraintItemProvider != null) cachedContentConstraintItemProvider.dispose();
		if (cachedPrimaryKeyConstraintItemProvider != null) cachedPrimaryKeyConstraintItemProvider.dispose();
		if (cachedForeignKeyConstraintItemProvider != null) cachedForeignKeyConstraintItemProvider.dispose();
		if (cachedNodeExpressionItemProvider != null) cachedNodeExpressionItemProvider.dispose();
		if (cachedRegionTokenItemProvider != null) cachedRegionTokenItemProvider.dispose();
		if (cachedAtomicTypeItemProvider != null) cachedAtomicTypeItemProvider.dispose();
		if (cachedListTypeItemProvider != null) cachedListTypeItemProvider.dispose();
		if (cachedCompoundTypeItemProvider != null) cachedCompoundTypeItemProvider.dispose();
		if (cachedTLVariableBindingItemProvider != null) cachedTLVariableBindingItemProvider.dispose();
		if (cachedTLElementItemProvider != null) cachedTLElementItemProvider.dispose();
		if (cachedTLStatementItemProvider != null) cachedTLStatementItemProvider.dispose();
		if (cachedTLLoopItemProvider != null) cachedTLLoopItemProvider.dispose();
		if (cachedTLOutputItemProvider != null) cachedTLOutputItemProvider.dispose();
		if (cachedTLConstantItemProvider != null) cachedTLConstantItemProvider.dispose();
		if (cachedTLOutputVariableItemProvider != null) cachedTLOutputVariableItemProvider.dispose();
		if (cachedTLTypeInspectorItemProvider != null) cachedTLTypeInspectorItemProvider.dispose();
		if (cachedTransformationProgramItemProvider != null) cachedTransformationProgramItemProvider.dispose();
		if (cachedTLIfItemProvider != null) cachedTLIfItemProvider.dispose();
		if (cachedTLBoolExprItemProvider != null) cachedTLBoolExprItemProvider.dispose();
	}

}