public class nonalimentare extends prodotto {
  String mate;
  public nonalimentare(String a, int b, int c, String d)
  {
    super(a,b,c);
    mate = d;
  }

  public void nome()
  {
    System.out.println("Il prodotto inserito");
    System.out.println(nm);
    System.out.println(code);
    System.out.println(pr);
    System.out.println(mate);
  }

}