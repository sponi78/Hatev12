
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andreas
 */
public class checklogin {
    private String line;
    private String password;
    private String username;
   
    private PrintStream out;

	   checklogin(PrintStream out) {
	        this.out = out;
	    }

     private DataInputStream in;

	   checklogin(DataInputStream in) {
	        this.in = in;
	    }

  
           
           int login() throws IOException{
                out.println("\r\nPlease enter Username:\r\n");
        while((line = in.readLine()) != null && !line.equals("exit")) {
          username=line;
          out.println("I got:" + line);
          break;
        }
        out.println("Please enter password:\r\n");
        // Now write to the client
        while((line = in.readLine()) != null && !line.equals("exit")) {
            password=line;
        break;   
          }
               
        return 1;
           //catch (IOException ioe) {
     //   System.out.println("IOException on socket listen: " + ioe);
    //    ioe.printStackTrace();
      }
}

