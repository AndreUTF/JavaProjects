public class testecircuito6 {
  public static void main(String[] args) {
  Resistor r = new Resistor(5.0,1000.0);
  Capacitor c = new Capacitor(35,.00047);
  Indutor i = new Indutor(1.0,0.001);
  Fonte f = new Fonte(60.0,40.0);
  Circuito6 aq = new Circuito6();
  aq.getCapacitores().add(c);
  aq.getResistores().add(r);
  aq.getIndutores().add(i);
  aq.getFontes().add(f);
  System.out.printf("Inpedancia reativa = %f\n",aq.calculoInpedanciaindutor());
  System.out.printf("Inpedancia capacitiva = %f\n",aq.calculoInpedanciacapacitor());
  System.out.printf("Corrente = %.7f<%.7f\n",aq.calculoCorrentemodulo(),aq.calculoCorrenteangulo());
  System.out.printf("Tensao resistor = %f<%f\n",aq.calculoTensaoresmod(),aq.calculoTensaoresangulo());
  System.out.printf("Tensao capacitor = %f<%f\n",aq.calculoTensaocapmod(),aq.calculoTensaocapangulo());
  System.out.printf("Tensao indutor = %f<%f\n",aq.calculoTensaoindmod(),aq.calculoTensaoindangulo());
  System.out.printf("F.P = %f\n",aq.calculoFp());
  }  
}
