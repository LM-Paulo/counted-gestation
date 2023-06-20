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
 * Provides a wrapper for {@link CountedService}.
 *
 * @author Brian Wing Shun Chan
 * @see CountedService
 * @generated
 */
public class CountedServiceWrapper
	implements CountedService, ServiceWrapper<CountedService> {

	public CountedServiceWrapper(CountedService countedService) {
		_countedService = countedService;
	}

	@Override
	public com.liferay.training.counted.model.Counted addcounted(
			long groupId, String nome, String telefone, String email, int idade,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _countedService.addcounted(
			groupId, nome, telefone, email, idade, serviceContext);
	}

	@Override
	public com.liferay.training.counted.model.Counted deleteContacto(
			long countedId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _countedService.deleteContacto(countedId);
	}

	@Override
	public com.liferay.training.counted.model.Counted getCounted(long countedId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _countedService.getCounted(countedId);
	}

	@Override
	public java.util.List<com.liferay.training.counted.model.Counted>
		getCountedByGroupId(long grupoId) {

		return _countedService.getCountedByGroupId(grupoId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _countedService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.training.counted.model.Counted updatecounted(
			long countedId, String nome, String telefone, String email,
			int idade,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _countedService.updatecounted(
			countedId, nome, telefone, email, idade, serviceContext);
	}

	@Override
	public CountedService getWrappedService() {
		return _countedService;
	}

	@Override
	public void setWrappedService(CountedService countedService) {
		_countedService = countedService;
	}

	private CountedService _countedService;

}