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

package com.liferay.training.counted.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.training.counted.model.Counted;
import com.liferay.training.counted.service.base.CountedServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=counted",
		"json.web.service.context.path=Counted"
	},
	service = AopService.class
)
public class CountedServiceImpl extends CountedServiceBaseImpl {

	public Counted addcounted(long groupId, String nome, String telefone, String email, int idade, ServiceContext serviceContext) throws PortalException{
	   return countedLocalService.addcounted(groupId,nome,telefone,email,idade,serviceContext);
	}

	public Counted updatecounted(long countedId, String nome, String telefone, String email, int idade, ServiceContext serviceContext) throws PortalException{
		return countedLocalService.updatecounted(countedId,nome,telefone,email,idade,serviceContext);
	}

	public List<Counted> getCountedByGroupId(long grupoId){
		return countedPersistence.findBygroupId(grupoId);
	}

	public Counted getCounted(long countedId) throws PortalException{
		return countedLocalService.getCounted(countedId);
	}

	public Counted deleteContacto(long countedId) throws PortalException {
		return countedLocalService.deleteCounted(countedId);
	}


}