public class prodotto {
  String nm;
  int pr, code;
  public prodotto(String a, int b, int c)
  {
    nm=a;
    code=b;
    pr=c;
  }

  public void nome()
  {
    System.out.println(nm);
  }
}