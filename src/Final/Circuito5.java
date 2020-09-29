package Final;

import java.util.ArrayList;
public class Circuito5 {
private ArrayList<Resistor> r;
private ArrayList<Fonte> f;
  public ArrayList<Resistor> getR() {
  return r;
  }
  public void setR(ArrayList<Resistor> r) {
  this.r = r;
  }
  public ArrayList<Fonte> getF() {
  return f;
  }
  public void setF(ArrayList<Fonte> f) {
  this.f = f;
  }
  public Circuito5() {
  this.r = new ArrayList<>();
  this.f = new ArrayList<>();
  }
  public void parametros(Resistor r1, Resistor r2, Fonte f1){
  r.add(r1);
  r.add(r2);
  f.add(f1);
  }
  public void parametros1(Resistor r1, Resistor r2, Resistor r3, Resistor rf, Fonte f1, Fonte f2, Fonte f3){
  r.add(r1);
  r.add(r2);
  r.add(r3);
  r.add(rf);
  f.add(f1);
  f.add(f2);
  f.add(f3);
  }
  public double naoInversor(){
  return(-(r.get(1).getValor()/r.get(0).getValor())*f.get(0).getValor());
  }
  public double Inversor(){
  return(1+(r.get(1).getValor()/r.get(0).getValor()))-f.get(0).getValor();
  }
  public double somadorInversor(){
  return -(((r.get(0).getValor()/r.get(3).getValor())*f.get(0).getValor())+((r.get(1).getValor()/r.get(3).getValor())*f.get(1).getValor())+((r.get(2).getValor()/r.get(3).getValor())*f.get(2).getValor()));
  }
}
