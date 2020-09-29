//Classe que raliza a transormação do circuito de resistores em estrela para triângulo
public class Circuito3_Ydelta {
private double resA;
private double resB;
private double resC;
  //Construtor do método de para a tansformação
  public Circuito3_Ydelta(double resA, double resB, double resC) {
  this.resA = resA;
  this.resB = resB;
  this.resC = resC;
  }
  //Getters and Setters
  public double getResA() {
  return resA;
  }
  public void setResA(double resA) {
  this.resA = resA;
  }
  public double getResB() {
  return resB;
  }
  public void setResB(double resB) {
  this.resB = resB;
  }
  public double getResC() {
  return resC;
  }
  public void setResC(double resC) {
  this.resC = resC;
  }
  //Método que calcula o resistor R1
  public double calculoR1(){
  return((resB*resC)/(resA+resB+resC));
  }
  //Método que calcula o resistor R2
  public double calculoR2(){
  return((resA*resC)/(resA+resB+resC));
  }
  //Método que calcula o resistor R3
  public double calculoR3(){
  return((resA*resB)/(resA+resB+resC));
  }
}
