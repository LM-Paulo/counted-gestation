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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.training.counted.model.Counted;

import java.util.List;

/**
 * Provides the remote service utility for Counted. This utility wraps
 * <code>com.liferay.training.counted.service.impl.CountedServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CountedService
 * @generated
 */
public class CountedServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.counted.service.impl.CountedServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Counted addcounted(
			long groupId, String nome, String telefone, String email, int idade,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addcounted(
			groupId, nome, telefone, email, idade, serviceContext);
	}

	public static Counted deleteContacto(long countedId)
		throws PortalException {

		return getService().deleteContacto(countedId);
	}

	public static Counted getCounted(long countedId) throws PortalException {
		return getService().getCounted(countedId);
	}

	public static List<Counted> getCountedByGroupId(long grupoId) {
		return getService().getCountedByGroupId(grupoId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Counted updatecounted(
			long countedId, String nome, String telefone, String email,
			int idade,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updatecounted(
			countedId, nome, telefone, email, idade, serviceContext);
	}

	public static CountedService getService() {
		return _service;
	}

	private static volatile CountedService _service;

}