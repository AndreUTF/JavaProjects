package Final;

public class Indutor extends Componente{
private double corrente;
  public Indutor(double corrente, double valor) {
  super(valor);
  this.corrente = corrente;
  }
  public double getCorrente() {
  return corrente;
  }
  public void setCorrente(double corrente) {
  this.corrente = corrente;
  }
  @Override
  public String toString() {
  return "Capacitor{" + "\nValor: " + getValor() + "\nTipo: " + Unidade(2) + "\nCorrente: " 
          + getCorrente() + "A\n" + '}';
  }
}
