import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.sql.*;
import java.io.*;

/**
 *
 * @author Andreas
 */
public class sqlhandler {
   private String mServer="127.0.0.1";
private	String mUser="root";
private	String mPassword="";
private        String startmessage;
public int posx;
public int posy;
public int wpid;
public int userid;
public int logged;
public int messageid;
public String username;
public int guserid;
public String gusername;
public int gstrength;
public int gdefense;
public int monsterid;
public int genergy;
public int gmagic_defense;
public int gpoison_defense;
public int gcurse_defense;
public int ggold;

public int founduser;
public int foundmonster;
public String monstername;
public String monsterrace;
public int mposx;
public int mposy;
public int mstrength;
public int mdefense;
public int menergy;
public int mmagic_defense;
public int mpoison_defense;
public int mcurse_defense;

	  private PrintStream out;
    public String mdescription;
    public int mgold;

	   sqlhandler(PrintStream out) {
	        this.out = out;
	    }
    
    void messages(String mtext)
  {
       
    try
   
    {   
        
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://"+mServer+":3306/hate";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, mUser, mPassword);
     
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "SELECT * FROM mud_news where mtext='"+mtext+"'";
 
      // create the java statement
      Statement st = conn.createStatement();
       
      // execute the query, and get a java resultset
      ResultSet rs = st.executeQuery(query);
       
      // iterate through the java resultset
      while (rs.next())
      {
   
     startmessage = rs.getString("news");
  
     out.println(startmessage);
        // print the results
    

      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }

  }
    
    int login(String username, String password)
  {

    try
   
    { 
    	
    	  
    	 
    	
    	 
    	    // out.println("Suppa");
    	//int[] position = new int[2];
      // create our mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://"+mServer+":3306/hate";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, mUser, mPassword);
 
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "SELECT * FROM user where username='"+username+"' AND password='"+password+"'";
 
      // create the java statement
      Statement st = conn.createStatement();
       
      // execute the query, and get a java resultset
      ResultSet rs = st.executeQuery(query);
       
      // iterate through the java resultset
      while (rs.next())
      {
    	  
        int id = rs.getInt("id");
        wpid = rs.getInt("wpid");
        String firstName = rs.getString("username");
        String lastName = rs.getString("email");
        posx=rs.getInt("posx");
         posy=rs.getInt("posy");
         userid=id;
      System.out.println(posx+" "+posy);
        matrix matrix=new matrix();
        
        // print the results
    logged=1;
       
      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
    return logged;
  }  
    
     int getpos(int userid)
  {

    try
   
    { 
    	
    	  
    	 
    	
    	 
    	    // out.println("Suppa");
    	//int[] position = new int[2];
      // create our mysql database connection
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
    	  
       
        posx=rs.getInt("posx");
         posy=rs.getInt("posy");
        
      System.out.println(posx+" "+posy);
      
        
        // print the results
   
       
      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
    return logged;
  }  
     
     
     
      void update(int id, String direction)
 {
   try
   {
   	//int[] position = new int[2];
     // create our mysql database connection
     String myDriver = "com.mysql.jdbc.Driver";
     String myUrl = "jdbc:mysql://"+mServer+":3306/hate";
     Class.forName(myDriver);
     Connection conn = DriverManager.getConnection(myUrl, mUser, mPassword);
    
     // our SQL SELECT query. 
     // if you only need a few columns, specify them by name instead of using "*"
     
String query="";

   
     
     if(direction.equals("e")){
   	  query = "update user set posx=posx+1 where id ='"+id+"'";
   	  
     	
     }
     if(direction.equals("w")){
   	  query = "update user set posx=posx-1 where id ='"+id+"'";
   	 
     }	
     if(direction.equals("n")){
   	  query = "update user set posy=posy-1 where id ='"+id+"'";
    
     }
     if(direction.equals("s")){
   	  query = "update user set posy=posy+1 where id ='"+id+"'";

     }
     System.out.println(query);
     // create the java statement

     
   //  Statement   st = conn.createStatement();
      
     // execute the query, and get a java resultset
   // ResultSet  rs = st.executeUpdate(query);
      
    PreparedStatement pst =  conn.prepareStatement(query);
    int numRowsChanged = pst.executeUpdate(query);
      
   //   st = conn.createStatement();
       
      // execute the query, and get a java resultset
      // rs = st.executeQuery(query);
     
    
    }
   catch (Exception e)
   {
     System.err.println("Got an exception! ");
     System.err.println(e.getMessage());
   }
    
}
 void pmessages(int userid)
  {
       
    try
   
    {   
        System.out.println("IM MESSSAGE");
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://"+mServer+":3306/hate";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, mUser, mPassword);
     System.out.println("USERID:"+userid);
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "SELECT * FROM message where userid='"+userid+"' AND red=0";
 
      // create the java statement
      Statement st = conn.createStatement();
       
      // execute the query, and get a java resultset
      ResultSet rs = st.executeQuery(query);
       
      // iterate through the java resultset
      while (rs.next())
      {
    System.out.println("IM MESSSAGE");
     startmessage = rs.getString("message");
    messageid=rs.getInt("id");
     out.println(startmessage);
        // print the results
    

      }
      
      
         	  query = "update message set red=1 where id ='"+messageid+"'";
          
    PreparedStatement pst =  conn.prepareStatement(query);
    int numRowsChanged = pst.executeUpdate(query);
      
      
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }

  }
 int checkuser(int posx, int posy){
      try
		    {
                        
                         System.out.println("Checkuser"+posx+" "+posy);
       String  myDriver = "com.mysql.jdbc.Driver";
         String myUrl = "jdbc:mysql://"+mServer+":3306/hate";
          Class.forName(myDriver);
        Connection conn = DriverManager.getConnection(myUrl, mUser, mPassword);   
          
         String query = "SELECT * FROM user where posx='"+posx+"' AND posy='"+posy+"' AND id!='"+userid+"'";
          System.out.println(query);
               // create the java statement
               Statement st2 = conn.createStatement();
                
               // execute the query, and get a java resultset
               ResultSet rs2 = st2.executeQuery(query);
                founduser=0;
               // iterate through the java resultset
               while (rs2.next())
               {
              
             System.out.println("FOUND!!!!!");
             guserid=rs2.getInt("id");
             gusername=rs2.getString("username");
             
              genergy=rs2.getInt("energy");
              gmagic_defense=rs2.getInt("magic_defense");
              gcurse_defense=rs2.getInt("curse_defense");
              gpoison_defense=rs2.getInt("poisondefense");
             ggold=rs2.getInt("gold");
             
             System.out.println(guserid+" "+gusername);
                username = rs2.getString("username");
                if(username != null && !username.isEmpty()) { 
            	   out.println("You found player "+username+"!"); 
                   founduser=1;
               
               }
           
                 
                 // print the results
             
               }
      }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
 return founduser;
 }
 int checkmonster(int posx, int posy){
      try
		    {
                        
                         System.out.println("Checkuser"+posx+" "+posy);
       String  myDriver = "com.mysql.jdbc.Driver";
         String myUrl = "jdbc:mysql://"+mServer+":3306/hate";
          Class.forName(myDriver);
        Connection conn = DriverManager.getConnection(myUrl, mUser, mPassword);   
          
         String query = "SELECT * FROM monster where posx='"+posx+"' AND posy='"+posy+"'";
          System.out.println(query);
               // create the java statement
               Statement st2 = conn.createStatement();
                
               // execute the query, and get a java resultset
               ResultSet rs2 = st2.executeQuery(query);
                founduser=0;
               // iterate through the java resultset
               while (rs2.next())
               {
              
             System.out.println("FOUND!!!!!");
             monsterid=rs2.getInt("id");
             monstername=rs2.getString("monstername");
              monsterrace=rs2.getString("monsterrace");
              mstrength=rs2.getInt("strength");
              mdescription=rs2.getString("monster_description");
              mgold=rs2.getInt("gold");
              mdefense=rs2.getInt("defense");
              menergy=rs2.getInt("energy");
              mmagic_defense=rs2.getInt("magic_defense");
              mcurse_defense=rs2.getInt("curse_defense");
              mpoison_defense=rs2.getInt("poison_defense");
             System.out.println(guserid+" "+gusername);
          
                if(monstername != null && !monstername.isEmpty()) { 
            	  // out.println("You found a mosnter: "+monstername+"!"); 
                   foundmonster=1;
               
               }
           
                 
                 // print the results
             
               }
      }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
 return foundmonster;
 }
}
