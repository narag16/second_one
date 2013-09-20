package com.second_one.dbConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.second_one.dao.Oracle_weblogic;


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
			
			conn=(Connection) Oracle_weblogic.Oracle_Conn().getConnection();
			query=conn.prepareStatement("select to_char(sysdate,'YYYY-MM-DD HH24:MI:SS')DATETIME from sys.dual");
			ResultSet rs=query.executeQuery();
			
			while(rs.next())
			{
				myString=rs.getString("DATETIME");
			}
			query.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			
			if(conn!= null)
				conn.close();
		}
		
		return "<p>Date Time from Database :"+ myString+" </p>";
	}
	

}
