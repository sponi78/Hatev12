import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import static java.lang.System.in;


class moreactions
{

    private final DataInputStream in;
    private final PrintStream out;
  /*  private PrintStream out;

    actions(PrintStream out) {
        this.out = out;
    }
     private DataInputStream in;

    actions(DataInputStream in) {
        this.in = in;
    }
*/
    moreactions(PrintStream out, DataInputStream in) {
         this.out = out;
         this.in = in;
          }
    void tuwas(String line) throws IOException
    {
       if(line.equals("test")){
while((line = in.readLine()) != null && !line.equals(".")) {
    out.println("HHH: "+line);
    break;
}
       }
// perfectly defined now because out is an attribute
    }

}