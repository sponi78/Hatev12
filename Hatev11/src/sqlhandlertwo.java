import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.sql.*;
import java.io.*;

/**
 *
 * @author Andreas
 */
public class sqlhandlertwo {
   private String mServer="127.0.0.1";
private	String mUser="root";
private	String mPassword="";
private        String startmessage;


public int ustrength;
public int udefense;
public int uenergy;
public int umagic_defense;
public int upoison_defense;
public int ucurse_defense;



	  private PrintStream out;

	   sqlhandlertwo(PrintStream out) {
	        this.out = out;
	    }


    void userinfo(int userid)
  {
       
    try
   
    {   
        
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://"+mServer+":3306/hate";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, mUser, mPassword);
     
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "SELECT * FROM user where id='"+userid+"'";
 
      // create the java statement
      Statement st = conn.createStatement();
       
      // execute the query, and get a java resultset
      ResultSet rs = st.executeQuery(query);
       
      // iterate through the java resultset
      while (rs.next())
      {
   
     ustrength = rs.getInt("strength");
      udefense = rs.getInt("defense");
      uenergy=rs.getInt("energy");
              umagic_defense=rs.getInt("magic_defense");
              ucurse_defense=rs.getInt("curse_defense");
              upoison_defense=rs.getInt("poison_defense");
    
        // print the results
    

      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }

  }//Ende Methode
    
}