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

package com.liferay.training.counted.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.counted.model.Counted;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the counted service. This utility wraps <code>com.liferay.training.counted.service.persistence.impl.CountedPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CountedPersistence
 * @generated
 */
public class CountedUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Counted counted) {
		getPersistence().clearCache(counted);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Counted> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Counted> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Counted> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Counted> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Counted> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Counted update(Counted counted) {
		return getPersistence().update(counted);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Counted update(
		Counted counted, ServiceContext serviceContext) {

		return getPersistence().update(counted, serviceContext);
	}

	/**
	 * Returns all the counteds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching counteds
	 */
	public static List<Counted> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the counteds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CountedModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of counteds
	 * @param end the upper bound of the range of counteds (not inclusive)
	 * @return the range of matching counteds
	 */
	public static List<Counted> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the counteds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CountedModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of counteds
	 * @param end the upper bound of the range of counteds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching counteds
	 */
	public static List<Counted> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Counted> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the counteds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CountedModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of counteds
	 * @param end the upper bound of the range of counteds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching counteds
	 */
	public static List<Counted> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Counted> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first counted in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching counted
	 * @throws NoSuchCountedException if a matching counted could not be found
	 */
	public static Counted findByUuid_First(
			String uuid, OrderByComparator<Counted> orderByComparator)
		throws com.liferay.training.counted.exception.NoSuchCountedException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first counted in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching counted, or <code>null</code> if a matching counted could not be found
	 */
	public static Counted fetchByUuid_First(
		String uuid, OrderByComparator<Counted> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last counted in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching counted
	 * @throws NoSuchCountedException if a matching counted could not be found
	 */
	public static Counted findByUuid_Last(
			String uuid, OrderByComparator<Counted> orderByComparator)
		throws com.liferay.training.counted.exception.NoSuchCountedException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last counted in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching counted, or <code>null</code> if a matching counted could not be found
	 */
	public static Counted fetchByUuid_Last(
		String uuid, OrderByComparator<Counted> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the counteds before and after the current counted in the ordered set where uuid = &#63;.
	 *
	 * @param countedId the primary key of the current counted
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next counted
	 * @throws NoSuchCountedException if a counted with the primary key could not be found
	 */
	public static Counted[] findByUuid_PrevAndNext(
			long countedId, String uuid,
			OrderByComparator<Counted> orderByComparator)
		throws com.liferay.training.counted.exception.NoSuchCountedException {

		return getPersistence().findByUuid_PrevAndNext(
			countedId, uuid, orderByComparator);
	}

	/**
	 * Removes all the counteds where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of counteds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching counteds
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the counted where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCountedException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching counted
	 * @throws NoSuchCountedException if a matching counted could not be found
	 */
	public static Counted findByUUID_G(String uuid, long groupId)
		throws com.liferay.training.counted.exception.NoSuchCountedException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the counted where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching counted, or <code>null</code> if a matching counted could not be found
	 */
	public static Counted fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the counted where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching counted, or <code>null</code> if a matching counted could not be found
	 */
	public static Counted fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the counted where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the counted that was removed
	 */
	public static Counted removeByUUID_G(String uuid, long groupId)
		throws com.liferay.training.counted.exception.NoSuchCountedException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of counteds where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching counteds
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the counteds where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching counteds
	 */
	public static List<Counted> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the counteds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CountedModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of counteds
	 * @param end the upper bound of the range of counteds (not inclusive)
	 * @return the range of matching counteds
	 */
	public static List<Counted> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the counteds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CountedModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of counteds
	 * @param end the upper bound of the range of counteds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching counteds
	 */
	public static List<Counted> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Counted> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the counteds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CountedModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of counteds
	 * @param end the upper bound of the range of counteds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching counteds
	 */
	public static List<Counted> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Counted> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first counted in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching counted
	 * @throws NoSuchCountedException if a matching counted could not be found
	 */
	public static Counted findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Counted> orderByComparator)
		throws com.liferay.training.counted.exception.NoSuchCountedException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first counted in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching counted, or <code>null</code> if a matching counted could not be found
	 */
	public static Counted fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Counted> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last counted in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching counted
	 * @throws NoSuchCountedException if a matching counted could not be found
	 */
	public static Counted findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Counted> orderByComparator)
		throws com.liferay.training.counted.exception.NoSuchCountedException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last counted in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching counted, or <code>null</code> if a matching counted could not be found
	 */
	public static Counted fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Counted> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the counteds before and after the current counted in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param countedId the primary key of the current counted
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next counted
	 * @throws NoSuchCountedException if a counted with the primary key could not be found
	 */
	public static Counted[] findByUuid_C_PrevAndNext(
			long countedId, String uuid, long companyId,
			OrderByComparator<Counted> orderByComparator)
		throws com.liferay.training.counted.exception.NoSuchCountedException {

		return getPersistence().findByUuid_C_PrevAndNext(
			countedId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the counteds where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of counteds where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching counteds
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the counteds where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching counteds
	 */
	public static List<Counted> findBygroupId(long groupId) {
		return getPersistence().findBygroupId(groupId);
	}

	/**
	 * Returns a range of all the counteds where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CountedModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of counteds
	 * @param end the upper bound of the range of counteds (not inclusive)
	 * @return the range of matching counteds
	 */
	public static List<Counted> findBygroupId(
		long groupId, int start, int end) {

		return getPersistence().findBygroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the counteds where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CountedModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of counteds
	 * @param end the upper bound of the range of counteds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching counteds
	 */
	public static List<Counted> findBygroupId(
		long groupId, int start, int end,
		OrderByComparator<Counted> orderByComparator) {

		return getPersistence().findBygroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the counteds where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CountedModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of counteds
	 * @param end the upper bound of the range of counteds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching counteds
	 */
	public static List<Counted> findBygroupId(
		long groupId, int start, int end,
		OrderByComparator<Counted> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBygroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first counted in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching counted
	 * @throws NoSuchCountedException if a matching counted could not be found
	 */
	public static Counted findBygroupId_First(
			long groupId, OrderByComparator<Counted> orderByComparator)
		throws com.liferay.training.counted.exception.NoSuchCountedException {

		return getPersistence().findBygroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first counted in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching counted, or <code>null</code> if a matching counted could not be found
	 */
	public static Counted fetchBygroupId_First(
		long groupId, OrderByComparator<Counted> orderByComparator) {

		return getPersistence().fetchBygroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last counted in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching counted
	 * @throws NoSuchCountedException if a matching counted could not be found
	 */
	public static Counted findBygroupId_Last(
			long groupId, OrderByComparator<Counted> orderByComparator)
		throws com.liferay.training.counted.exception.NoSuchCountedException {

		return getPersistence().findBygroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last counted in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching counted, or <code>null</code> if a matching counted could not be found
	 */
	public static Counted fetchBygroupId_Last(
		long groupId, OrderByComparator<Counted> orderByComparator) {

		return getPersistence().fetchBygroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the counteds before and after the current counted in the ordered set where groupId = &#63;.
	 *
	 * @param countedId the primary key of the current counted
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next counted
	 * @throws NoSuchCountedException if a counted with the primary key could not be found
	 */
	public static Counted[] findBygroupId_PrevAndNext(
			long countedId, long groupId,
			OrderByComparator<Counted> orderByComparator)
		throws com.liferay.training.counted.exception.NoSuchCountedException {

		return getPersistence().findBygroupId_PrevAndNext(
			countedId, groupId, orderByComparator);
	}

	/**
	 * Removes all the counteds where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeBygroupId(long groupId) {
		getPersistence().removeBygroupId(groupId);
	}

	/**
	 * Returns the number of counteds where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching counteds
	 */
	public static int countBygroupId(long groupId) {
		return getPersistence().countBygroupId(groupId);
	}

	/**
	 * Caches the counted in the entity cache if it is enabled.
	 *
	 * @param counted the counted
	 */
	public static void cacheResult(Counted counted) {
		getPersistence().cacheResult(counted);
	}

	/**
	 * Caches the counteds in the entity cache if it is enabled.
	 *
	 * @param counteds the counteds
	 */
	public static void cacheResult(List<Counted> counteds) {
		getPersistence().cacheResult(counteds);
	}

	/**
	 * Creates a new counted with the primary key. Does not add the counted to the database.
	 *
	 * @param countedId the primary key for the new counted
	 * @return the new counted
	 */
	public static Counted create(long countedId) {
		return getPersistence().create(countedId);
	}

	/**
	 * Removes the counted with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param countedId the primary key of the counted
	 * @return the counted that was removed
	 * @throws NoSuchCountedException if a counted with the primary key could not be found
	 */
	public static Counted remove(long countedId)
		throws com.liferay.training.counted.exception.NoSuchCountedException {

		return getPersistence().remove(countedId);
	}

	public static Counted updateImpl(Counted counted) {
		return getPersistence().updateImpl(counted);
	}

	/**
	 * Returns the counted with the primary key or throws a <code>NoSuchCountedException</code> if it could not be found.
	 *
	 * @param countedId the primary key of the counted
	 * @return the counted
	 * @throws NoSuchCountedException if a counted with the primary key could not be found
	 */
	public static Counted findByPrimaryKey(long countedId)
		throws com.liferay.training.counted.exception.NoSuchCountedException {

		return getPersistence().findByPrimaryKey(countedId);
	}

	/**
	 * Returns the counted with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param countedId the primary key of the counted
	 * @return the counted, or <code>null</code> if a counted with the primary key could not be found
	 */
	public static Counted fetchByPrimaryKey(long countedId) {
		return getPersistence().fetchByPrimaryKey(countedId);
	}

	/**
	 * Returns all the counteds.
	 *
	 * @return the counteds
	 */
	public static List<Counted> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the counteds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CountedModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of counteds
	 * @param end the upper bound of the range of counteds (not inclusive)
	 * @return the range of counteds
	 */
	public static List<Counted> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the counteds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CountedModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of counteds
	 * @param end the upper bound of the range of counteds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of counteds
	 */
	public static List<Counted> findAll(
		int start, int end, OrderByComparator<Counted> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the counteds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CountedModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of counteds
	 * @param end the upper bound of the range of counteds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of counteds
	 */
	public static List<Counted> findAll(
		int start, int end, OrderByComparator<Counted> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the counteds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of counteds.
	 *
	 * @return the number of counteds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CountedPersistence getPersistence() {
		return _persistence;
	}

	private static volatile CountedPersistence _persistence;

}