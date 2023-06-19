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
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.training.counted.model.Counted;
import com.liferay.training.counted.service.CountedLocalService;
import com.liferay.training.counted.service.base.CountedLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.training.counted.model.Counted",
	service = AopService.class
)
public class CountedLocalServiceImpl extends CountedLocalServiceBaseImpl {

	public Counted addcounted(long groupId, String nome, String telefone, String email, int idade, ServiceContext serviceContext) throws PortalException {
		Group group = GroupLocalServiceUtil.getGroup(groupId);
		long userId = serviceContext.getUserId();
		User user = userLocalService.getUser(userId);

		long countedId = counterLocalService.increment(Counted.class.getName());

		Counted counted = createCounted(countedId);

		counted.setGroupId(groupId);
		counted.setCompanyId(group.getCompanyId());
		counted.setUserId(userId);
		counted.setUserName(user.getScreenName());
		counted.setCreateDate(new Date());
		counted.setModifiedDate(new Date());

		counted.setNome(nome);
		counted.setTelefone(telefone);
		counted.setEmail(email);
		counted.setIdade(idade);


		return super.addCounted(counted);

	}


	public Counted updatecounted(long countedId, String nome, String telefone, String email, int idade, ServiceContext serviceContext) throws PortalException{

		Counted counted = getCounted(countedId);


		counted.setModifiedDate(new Date());

		counted.setNome(nome);
		counted.setTelefone(telefone);
		counted.setEmail(email);
		counted.setIdade(idade);
		return super.addCounted(counted);
	}

	@Override
	public Counted addCounted(Counted counted) {
		throw new UnsupportedOperationException("NOt supported");
	}

	@Override
	public Counted updateCounted(Counted counted) {
		throw new UnsupportedOperationException("NOt supported");
	}
}