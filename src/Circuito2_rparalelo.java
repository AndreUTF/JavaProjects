//Clase que realiza os cálculos de dois resistores em paralelo
public class Circuito2_rparalelo extends Circuito1_rserie{
private int tensao;
  //Método construtor que herda do circuito1
  public Circuito2_rparalelo(double resistor1, double resistor2, double tensaof , int tensao) {
  super(resistor1, resistor2, tensaof);
  this.tensao = tensao;
  }
  //Getter and Setter
  public int getTensao() {
  return tensao;
  }
  public void setTensao(int tensao) {
  this.tensao = tensao;
  } 
  //Método que calcula a resistência equivalente dos resistores
  @Override
  public double Resistenciaequivalente(){
  return((resistor1*resistor2)/(resistor1+resistor2));
  }
  //Método que calcula o corrente da resitência equivalente
  @Override
  public double Calculocorrenteprincipal(){
  return((double)tensao/(Resistenciaequivalente()));
  }
  //Método que calcula a corrente elétrica do primeiro resistor
  public double Calculocorrenteresistor1(){
  return((tensaof)/(resistor1));
  }
  //Método que calcula a corrente elétrica do segundo resistor
  public double Calculocorrenteresistor2(){
  return((tensaof)/(resistor2));
  }
  //Método que calcula a potência da resistência elétrica do primeiro resistor
  @Override
  public double Calculopotenciaresistor1(){
  return(Calculotensaoresistor1()*Calculocorrenteresistor1());
  }
  //Método que calcula a potência da segunda resistência
  @Override
  public double Calculopotenciaresistor2(){
  return(Calculotensaoresistor2()*Calculocorrenteresistor2());
  }
  //Método que calcula a potência da resisência equivalente
  @Override
  public double Calculopotenciatotal(){
  return(Calculocorrenteprincipal()*tensaof);
  }
}