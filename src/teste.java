public class teste {
  public static void main(String[] args) {
  Resistor j = new Resistor(0.25,100.0);
  Indutor i = new Indutor(5.0,0.001);
  Capacitor c = new Capacitor(35,0.00004);
  System.out.printf("%s",j.toString());
  System.out.printf("%s",i.toString());
  System.out.printf("%s",c.toString());
  }   
}
