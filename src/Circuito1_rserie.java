//Classe realiza cálculos do circuito com dois resistores em série
public class Circuito1_rserie {
protected double resistor1;
protected double resistor2;
protected double tensaof;
  //Construtor que recebe os valores dos resistores e o módulo da fonte de tensão
  public Circuito1_rserie(double resistor1, double resistor2, double tensaof) {
  this.resistor1 = resistor1;
  this.resistor2 = resistor2;
  this.tensaof = tensaof;
  }
  //Getters and setters dos atributos da classe
  public double getResistor1() {
  return resistor1;
  }
  public void setResistor1(double resistor1) {
  this.resistor1 = resistor1;
  }
  public double getResistor2() {
  return resistor2;
  }
  public void setResistor2(double resistor2) {
  this.resistor2 = resistor2;
  }
  public double getTensaof() {
  return tensaof;
  }
  public void setTensaof(double tensaof) {
  this.tensaof = tensaof;
  }
  //Método que calcula a resistência equivalente
  public double Resistenciaequivalente(){
  return(resistor1+resistor2);
  }
  //Método que calcula a corrente elétrica da resistência equivalente
  public double Calculocorrenteprincipal(){
  return((tensaof)/Resistenciaequivalente());
  }
  //Método que calcula a corrente elétrica do primeiro resistor
  public double Calculotensaoresistor1(){
  return(((tensaof)/(Resistenciaequivalente())*resistor1));
  }
  //Método que calcula a corrente elétrica do segundo resistor
  public double Calculotensaoresistor2(){
  return(((tensaof)/(Resistenciaequivalente()))*resistor2);
  }
  //Método que calcula a potência da resistência elétrica do primeiro resistor
  public double Calculopotenciaresistor1(){
  return(Calculotensaoresistor1()*Calculocorrenteprincipal());
  }
  //Método que calcula a potência da segunda resistência
  public double Calculopotenciaresistor2(){
  return(Calculotensaoresistor2()*Calculocorrenteprincipal());
  }
  //Método que calcula a potência da resisência equivalente
  public double Calculopotenciatotal(){
  return(Resistenciaequivalente()*Calculocorrenteprincipal()*Calculocorrenteprincipal());
  }
}
