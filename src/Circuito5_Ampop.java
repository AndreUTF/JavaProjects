//Classe que calcula a tensão de saída do amplificador operacional
public class Circuito5_Ampop {
private double vi;
private double Ri;
private double Rf;
  //Método construtor do amplificador operacional
  public Circuito5_Ampop(double vi, double Ri, double Rf) {
  this.vi = vi;
  this.Ri = Ri;
  this.Rf = Rf;
  }
  //Getter and Setter 
  public double getVi() {
  return vi;
  }
  public void setVi(double vi) {
  this.vi = vi;
  }
  public double getRi() {
  return Ri;
  }
  public void setRi(double Ri) {
  this.Ri = Ri;
  }
  public double getRf() {
  return Rf;
  }
  public void setRf(double Rf) {
  this.Rf = Rf;
  }
  //Método que realiza o cálculo da tensão de saída de um AmpOp na configuração inversor
  public double Ampopinversor(){
  return(-(Rf/Ri)*vi);  
  }
  //Método que realiza o cálculo da tensão de saída de um AmpOp na configuração não inversor
  public double Ampopnaoinversor(){
  return((1+(Rf/Ri))*vi);  
  }
}
