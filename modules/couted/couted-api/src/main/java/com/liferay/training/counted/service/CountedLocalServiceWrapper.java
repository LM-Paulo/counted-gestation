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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CountedLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CountedLocalService
 * @generated
 */
public class CountedLocalServiceWrapper
	implements CountedLocalService, ServiceWrapper<CountedLocalService> {

	public CountedLocalServiceWrapper(CountedLocalService countedLocalService) {
		_countedLocalService = countedLocalService;
	}

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
	@Override
	public com.liferay.training.counted.model.Counted addCounted(
		com.liferay.training.counted.model.Counted counted) {

		return _countedLocalService.addCounted(counted);
	}

	/**
	 * Creates a new counted with the primary key. Does not add the counted to the database.
	 *
	 * @param countedId the primary key for the new counted
	 * @return the new counted
	 */
	@Override
	public com.liferay.training.counted.model.Counted createCounted(
		long countedId) {

		return _countedLocalService.createCounted(countedId);
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
	@Override
	public com.liferay.training.counted.model.Counted deleteCounted(
		com.liferay.training.counted.model.Counted counted) {

		return _countedLocalService.deleteCounted(counted);
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
	@Override
	public com.liferay.training.counted.model.Counted deleteCounted(
			long countedId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _countedLocalService.deleteCounted(countedId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _countedLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _countedLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _countedLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _countedLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _countedLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _countedLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _countedLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.counted.model.Counted fetchCounted(
		long countedId) {

		return _countedLocalService.fetchCounted(countedId);
	}

	/**
	 * Returns the counted matching the UUID and group.
	 *
	 * @param uuid the counted's UUID
	 * @param groupId the primary key of the group
	 * @return the matching counted, or <code>null</code> if a matching counted could not be found
	 */
	@Override
	public com.liferay.training.counted.model.Counted
		fetchCountedByUuidAndGroupId(String uuid, long groupId) {

		return _countedLocalService.fetchCountedByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _countedLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the counted with the primary key.
	 *
	 * @param countedId the primary key of the counted
	 * @return the counted
	 * @throws PortalException if a counted with the primary key could not be found
	 */
	@Override
	public com.liferay.training.counted.model.Counted getCounted(long countedId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _countedLocalService.getCounted(countedId);
	}

	/**
	 * Returns the counted matching the UUID and group.
	 *
	 * @param uuid the counted's UUID
	 * @param groupId the primary key of the group
	 * @return the matching counted
	 * @throws PortalException if a matching counted could not be found
	 */
	@Override
	public com.liferay.training.counted.model.Counted
			getCountedByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _countedLocalService.getCountedByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.liferay.training.counted.model.Counted>
		getCounteds(int start, int end) {

		return _countedLocalService.getCounteds(start, end);
	}

	/**
	 * Returns all the counteds matching the UUID and company.
	 *
	 * @param uuid the UUID of the counteds
	 * @param companyId the primary key of the company
	 * @return the matching counteds, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.training.counted.model.Counted>
		getCountedsByUuidAndCompanyId(String uuid, long companyId) {

		return _countedLocalService.getCountedsByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.liferay.training.counted.model.Counted>
		getCountedsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.counted.model.Counted>
					orderByComparator) {

		return _countedLocalService.getCountedsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of counteds.
	 *
	 * @return the number of counteds
	 */
	@Override
	public int getCountedsCount() {
		return _countedLocalService.getCountedsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _countedLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _countedLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _countedLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _countedLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public com.liferay.training.counted.model.Counted updateCounted(
		com.liferay.training.counted.model.Counted counted) {

		return _countedLocalService.updateCounted(counted);
	}

	@Override
	public CountedLocalService getWrappedService() {
		return _countedLocalService;
	}

	@Override
	public void setWrappedService(CountedLocalService countedLocalService) {
		_countedLocalService = countedLocalService;
	}

	private CountedLocalService _countedLocalService;

}