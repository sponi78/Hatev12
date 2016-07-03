import java.io.*;
import java.net.*;
import java.security.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;


public class matrix {
	  private static String OS = System.getProperty("os.name").toLowerCase();
	 int i; // Class Variable(State)
	public String[][] matrix = new String[100][100];
	 String Fileinclude;
	 void method() {
	 System.out.println("Got Matrix");
	 try{
		 
	 
		 if (isWindows()) {
		 Fileinclude="C:/Users/Andreas/Desktop/ydata.xsv";
		 }else{
			  Fileinclude="ydata.xsv";
		 }
		// Scanner scanner = new Scanner(new File("C:/Users/Andreas/Desktop/data.xsv"));
		 Scanner scanner = new Scanner(new File(Fileinclude));
     scanner.useDelimiter(Pattern.compile(",|\r\n"));
     for(int i=0 ; i<100 ; i++){
         for(int j=0 ; j<100 ; j++) {
             matrix[i][j] = scanner.next();
             //System.out.print(matrix[i][j]);
         }//System.out.println();
     }} catch(FileNotFoundException ex){}
	 }// Method (Behavior)

	 
	 public static boolean isWindows() {
	        return (OS.indexOf("win") >= 0);
	    }

	    public static boolean isMac() {
	        return (OS.indexOf("mac") >= 0);
	    }

	    public static boolean isUnix() {
	        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
	    }

	    public static boolean isSolaris() {
	        return (OS.indexOf("sunos") >= 0);
	    }
	    public static String getOS(){
	        if (isWindows()) {
	            return "win";
	        } else if (isMac()) {
	            return "osx";
	        } else if (isUnix()) {
	            return "uni";
	        } else if (isSolaris()) {
	            return "sol";
	        } else {
	            return "err";
	        }
	}
}