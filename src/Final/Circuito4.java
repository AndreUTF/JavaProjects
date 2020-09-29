package Final;

import java.util.ArrayList;
public class Circuito4 {
private ArrayList<Resistor> r;
  public ArrayList<Resistor> getR() {
  return r;
  }
  public void setR(ArrayList<Resistor> r) {
  this.r = r;
  }
  public Circuito4() {
  this.r = new ArrayList<>();
  }
  public double ResA(){
  return((r.get(0).getValor()+r.get(1).getValor()+r.get(2).getValor())/(r.get(0).getValor()));
  }
  public double ResB(){
  return((r.get(0).getValor()+r.get(1).getValor()+r.get(2).getValor())/(r.get(1).getValor()));
  }
  public double ResC(){
  return((r.get(0).getValor()+r.get(1).getValor()+r.get(2).getValor())/(r.get(2).getValor()));
  }
}
