package contactApp.contactApp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import contactApp.model.daos.DataSourceFactory;
/**
 * Hello world!
 *
 */
public class App 
{                                                 
	
    public static void main( String[] args ) throws SQLException,IOException
    {
        System.out.println( "Hello World!" );
        
        try(Connection con= DataSourceFactory.getConnection()){
    		
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
        DataSourceFactory.createdatabaseSchema();
    }
    
}
