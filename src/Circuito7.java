import java.util.ArrayList;
public class Circuito7 {
private ArrayList<Indutor> indutores;
private ArrayList<Fonte> fontes;
private ArrayList<Resistor> resistores;
  public ArrayList<Indutor> getIndutores() {
  return indutores;
  }
  public void setIndutores(ArrayList<Indutor> indutores) {
  this.indutores = indutores;
  }
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
  public Circuito7(){
  this.indutores = new ArrayList();
  this.fontes = new ArrayList();
  this.resistores = new ArrayList();
  }
  public double calculoInpedanciaindutor(){
  return (2*3.14*getIndutores().get(0).getValor()*getFontes().get(0).getFrequencia());
  }
  public double correntePrincipalmodulo(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,calculoInpedanciaindutor());
  double modulo;
  modulo = (getFontes().get(0).getValor()/(c6.Somapolar2mod()));
  return(modulo);
  }
  public double calculoCorrenteangulo(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,calculoInpedanciaindutor());
  double angulo = (0-c6.Somapolar2angulo());
  if(angulo<0.0){
  return(-Math.toDegrees(angulo));
  }
  else{
  return(Math.toDegrees(angulo));
  }  
  }
  public double tensaoresmod(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,calculoInpedanciaindutor());
  return(correntePrincipalmodulo()*getResistores().get(0).getValor());
  }
  public double tensaoresangulo(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,calculoInpedanciaindutor());
  return(correntePrincipalmodulo()+0.0);
  }
  public double tensaoindmod(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,calculoInpedanciaindutor());
  return(correntePrincipalmodulo()*calculoInpedanciaindutor());
  }
  public double tensaoindangulo(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,calculoInpedanciaindutor());
  return(calculoCorrenteangulo()+90);
  }
  public double calculofp(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,calculoInpedanciaindutor());
  double angulo = Math.cos(c6.Somapolar2angulo());
  return(angulo);
  }
}