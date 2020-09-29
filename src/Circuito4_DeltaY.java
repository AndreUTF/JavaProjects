//Classe que raliza a transormação do circuito de resistores em triângulo para delta
public class Circuito4_DeltaY {
private double res1;
private double res2;
private double res3;
  //Método construtor da transformação
  public Circuito4_DeltaY(double res1, double res2, double res3) {
  this.res1 = res1;
  this.res2 = res2;
  this.res3 = res3;
  }
  //Getters and Setters
  public double getRes1() {
  return res1;
  }
  public void setRes1(double res1) {
  this.res1 = res1;
  }
  public double getRes2() {
  return res2;
  }
  public void setRes2(double res2) {
  this.res2 = res2;
  }
  public double getRes3() {
  return res3;
  }
  public void setRes3(double res3) {
  this.res3 = res3;
  }
  //Método que calcula o resistor A
  public double ResA(){
  return((res1*res2+res2*res3+res1*res3)/(res1));
  }
  //Método que calcula o resistor B
  public double ResB(){
  return((res1*res2+res2*res3+res1*res3)/(res2));
  }
  //Método que calcula o resistor C
  public double ResC(){
  return((res1*res2+res2*res3+res1*res3)/(res3));
  }
}
