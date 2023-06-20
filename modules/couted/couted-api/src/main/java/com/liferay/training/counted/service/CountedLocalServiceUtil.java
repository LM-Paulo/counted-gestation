/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.counted.service;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.counted.model.Counted;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Counted. This utility wraps
 * <code>com.liferay.training.counted.service.impl.CountedLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CountedLocalService
 * @generated
 */
public class CountedLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.counted.service.impl.CountedLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the counted to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CountedLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param counted the counted
	 * @return the counted that was added
	 */
	public static Counted addCounted(Counted counted) {
		return getService().addCounted(counted);
	}

	public static Counted addcounted(
			long groupId, String nome, String telefone, String email, int idade,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addcounted(
			groupId, nome, telefone, email, idade, serviceContext);
	}

	/**
	 * Creates a new counted with the primary key. Does not add the counted to the database.
	 *
	 * @param countedId the primary key for the new counted
	 * @return the new counted
	 */
	public static Counted createCounted(long countedId) {
		return getService().createCounted(countedId);
	}

	/**
	 * Deletes the counted from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CountedLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param counted the counted
	 * @return the counted that was removed
	 */
	public static Counted deleteCounted(Counted counted) {
		return getService().deleteCounted(counted);
	}

	/**
	 * Deletes the counted with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CountedLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param countedId the primary key of the counted
	 * @return the counted that was removed
	 * @throws PortalException if a counted with the primary key could not be found
	 */
	public static Counted deleteCounted(long countedId) throws PortalException {
		return getService().deleteCounted(countedId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.counted.model.impl.CountedModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.counted.model.impl.CountedModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Counted fetchCounted(long countedId) {
		return getService().fetchCounted(countedId);
	}

	/**
	 * Returns the counted matching the UUID and group.
	 *
	 * @param uuid the counted's UUID
	 * @param groupId the primary key of the group
	 * @return the matching counted, or <code>null</code> if a matching counted could not be found
	 */
	public static Counted fetchCountedByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchCountedByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the counted with the primary key.
	 *
	 * @param countedId the primary key of the counted
	 * @return the counted
	 * @throws PortalException if a counted with the primary key could not be found
	 */
	public static Counted getCounted(long countedId) throws PortalException {
		return getService().getCounted(countedId);
	}

	/**
	 * Returns the counted matching the UUID and group.
	 *
	 * @param uuid the counted's UUID
	 * @param groupId the primary key of the group
	 * @return the matching counted
	 * @throws PortalException if a matching counted could not be found
	 */
	public static Counted getCountedByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getCountedByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the counteds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.counted.model.impl.CountedModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of counteds
	 * @param end the upper bound of the range of counteds (not inclusive)
	 * @return the range of counteds
	 */
	public static List<Counted> getCounteds(int start, int end) {
		return getService().getCounteds(start, end);
	}

	/**
	 * Returns all the counteds matching the UUID and company.
	 *
	 * @param uuid the UUID of the counteds
	 * @param companyId the primary key of the company
	 * @return the matching counteds, or an empty list if no matches were found
	 */
	public static List<Counted> getCountedsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getCountedsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of counteds matching the UUID and company.
	 *
	 * @param uuid the UUID of the counteds
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of counteds
	 * @param end the upper bound of the range of counteds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching counteds, or an empty list if no matches were found
	 */
	public static List<Counted> getCountedsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Counted> orderByComparator) {

		return getService().getCountedsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of counteds.
	 *
	 * @return the number of counteds
	 */
	public static int getCountedsCount() {
		return getService().getCountedsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the counted in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CountedLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param counted the counted
	 * @return the counted that was updated
	 */
	public static Counted updateCounted(Counted counted) {
		return getService().updateCounted(counted);
	}

	public static Counted updatecounted(
			long countedId, String nome, String telefone, String email,
			int idade,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updatecounted(
			countedId, nome, telefone, email, idade, serviceContext);
	}

	public static CountedLocalService getService() {
		return _service;
	}

	private static volatile CountedLocalService _service;

}