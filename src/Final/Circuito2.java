package Final;

import java.util.ArrayList;
public class Circuito2 {
private ArrayList<Resistor> r;
private ArrayList<Fonte> f;
  public ArrayList<Resistor> getR() {
  return r;
  }
  public void setR(ArrayList<Resistor> r) {
  this.r = r;
  }
  public ArrayList<Fonte> getF() {
  return f;
  }
  public void setF(ArrayList<Fonte> f) {
  this.f = f;
  }
  public Circuito2() {
  this.r = new ArrayList<>();
  this.f = new ArrayList<>();
  }
  public void parametros(Resistor r1, Resistor r2, Fonte f1){
  r.add(r1);
  r.add(r2);
  f.add(f1);
  }
  public void verificaModo(String n1, String n2){
  if(("V".equals(n2))&&("DC".equals(n1))){
  System.out.printf("Tensão da fonte: %.5f\n",f.get(0).getValor());
  System.out.printf("Resistencia equivalente: %.5f\n",equivalente());
  System.out.printf("Corrente: %.5f\n",corrente());
  System.out.printf("Corrente resistor 1: %.5f\n",corrente1());
  System.out.printf("Corente resistor 2: %.5f\n",corrente2());
  System.out.printf("Potencia resistor 1: %.5f\n",potencia1());
  System.out.printf("Potencia resistor 2: %.5f\n",potencia2());
  System.out.printf("Verificação resistor 1: %s\n",verifica1());
  System.out.printf("Verificação resistor 2: %s\n",verifica2());
  }
  else{
  System.out.printf("Corrente da fonte: %.5f \n",f.get(0).getValor());
  System.out.printf("Resistencia equivalente: %.5f\n",equivalente());
  System.out.printf("Tensão total: %.5f\n",corrente());
  System.out.printf("Corrente resistor 1: %.5f\n",correnter1());
  System.out.printf("Corrente resistor 2: %.5f\n",correnter2());
  System.out.printf("Potencia resistor 1: %.5f\n",potenciar1());
  System.out.printf("Potencia resistor 2: %.5f\n",potenciar2());
  System.out.printf("Verificação resistor 1: %s\n",verificar1());
  System.out.printf("Verificação resistor 2: %s\n",verificar2());
  }
  }
  public double equivalente(){
  return((r.get(0).getValor()*r.get(1).getValor())/(r.get(0).getValor()+r.get(1).getValor()));
  }
  public double corrente(){
  return(f.get(0).getValor())/((equivalente()));
  }
  public double corrente1(){
  return(f.get(0).getValor()/r.get(0).getValor());
  }
  public double corrente2(){
  return(f.get(0).getValor()/r.get(1).getValor());
  }
  public double potencia1(){
  return(Math.pow(corrente1(),2)*r.get(0).getValor());
  }
  public double potencia2(){
  return(Math.pow(corrente1(),2)*r.get(1).getValor());
  }
  public String verifica1(){
  if(r.get(0).getPotencia()>=potencia1()){
  return("Potencia do resistor 1 é abaixo da indicada.\n");
  }
  else{
  return("Potencia do resistor 1 é acima da indicada.\n");
  }
  }
  public String verifica2(){
  if(r.get(1).getPotencia()>=potencia2()){
  return("Potencia do resistor 2 é abaixo da indicada.\n");
  }
  else{
  return("Potencia do resistor 2 é acima da indicada.\n");
  }
  }
  public double tensaototal(){
  return(f.get(0).getValor()*equivalente());
  }
  public double correnter1(){
  return(tensaototal()/r.get(0).getValor());
  }
  public double correnter2(){
  return(tensaototal()/r.get(1).getValor());
  }
  public double potenciar1(){
  return(r.get(0).getValor()*Math.pow(correnter1(),2));
  }
  public double potenciar2(){
  return(r.get(1).getValor()*Math.pow(correnter1(),2));
  }
  public String verificar1(){
  if(r.get(0).getPotencia()>=potenciar1()){
  return("Potencia do resistor 1 é abaixo da indicada.\n");
  }
  else{
  return("Potencia do resistor 1 é acima da indicada.\n");
  }
  }
  public String verificar2(){
  if(r.get(1).getPotencia()>=potenciar2()){
  return("Potencia do resistor 1 é abaixo da indicada.\n");
  }
  else{
  return("Potencia do resistor 1 é acima da indicada.\n");
  }
  }
}