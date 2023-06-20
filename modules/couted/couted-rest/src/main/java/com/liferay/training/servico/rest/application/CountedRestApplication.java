package com.liferay.training.servico.rest.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.CompanyService;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.PortalUtil;
import javax.ws.rs.core.Response;
import com.liferay.training.counted.model.Counted;
import com.liferay.training.counted.service.CountedService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

/**
 * @author Paulo
 */
@Component(
	property = {
		JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/greetings",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=Greetings.Rest"
	},
	service = Application.class
)
public class CountedRestApplication extends Application {

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}


	@Reference
	private CountedService countedService;

	@Reference
	private CompanyService companyService;


	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getCountedByGroupId() {
		try {
			List<Counted> counted = new ArrayList<Counted>();
			Company company = companyService.getCompanyById(PortalUtil.getDefaultCompanyId());

			List<Group> groups = GroupLocalServiceUtil.getGroups(company.getCompanyId(), 0, true);

			for(Group group : groups) {
				counted.addAll(countedService.getCountedByGroupId(group.getGroupId()));
			}

			return JSONFactoryUtil.serialize(counted);
		} catch (Exception e) {
			return "{}";
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCounted() {
		try {
			List<Counted> counted = new ArrayList<Counted>();
			Company company = companyService.getCompanyById(PortalUtil.getDefaultCompanyId());

			List<Group> groups = GroupLocalServiceUtil.getGroups(company.getCompanyId(), 0, true);

			for(Group group : groups) {
				counted.addAll(countedService.getCountedByGroupId(group.getGroupId()));
			}

			return Response.ok(counted).build();
		} catch (Exception e) {
			return Response.ok().build();
		}
	}

	@GET
	@Path("/{countedId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCounted(@PathParam("countedId") long groupId) {
		try {
			return Response.ok(countedService.getCounted(groupId)).build();
		} catch (Exception e) {
			return Response.serverError().build();
		}
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response addCounted(CountedDto countedDto, @Context HttpServletRequest request) {
		try {

			long userId = Long.parseLong(request.getUserPrincipal().getName());

			ServiceContext serviceContext = new ServiceContext();
			serviceContext.setRequest(request);
			serviceContext.setCompanyId(PortalUtil.getDefaultCompanyId());
			serviceContext.setUserId(userId);

			Counted counted = countedService.addcounted(countedDto.getGroupId(),
					countedDto.getNome(),
					countedDto.getTelefone(),
					countedDto.getEmail(),
					countedDto.getIdade(),
					serviceContext);

			return Response.ok(counted).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@PUT
	@Path("/{countedId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateCounted(@PathParam("countedId") long countedId, CountedDto countedDto) {
		try {
			Counted counted = countedService.updatecounted(countedId, countedDto.getNome(), countedDto.getTelefone(), countedDto.getEmail(), countedDto.getIdade(),new ServiceContext());

			return Response.ok(counted).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@DELETE
	@Path("/{countedId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteCounted(@PathParam("countedId") long contactoId) {
		try {
			System.out.println(contactoId);
			return Response.ok(countedService.deleteContacto(contactoId)).build();
		} catch (Exception e) {
			return Response.serverError().build();
		}
	}

}