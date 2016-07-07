import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import static java.lang.System.in;



class foundmonster
{

    private final DataInputStream in;
    private final PrintStream out;
    private String line;
 public int luserid;
public  int lmonsterid;
public String lmonstername;
public String lmonsterrace;
public String lmdescription;
public int lmgold;
public int ustrength;
public int udefense;
public int lstrength;
public int ldefense;

public int lmagic_defense;
public int lpoison_defense;
public int lcurse_defense;
public int lenergy;
 
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
    void monstertask(int userid, int monsterid, String monstername, String monsterrace, String mdescription, int mgold, int mdefense, int mstrength, int menergy,int mmagic_defense,int mpoison_defense,int mcurse_defense) throws IOException
    {
        
        sqlhandlertwo userinfo;
        userinfo = new sqlhandlertwo(out);
        luserid= userid;
        lmonsterid= monsterid;
        lmonstername=monstername;
        lmonsterrace= monsterrace;
        lmgold = mgold;
        lstrength=mstrength;
        ldefense=mdefense;
       lmagic_defense=mmagic_defense;
lpoison_defense=mpoison_defense;
 lcurse_defense=mcurse_defense;
lenergy=menergy;
        
      out.println("You have found monster called "+monstername+" from the race "+monsterrace);
      out.println(mdescription);
      out.println("What are you willing to do");
while((line = in.readLine()) != null && !line.equals(".")) {
    userinfo.userinfo(userid);
    ustrength=userinfo.ustrength;
    udefense=userinfo.udefense;
    
    if (line.equals("try to flee")){
        out.println("You are trying to flee...");
        
    }else if
            (line.equals("attack")){
  out.println("You are trying to attak the monster");
  this.attack();
       }

else if(line.equals("try to rob monster")){
 out.println("You are trying to rob the monster");
       }
else{
    
    out.println("Sorry, i didn't understand your comment");
}

}//End While
}//End Method
    void attack(){
        
        
        
    }
}