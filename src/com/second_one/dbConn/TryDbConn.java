package com.second_one.dbConn;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/connect")
public class TryDbConn {
	
	@Path("/toDB")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnDBStatus()
	{
		PreparedStatement query=null;
		String myString=null;
		String returnString=null;
		Connection conn=null;
		
		
		try{
			
			conn=Oracle_
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return "<p>Database Connection</p>";
	}
	

}
