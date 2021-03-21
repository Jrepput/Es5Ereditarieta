import java.util.Scanner;
import java.io.*;

public class alimentare extends prodotto {
  String prov, categ;
  public alimentare(String a, int b, int c, String d, String e)
  {
    super(a,b,c);
    prov = d;
    categ = e;
    File f = new File("alimentare.txt");
    Scanner sfile = new Scanner(f);
    PrintWriter fw = new PrintWriter(f);
  }

  public void nome()
  {
    fw.write( nm+","+code+","+pr+","+prov+","+categ+",");
    var str = sfile.nextLine();
  }

}