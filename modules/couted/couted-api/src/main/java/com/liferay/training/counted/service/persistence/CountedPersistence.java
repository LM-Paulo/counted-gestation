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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.training.counted.exception.NoSuchCountedException;
import com.liferay.training.counted.model.Counted;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the counted service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CountedUtil
 * @generated
 */
@ProviderType
public interface CountedPersistence extends BasePersistence<Counted> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CountedUtil} to access the counted persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the counteds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching counteds
	 */
	public java.util.List<Counted> findByUuid(String uuid);

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
	public java.util.List<Counted> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Counted> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Counted>
			orderByComparator);

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
	public java.util.List<Counted> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Counted>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first counted in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching counted
	 * @throws NoSuchCountedException if a matching counted could not be found
	 */
	public Counted findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Counted>
				orderByComparator)
		throws NoSuchCountedException;

	/**
	 * Returns the first counted in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching counted, or <code>null</code> if a matching counted could not be found
	 */
	public Counted fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Counted>
			orderByComparator);

	/**
	 * Returns the last counted in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching counted
	 * @throws NoSuchCountedException if a matching counted could not be found
	 */
	public Counted findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Counted>
				orderByComparator)
		throws NoSuchCountedException;

	/**
	 * Returns the last counted in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching counted, or <code>null</code> if a matching counted could not be found
	 */
	public Counted fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Counted>
			orderByComparator);

	/**
	 * Returns the counteds before and after the current counted in the ordered set where uuid = &#63;.
	 *
	 * @param countedId the primary key of the current counted
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next counted
	 * @throws NoSuchCountedException if a counted with the primary key could not be found
	 */
	public Counted[] findByUuid_PrevAndNext(
			long countedId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Counted>
				orderByComparator)
		throws NoSuchCountedException;

	/**
	 * Removes all the counteds where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of counteds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching counteds
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the counted where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCountedException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching counted
	 * @throws NoSuchCountedException if a matching counted could not be found
	 */
	public Counted findByUUID_G(String uuid, long groupId)
		throws NoSuchCountedException;

	/**
	 * Returns the counted where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching counted, or <code>null</code> if a matching counted could not be found
	 */
	public Counted fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the counted where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching counted, or <code>null</code> if a matching counted could not be found
	 */
	public Counted fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the counted where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the counted that was removed
	 */
	public Counted removeByUUID_G(String uuid, long groupId)
		throws NoSuchCountedException;

	/**
	 * Returns the number of counteds where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching counteds
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the counteds where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching counteds
	 */
	public java.util.List<Counted> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Counted> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Counted> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Counted>
			orderByComparator);

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
	public java.util.List<Counted> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Counted>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first counted in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching counted
	 * @throws NoSuchCountedException if a matching counted could not be found
	 */
	public Counted findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Counted>
				orderByComparator)
		throws NoSuchCountedException;

	/**
	 * Returns the first counted in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching counted, or <code>null</code> if a matching counted could not be found
	 */
	public Counted fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Counted>
			orderByComparator);

	/**
	 * Returns the last counted in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching counted
	 * @throws NoSuchCountedException if a matching counted could not be found
	 */
	public Counted findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Counted>
				orderByComparator)
		throws NoSuchCountedException;

	/**
	 * Returns the last counted in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching counted, or <code>null</code> if a matching counted could not be found
	 */
	public Counted fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Counted>
			orderByComparator);

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
	public Counted[] findByUuid_C_PrevAndNext(
			long countedId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Counted>
				orderByComparator)
		throws NoSuchCountedException;

	/**
	 * Removes all the counteds where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of counteds where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching counteds
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the counteds where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching counteds
	 */
	public java.util.List<Counted> findBygroupId(long groupId);

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
	public java.util.List<Counted> findBygroupId(
		long groupId, int start, int end);

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
	public java.util.List<Counted> findBygroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Counted>
			orderByComparator);

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
	public java.util.List<Counted> findBygroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Counted>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first counted in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching counted
	 * @throws NoSuchCountedException if a matching counted could not be found
	 */
	public Counted findBygroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Counted>
				orderByComparator)
		throws NoSuchCountedException;

	/**
	 * Returns the first counted in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching counted, or <code>null</code> if a matching counted could not be found
	 */
	public Counted fetchBygroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Counted>
			orderByComparator);

	/**
	 * Returns the last counted in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching counted
	 * @throws NoSuchCountedException if a matching counted could not be found
	 */
	public Counted findBygroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Counted>
				orderByComparator)
		throws NoSuchCountedException;

	/**
	 * Returns the last counted in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching counted, or <code>null</code> if a matching counted could not be found
	 */
	public Counted fetchBygroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Counted>
			orderByComparator);

	/**
	 * Returns the counteds before and after the current counted in the ordered set where groupId = &#63;.
	 *
	 * @param countedId the primary key of the current counted
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next counted
	 * @throws NoSuchCountedException if a counted with the primary key could not be found
	 */
	public Counted[] findBygroupId_PrevAndNext(
			long countedId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Counted>
				orderByComparator)
		throws NoSuchCountedException;

	/**
	 * Removes all the counteds where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeBygroupId(long groupId);

	/**
	 * Returns the number of counteds where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching counteds
	 */
	public int countBygroupId(long groupId);

	/**
	 * Caches the counted in the entity cache if it is enabled.
	 *
	 * @param counted the counted
	 */
	public void cacheResult(Counted counted);

	/**
	 * Caches the counteds in the entity cache if it is enabled.
	 *
	 * @param counteds the counteds
	 */
	public void cacheResult(java.util.List<Counted> counteds);

	/**
	 * Creates a new counted with the primary key. Does not add the counted to the database.
	 *
	 * @param countedId the primary key for the new counted
	 * @return the new counted
	 */
	public Counted create(long countedId);

	/**
	 * Removes the counted with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param countedId the primary key of the counted
	 * @return the counted that was removed
	 * @throws NoSuchCountedException if a counted with the primary key could not be found
	 */
	public Counted remove(long countedId) throws NoSuchCountedException;

	public Counted updateImpl(Counted counted);

	/**
	 * Returns the counted with the primary key or throws a <code>NoSuchCountedException</code> if it could not be found.
	 *
	 * @param countedId the primary key of the counted
	 * @return the counted
	 * @throws NoSuchCountedException if a counted with the primary key could not be found
	 */
	public Counted findByPrimaryKey(long countedId)
		throws NoSuchCountedException;

	/**
	 * Returns the counted with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param countedId the primary key of the counted
	 * @return the counted, or <code>null</code> if a counted with the primary key could not be found
	 */
	public Counted fetchByPrimaryKey(long countedId);

	/**
	 * Returns all the counteds.
	 *
	 * @return the counteds
	 */
	public java.util.List<Counted> findAll();

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
	public java.util.List<Counted> findAll(int start, int end);

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
	public java.util.List<Counted> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Counted>
			orderByComparator);

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
	public java.util.List<Counted> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Counted>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the counteds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of counteds.
	 *
	 * @return the number of counteds
	 */
	public int countAll();

}