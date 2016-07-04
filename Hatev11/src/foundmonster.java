import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import static java.lang.System.in;



class foundmonster
{

    private final DataInputStream in;
    private final PrintStream out;
    private String line;
 
  /*  private PrintStream out;

    actions(PrintStream out) {
        this.out = out;
    }
     private DataInputStream in;

    actions(DataInputStream in) {
        this.in = in;
    }
*/
    foundmonster(PrintStream out, DataInputStream in) {
         this.out = out;
         this.in = in;
          }
    void monstertask(int userid, int monsterid, String monstername, String monsterrace) throws IOException
    {
      out.println("You have found monster called "+monstername+" from the race "+monsterrace);
while((line = in.readLine()) != null && !line.equals(".")) {
    out.println("HHH: "+line);
 
       }
// perfectly defined now because out is an attribute
    }

}