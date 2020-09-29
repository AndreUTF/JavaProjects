package Final;

import java.util.ArrayList;
public class Componente {
private double valor;
private ArrayList<String> tipo;
  public Componente(double valor) {
  this.valor = valor;
  this.tipo = new ArrayList();
  }
  public double getValor() {
  return valor;
  }
  public void setValor(double valor) {
  this.valor = valor;
  }
  public ArrayList<String> getTipo() {
  return tipo;
  }
  public void setTipo(ArrayList<String> tipo) {
  this.tipo = tipo;
  }
  //Usar ArrayList
  public String Unidade(int n){
  tipo.add("Ohm");
  tipo.add("Farad");
  tipo.add("Henry");
  return tipo.get(n);
  }
  @Override
  public String toString() {
  return "Componente{" + "\nValor=" + valor + "\nTipo=" + tipo + '}';
  } 
}
