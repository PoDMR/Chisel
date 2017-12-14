/**
 */
package de.ubt.ai7.csv_validator.sculpt.provider;


import de.ubt.ai7.csv_validator.sculpt.SculptFactory;
import de.ubt.ai7.csv_validator.sculpt.SculptPackage;
import de.ubt.ai7.csv_validator.sculpt.TLIf;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.ubt.ai7.csv_validator.sculpt.TLIf} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TLIfItemProvider extends TLStatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLIfItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SculptPackage.Literals.TL_IF__CONDITION);
			childrenFeatures.add(SculptPackage.Literals.TL_IF__IF_BLOCK);
			childrenFeatures.add(SculptPackage.Literals.TL_IF__ELSE_BLOCK);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TLIf.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TLIf"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TLIf_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TLIf.class)) {
			case SculptPackage.TL_IF__CONDITION:
			case SculptPackage.TL_IF__IF_BLOCK:
			case SculptPackage.TL_IF__ELSE_BLOCK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.TL_IF__CONDITION,
				 SculptFactory.eINSTANCE.createTLBoolExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.TL_IF__CONDITION,
				 SculptFactory.eINSTANCE.createTLBoolExprEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.TL_IF__CONDITION,
				 SculptFactory.eINSTANCE.createTLBoolExprNot()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.TL_IF__IF_BLOCK,
				 SculptFactory.eINSTANCE.createTLStatement()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.TL_IF__IF_BLOCK,
				 SculptFactory.eINSTANCE.createTLOutput()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.TL_IF__IF_BLOCK,
				 SculptFactory.eINSTANCE.createTLLoop()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.TL_IF__IF_BLOCK,
				 SculptFactory.eINSTANCE.createTLIf()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.TL_IF__ELSE_BLOCK,
				 SculptFactory.eINSTANCE.createTLStatement()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.TL_IF__ELSE_BLOCK,
				 SculptFactory.eINSTANCE.createTLOutput()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.TL_IF__ELSE_BLOCK,
				 SculptFactory.eINSTANCE.createTLLoop()));

		newChildDescriptors.add
			(createChildParameter
				(SculptPackage.Literals.TL_IF__ELSE_BLOCK,
				 SculptFactory.eINSTANCE.createTLIf()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SculptPackage.Literals.TL_IF__IF_BLOCK ||
			childFeature == SculptPackage.Literals.TL_IF__ELSE_BLOCK;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
