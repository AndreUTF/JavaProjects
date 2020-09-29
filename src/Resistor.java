public class Resistor extends Componente{
private double potencia;
  public Resistor(double potencia, double valor) {
  super(valor);
  this.potencia = potencia;
  }
  public double getPotencia() {
  return potencia;
  }
  public void setPotencia(double potencia) {
  this.potencia = potencia;
  }
  @Override
  public String toString() {
  return "Resistor{" + "\nValor: " + getValor() + "\nTipo: " + Unidade(0) + "\nPotencia:" + getPotencia() 
          + "W" + "\n" + '}';
  }
}