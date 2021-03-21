import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    File na = new File("nonalimentare.txt");
    Scanner sfn = new Scanner(na);
    File a = new File("alimentare.txt");
    Scanner sfa = new Scanner(a);
    String nm;
    String change;
    String prov;
    String categ;
    String mate;
    int pr, code;
    int prog = 99;
    while (prog!=0){
      System.out.print("Scegli il tipo di oggetto: \n");
      System.out.print("1. Alimentare 2. Generico ");
      prog = s.nextInt();
      if (prog==1){
        System.out.print("Hai scelto Alimentare\n");
        System.out.print("Inserisci nome del prodotto: ");
        nm = s.nextLine();
        System.out.print("Inserisci codice del prodotto: ");
        code = s.nextInt();
        s.netxLine();
        System.out.print("Inserisci prezzo del prodotto: ");
        pr = s.nextInt();
        System.out.print("Inserisci materiale del prodotto: ");
        mate = s.nextLine();
        alimentare x = new alimentare(nm, code, pr, prov, categ);
        x.nome();
      }
      else if(prog==2){
        System.out.print("Hai scelto non Alimentare\n");
        System.out.print("Inserisci nome del prodotto: ");
        nm = s.nextLine();
        System.out.print("Inserisci codice del prodotto: ");
        code = s.nextInt();
        System.out.print("Inserisci prezzo del prodotto: ");
        pr = s.nextInt();
        System.out.print("Inserisci provenienza del prodotto: ");
        prov = s.nextLine();
        System.out.print("Inserisci categoria del prodotto: ");
        categ = s.nextLine();
        alimentare x = new alimentare(nm, code, pr, prov, categ);
        x.nome();
        System.out.print("Inserisci nome del prodotto: ");
        nm = s.nextLine();
        System.out.print("Inserisci codice del prodotto: ");
        code = s.nextInt();
        System.out.print("Inserisci prezzo del prodotto: ");
        pr = s.nextInt();
        System.out.print("Inserisci provenienza del prodotto: ");
        prov = s.nextLine();
        System.out.print("Inserisci categoria del prodotto: ");
        categ = s.nextLine();
        alimentare y = new alimentare(nm, code, pr, prov, categ);
        y.nome();
      }
      else if(prog==3){
        while (sfa.hasNextLine()) { // Lettura del file
        var str = sfile.nextLine();
        var res = str.split(",");
        nm = res[0];
        change = res[1];
        int pr = Integer.parseInt(change);
        change = res[2];
        int code = Integer.parseInt(change);
        prov = res[3];
        categ = res[4];
        System.out.println("Nome: " + nm + " Prezzo: " + pr + " Codice: " + code + " Provenienza: " + prov + "Categoria: " + categ + "/n");
      }
      }
      else if(prog==4){
        while (sfa.hasNextLine()) { // Lettura del file
        var str = sfile.nextLine();
        var res = str.split(",");
        nm = res[0];
        change = res[1];
        int pr = Integer.parseInt(change);
        change = res[2];
        int code = Integer.parseInt(change);
        mate = res[3];
        System.out.println("Nome: " + nm + " Prezzo: " + pr + " Codice: " + code + " Material: " + mate + "/n");
      }}
      else if(prog==0){
        System.out.print("Arrivederci\n");
        break;
      }
      else{
        System.out.print("ERRORE\n");
      }
    }

  }
}