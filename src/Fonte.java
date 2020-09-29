import java.util.ArrayList;
public class Fonte extends Componente{
private ArrayList<String> modo;
private double frequencia;
  public double getFrequencia() {
  return frequencia;
  }
  public void setFrequencia(double frequencia) {
  this.frequencia = frequencia;
  }
  public Fonte(double frequencia, double valor) {
  super(valor);
  this.modo = new ArrayList();
  this.frequencia = frequencia;
  }
  public ArrayList<String> getModo() {
  return modo;
  }
  public void setModo(ArrayList<String> modo) {
  this.modo = modo;
  }
  public String mostrarModo(int n1){
  modo.add("DC");
  modo.add("AC");
  return(modo.get(n1));
  }
  public String mostraSimbolo(int n2){
  ArrayList<String> f = new ArrayList<>();
  f.add("V");
  f.add("A");
  return (f.get(n2));
  }
  public String toString(int j1,int j2) {
  return "Fonte{" + "\nValor: " + getValor() + "\nTipo: " + mostraSimbolo(j1) + "\nModo: " + modo.get(j2) + '}';
  }  
}
