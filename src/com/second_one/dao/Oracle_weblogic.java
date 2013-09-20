package com.second_one.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Oracle_weblogic {

	private static DataSource Oracle_weblogic=null;
	private static Context context =null;
	
	
	public static DataSource Oracle_Conn() throws Exception
	{
		
		if(Oracle_weblogic!=null)
			return Oracle_weblogic;
		
		
		try{
			if(context==null)
			{
				context=new InitialContext();
			}
			Oracle_weblogic=(DataSource) context.lookup("second_one_db");
			
		}
		catch(Exception e)
		{
			throw e;
		}
		
		return Oracle_weblogic;
	}
	
	
	
}
