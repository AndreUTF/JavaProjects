package Final;

import java.util.ArrayList;
public class Circuito3 {
private ArrayList<Resistor> r;
  public ArrayList<Resistor> getR() {
  return r;
  }
  public void setR(ArrayList<Resistor> r) {
  this.r = r;
  }  
  public Circuito3() {
  this.r = new ArrayList<>();
  }
  public void parametros(Resistor r1, Resistor r2, Resistor r3){
  r.add(r1);
  r.add(r2);
  r.add(r3);
  }
  public double calculoR1(){
  return((r.get(1).getValor()*r.get(2).getValor())/(r.get(0).getValor()+r.get(1).getValor()+r.get(2).getValor()));
  }
  public double calculoR2(){
  return((r.get(0).getValor()*r.get(2).getValor())/(r.get(0).getValor()+r.get(1).getValor()+r.get(2).getValor()));
  }
  public double calculoR3(){
  return((r.get(0).getValor()*r.get(1).getValor())/(r.get(0).getValor()+r.get(1).getValor()+r.get(2).getValor()));
  }
}
