import java.util.ArrayList;
public class Circuito8 {
private ArrayList<Fonte> fontes;
private ArrayList<Resistor> resistores;
private ArrayList<Capacitor> capacitores;
  public ArrayList<Fonte> getFontes() {
  return fontes;
  }
  public void setFontes(ArrayList<Fonte> fontes) {
  this.fontes = fontes;
  }
  public ArrayList<Resistor> getResistores() {
  return resistores;
  }
  public void setResistores(ArrayList<Resistor> resistores) {
  this.resistores = resistores;
  }
  public ArrayList<Capacitor> getCapacitores() {
  return capacitores;
  }
  public void setCapacitores(ArrayList<Capacitor> capacitores) {
  this.capacitores = capacitores;
  }
  public Circuito8() {
  this.fontes =  new ArrayList();
  this.resistores = new ArrayList();
  this.capacitores = new ArrayList();
  }
  public double calculoInpedanciacapacitor(){
  return (1/(6.28*getFontes().get(0).getFrequencia())*getCapacitores().get(0).getValor());
  }
  public double correntePrincipalmodulo(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,calculoInpedanciacapacitor());
  double modulo;
  modulo = (getFontes().get(0).getValor()/(c6.Somapolar2mod()));
  return(modulo);
  }
  public double calculoCorrenteangulo(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,calculoInpedanciacapacitor());
  double angulo = (0-c6.Somapolar2angulo());
  if(angulo<0.0){
  return(-Math.toDegrees(angulo));
  }
  else{
  return(Math.toDegrees(angulo));
  }  
  }
  public double tensaoresmod(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,calculoInpedanciacapacitor());
  return(correntePrincipalmodulo()*getResistores().get(0).getValor());
  }
  public double tensaoresangulo(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,calculoInpedanciacapacitor());
  return(correntePrincipalmodulo()+0.0);
  }
  public double tensaoindmod(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,calculoInpedanciacapacitor());
  return(correntePrincipalmodulo()*calculoInpedanciacapacitor());
  }
  public double tensaoindangulo(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,calculoInpedanciacapacitor());
  return(calculoCorrenteangulo()+90);
  }
  public double calculofp(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,calculoInpedanciacapacitor());
  double angulo = Math.cos(c6.Somapolar2angulo());
  return(angulo);
  }
}
