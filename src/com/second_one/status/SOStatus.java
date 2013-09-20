package com.second_one.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/so/status")
public class SOStatus {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle()
	{
		return "<p>Java Web Service</p>";
	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion()
	{
		return "<p>Version 1.0</p>";
	}
}
