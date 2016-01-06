package com.github.harmishlakhani.messenger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoResource {

	@GET
	@Path("/annotations")
	public String getParamUsingAnnotation(@MatrixParam("key") String matrixParam,
							  @HeaderParam("authToken") String authToken,
							  @CookieParam("cookie") String cookie) {

		return "Matrix param " + matrixParam + " " + authToken + " " + cookie;
	}
	
	@GET
	@Path("/context")
	public String getParamUsingContext(@Context UriInfo uriInfo,
									   @Context HttpHeaders httpHeaders) {

		String path = uriInfo.getAbsolutePath().toString();
		String headers = httpHeaders.toString();
		return headers;
	}
}
