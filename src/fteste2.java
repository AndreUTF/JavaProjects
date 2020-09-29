public class fteste2 {
  public static void main(String[] args) {
  Circuito1_rserie c1 = new Circuito1_rserie(100.0,100.0,10.0);
  Circuito2_rparalelo c2 = new Circuito2_rparalelo(100.0,100.0,10.0,10);
  System.out.printf("Req = %.5f.\n",c1.Resistenciaequivalente());
  System.out.printf("Ip = %.5f.\n",c1.Calculocorrenteprincipal());
  System.out.printf("V1 = %.5f.\n",c1.Calculotensaoresistor1());
  System.out.printf("V2 = %.5f.\n",c1.Calculotensaoresistor2());
  System.out.printf("Pt = %.5f.\n",c1.Calculopotenciatotal());
  System.out.printf("P1 = %.5f.\n",c1.Calculopotenciaresistor1());
  System.out.printf("P1 = %.5f.\n",c1.Calculopotenciaresistor2());
  System.out.println();
  System.out.printf("Req = %.5f.\n",c2.Resistenciaequivalente());
  System.out.printf("Ip = %.5f.\n",c2.Calculocorrenteprincipal());
  System.out.printf("I1 = %.5f.\n",c2.Calculocorrenteresistor1());
  System.out.printf("I2 = %.5f.\n",c2.Calculocorrenteresistor2());
  System.out.printf("Pt = %.5f.\n",c2.Calculopotenciatotal());
  System.out.printf("P1 = %.5f.\n",c2.Calculopotenciaresistor1());
  System.out.printf("P2 = %.5f.\n",c2.Calculopotenciaresistor2());
  }  
}
