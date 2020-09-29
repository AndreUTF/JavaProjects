public class Capacitor extends Componente{
private int tensao;
  public Capacitor(int tensao, double valor) {
  super(valor);
  this.tensao = tensao;
  }
  public int getTensao() {
  return tensao;
  }
  public void setTensao(int tensao) {
  this.tensao = tensao;
  }
  @Override
  public String toString() {
  return "Capacitor{" + "\nValor: " + getValor() + "\nTipo: " + Unidade(1) + "\nTensao: " + getTensao() + "V\n" + '}';
  }
}