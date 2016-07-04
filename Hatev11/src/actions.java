
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import static java.lang.System.in;

class actions {

    private final DataInputStream in;
    private final PrintStream out;

   
    actions(PrintStream out, DataInputStream in) {
        this.out = out;
        this.in = in;
    }

    void userconfront(String line, int guserid, String gusername) throws IOException {
        out.println("What you gonna do with user " + gusername);

        while ((line = in.readLine()) != null && !line.equals(".")) {
            if (line.equals("test")) {
                out.println("HHH: " + line);
            }
            if (line.equals("exit")) {
                break;
            }

            break;
        }
// perfectly defined now because out is an attribute
    }

}
