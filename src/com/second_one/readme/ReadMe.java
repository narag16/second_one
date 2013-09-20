package com.second_one.readme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/read")
public class ReadMe {

	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnReadMe()
	{
		return "<p>Read Me</p>";
	}
	
}
