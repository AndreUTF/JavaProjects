import java.util.ArrayList;
public class Circuito1{
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
  public Circuito1() {
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
  System.out.printf("Tensão resistor 1: %.5f\n",tensao1());
  System.out.printf("Tensão resistor 2: %.5f\n",tensao2());
  System.out.printf("Potencia resistor 1: %.5f\n",potencia1());
  System.out.printf("Potencia resistor 2: %.5f\n",potencia2());
  System.out.printf("Verificação resistor 1: %s\n",verifica1());
  System.out.printf("Verificação resistor 2: %s\n",verifica2());
  }
  else{
  System.out.printf("Corrente da fonte: %.5f \n",f.get(0).getValor());
  System.out.printf("Resistencia equivalente: %.5f\n",equivalente());
  System.out.printf("Tensão total: %.5f\n",tensaototal());
  System.out.printf("Tensão resistor 1: %.5f\n",tensaor1());
  System.out.printf("Tensão resistor 2: %.5f\n",tensaor2());
  System.out.printf("Potencia resistor 1: %.5f\n",potenciar1());
  System.out.printf("Potencia resistor 2: %.5f\n",potenciar2());
  System.out.printf("Verificação resistor 1: %s\n",verificar1());
  System.out.printf("Verificação resistor 2: %s\n",verificar2());
  }
  }
  public double equivalente(){
  return(r.get(0).getValor()+r.get(1).getValor());
  }
  public double corrente(){
  return(f.get(0).getValor())/((r.get(0).getValor())+r.get(1).getValor());
  }
  public double tensao1(){
  return(corrente()*r.get(0).getValor());
  }
  public double tensao2(){
  return(corrente()*r.get(1).getValor());
  }
  public double potencia1(){
  return(corrente()*tensao1());
  }
  public double potencia2(){
  return(corrente()*tensao2());
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
  public double tensaor1(){
  return(f.get(0).getValor()*r.get(0).getValor());
  }
  public double tensaor2(){
  return(f.get(0).getValor()*r.get(1).getValor());
  }
  public double potenciar1(){
  return(Math.pow(f.get(0).getValor(),2)*r.get(0).getValor());
  }
  public double potenciar2(){
  return(Math.pow(f.get(0).getValor(),2)*r.get(1).getValor());
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