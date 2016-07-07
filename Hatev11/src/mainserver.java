
import java.io.*;
import java.net.*;
import java.security.*;

/**
 * Title: mainserver Description: This is the mainserver for the telnet MUD
 *
 * Copyright: Copyright (c) 2016 Company: javaport.io
 *
 * @author Andreas Knaup
 * @version 1.0
 */
public class mainserver {

    private static int port = 22245, maxConnections = 0;
    // Listen for incoming connections and handle them

    public static void main(String[] args) {
        int i = 0;

        try {
            ServerSocket listener = new ServerSocket(port);
            Socket server;

            while ((i++ < maxConnections) || (maxConnections == 0)) {
                doComms connection;

                server = listener.accept();
                doComms conn_c = new doComms(server);
                Thread t = new Thread(conn_c);
                t.start();
            }
        } catch (IOException ioe) {
            System.out.println("IOException on socket listen: " + ioe);
            ioe.printStackTrace();
        }
    }

}

class doComms implements Runnable {

    private Socket server;
    private String line, input;
    private String username;
    private String password;
    public int posx;
    public int posy;
    public int userid;
    public int wpid;
    public String[][] localmatrix = new String[100][100];

    doComms(Socket server) {
        this.server = server;
    }

    public void run() {

        line = "";

        try {
            // Get input from the client
            DataInputStream in = new DataInputStream(server.getInputStream());
            PrintStream out = new PrintStream(server.getOutputStream());
            /*
        Welcome Message
             */
            sqlhandler sqlstuff = new sqlhandler(out);
            actions meins = new actions(out, in);
            foundmonster foundmonster = new foundmonster(out, in);
            sqlstuff.messages("logo");
            { //CHECK login
                while (sqlstuff.logged != 1) {
                    out.println("Please enter username:\r\n");
                    while ((line = in.readLine()) != null && !line.equals("exit")) {
                        username = line;
                        out.println("I got:" + line);
                        break;
                    }
                    out.println("Please enter password:\r\n");
                    // Now write to the client
                    while ((line = in.readLine()) != null && !line.equals("exit")) {
                        password = line;
                        break;
                    }

                    sqlstuff.login(username, password);
                    posx = sqlstuff.posx;
                    posy = sqlstuff.posy;
                    userid = sqlstuff.userid;
                    wpid = sqlstuff.wpid;
                    sqlstuff.messages("afterlogin");
                    out.println("Positon x: " + posx + " y: " + posy);
                }

            }//ENDE CHECK LOGIN
            //THIS IS THE MAIN INPUT LOOP!
            ///////////
            /////////
            //////////
            while ((line = in.readLine()) != null && !line.equals(".")) {

                out.println("I got:" + line);
                //Get private message
                sqlstuff.pmessages(userid);
                //

                //Get User position
                sqlstuff.getpos(userid);
                posx = sqlstuff.posx;
                posy = sqlstuff.posy;
                out.println("Positon y: " + posx + " x: " + posy);
                ////
                ////
                //   meineklasse meins =new meineklasse();
                //   meins.tuwas(line);
                ////
                ////
                if (line.equals("go west")) {
                    if (posx != 0) {
                        posx = posx - 1;

                        sqlstuff.update(userid, "n");

                    }
                }
                if (line.equals("go east")) {
                    if (posx != 100) {
                        posx = posx + 1;

                        sqlstuff.update(userid, "s");

                    }
                }
                if (line.equals("go north")) {
                    if (posy != 0) {
                        posy = posy - 1;

                        sqlstuff.update(userid, "w");

                    }
                }
                if (line.equals("go south")) {
                    if (posy != 100) {
                        posy = posy + 1;

                        sqlstuff.update(userid, "e");

                    }
                }
////

                sqlstuff.getpos(userid);
                posx = sqlstuff.posx;
                posy = sqlstuff.posy;
                out.println("Positon y: " + posx + " x: " + posy);
                //Check User
                int confront;
                confront = sqlstuff.checkuser(posx, posy);
                System.out.println("confront: " + confront);
                if (confront == 1) {
                    meins.userconfront(line, sqlstuff.guserid, sqlstuff.gusername);
                    confront = 0;

                }
                //Check Monster
                int mconfront;
                mconfront = sqlstuff.checkmonster(posx, posy);
                System.out.println("mconfront: " + mconfront);
                if (mconfront == 1) {

                    foundmonster.monstertask(userid, sqlstuff.monsterid, sqlstuff.monstername, sqlstuff.monsterrace, sqlstuff.mdescription, sqlstuff.mgold, sqlstuff.mdefense,sqlstuff.mstrength,
                            sqlstuff.menergy,sqlstuff.mmagic_defense,sqlstuff.mpoison_defense,sqlstuff.mcurse_defense);
                    mconfront = 0;
                }

/////
                matrix matrixx = new matrix();
                matrixx.method();
                String field;
                field = matrixx.matrix[posx][posy];
                System.out.println(matrixx.matrix[posx][posy]);
                System.out.println(posx + " CC " + posy);
                String fieldname = "";
                if (field.equals("F")) {
                    fieldname = "Forrest";
                }
                if (field.equals("W")) {
                    fieldname = "Sea";
                }
                if (field.equals("D")) {
                    fieldname = "Dessert";
                }
                if (field.equals("H")) {
                    fieldname = "Hell";
                }
                if (field.equals("S")) {
                    fieldname = "Snow landscape";
                }

                out.println("Landscape: " + fieldname);

/////
                if (line.equals("show map")) {

                    matrix matrix = new matrix();
                    matrix.method();

                    for (int i = 0; i < 100; i++) {
                        for (int j = 0; j < 100; j++) {

                            localmatrix[i][j] = matrix.matrix[i][j];
                            //out.print(matrix.matrix[i][j]);
                        }

                        //out.println();
                    }

                    localmatrix[posx][posy] = "X";
                    //System.out.println("hubb"+localmatrix[sql.position[1]][sql.position[2]]);
                    int min = posx - 10;
                    if (min < 0) {
                        min = 0;
                    }
                    if (min > 100) {
                        min = 100;
                    }
                    int max = posy - 10;
                    if (max < 0) {
                        max = 0;
                    }
                    if (max > 100) {
                        max = 100;
                    }
                    int minx = posx + 10;
                    if (minx < 0) {
                        minx = 0;
                    }
                    if (minx > 100) {
                        minx = 100;
                    }
                    int maxx = posy + 10;
                    if (maxx < 0) {
                        maxx = 0;
                    }
                    if (maxx > 100) {
                        maxx = 100;
                    }
                    System.out.println(min + " " + minx + " " + max + " " + maxx);
                    for (int i = min; i < minx; i++) {
                        for (int j = max; j < maxx; j++) {

                            if (localmatrix[i][j] != "X") {
                                out.print(localmatrix[i][j]);

                            } else {
                                System.out.println("HHHHHHHH");
                                out.print((char) 27 + "[31m" + localmatrix[i][j] + "" + (char) 27 + "[0m");
                            }
                        }

                        out.print("\r\n");
                    }

                }

            }

            server.close();
        } catch (IOException ioe) {
            System.out.println("IOException on socket listen: " + ioe);
            ioe.printStackTrace();
        }
    }
}
