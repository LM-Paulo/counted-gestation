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

package com.liferay.training.counted.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.training.counted.service.CountedServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>CountedServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CountedServiceSoap
 * @generated
 */
public class CountedServiceHttp {

	public static com.liferay.training.counted.model.Counted addcounted(
			HttpPrincipal httpPrincipal, long groupId, String nome,
			String telefone, String email, int idade,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CountedServiceUtil.class, "addcounted",
				_addcountedParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, nome, telefone, email, idade,
				serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.counted.model.Counted)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.counted.model.Counted updatecounted(
			HttpPrincipal httpPrincipal, long countedId, String nome,
			String telefone, String email, int idade,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CountedServiceUtil.class, "updatecounted",
				_updatecountedParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, countedId, nome, telefone, email, idade,
				serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.counted.model.Counted)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.training.counted.model.Counted>
		getCountedByGroupId(HttpPrincipal httpPrincipal, long grupoId) {

		try {
			MethodKey methodKey = new MethodKey(
				CountedServiceUtil.class, "getCountedByGroupId",
				_getCountedByGroupIdParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, grupoId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.training.counted.model.Counted>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.counted.model.Counted getCounted(
			HttpPrincipal httpPrincipal, long countedId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CountedServiceUtil.class, "getCounted",
				_getCountedParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, countedId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.counted.model.Counted)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.training.counted.model.Counted deleteContacto(
			HttpPrincipal httpPrincipal, long countedId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CountedServiceUtil.class, "deleteContacto",
				_deleteContactoParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, countedId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.training.counted.model.Counted)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CountedServiceHttp.class);

	private static final Class<?>[] _addcountedParameterTypes0 = new Class[] {
		long.class, String.class, String.class, String.class, int.class,
		com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _updatecountedParameterTypes1 =
		new Class[] {
			long.class, String.class, String.class, String.class, int.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _getCountedByGroupIdParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[] _getCountedParameterTypes3 = new Class[] {
		long.class
	};
	private static final Class<?>[] _deleteContactoParameterTypes4 =
		new Class[] {long.class};

}