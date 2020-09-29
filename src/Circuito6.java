import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
public class Circuito6 {
private ArrayList<Resistor> resistores;
private ArrayList<Capacitor> capacitores;
private ArrayList<Indutor> indutores;
private ArrayList<Fonte> fontes;
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
  public Circuito6() {
  this.resistores = new ArrayList();
  this.capacitores = new ArrayList();
  this.indutores = new ArrayList();
  this.fontes = new ArrayList();
  }
  public double calculoInpedanciaindutor(){
  return (2*3.14*getIndutores().get(0).getValor()*getFontes().get(0).getFrequencia());
  }
  public double calculoInpedanciacapacitor(){
  return -((1)/(2*3.14*getCapacitores().get(0).getValor()*getFontes().get(0).getFrequencia()));
  }
  public double calculoCorrentemodulo(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,0.0,calculoInpedanciacapacitor(),
  calculoInpedanciaindutor());
  double modulo = (getFontes().get(0).getValor())/(c6.Cpolarmodulo());
  return(modulo);  
  }
  public double calculoCorrenteangulo(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,0.0,calculoInpedanciacapacitor(),
  calculoInpedanciaindutor());
  double angulo = (0-c6.Soma3polarangulo());
  if(angulo<0.0){
  return(-Math.toDegrees(angulo));
  }
  else{
  return(Math.toDegrees(angulo));
  }  
  }
  public double calculoTensaoresmod(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,0.0,calculoInpedanciacapacitor(),
  calculoInpedanciaindutor());
  double modulo = getResistores().get(0).getValor()*calculoCorrentemodulo();
  return (modulo);
  }
  public double calculoTensaoresangulo(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,0.0,calculoInpedanciacapacitor(),
  calculoInpedanciaindutor());
  double angulo = (0+calculoCorrenteangulo());
  return(angulo);
  }
  public double calculoTensaoindmod(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,0.0,calculoInpedanciacapacitor(),
  calculoInpedanciaindutor());
  double modulo = (calculoInpedanciaindutor())*calculoCorrentemodulo();
  return (modulo);
  }
  public double calculoTensaoindangulo(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,0.0,calculoInpedanciacapacitor(),
  calculoInpedanciaindutor());
  double angulo = (90+calculoCorrenteangulo());
  return(angulo);
  }
  public double calculoTensaocapmod(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,0.0,calculoInpedanciacapacitor(),
  calculoInpedanciaindutor());
  double modulo = (1/(6.28*getCapacitores().get(0).getValor()*getFontes().get(0).getFrequencia()))*calculoCorrentemodulo();
  return (modulo);
  }
  public double calculoTensaocapangulo(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,0.0,calculoInpedanciacapacitor(),
  calculoInpedanciaindutor());
  double angulo = (-90+calculoCorrenteangulo());
  return(angulo);
  }
  public double calculoFp(){
  Complexosr c6 = new Complexosr(getResistores().get(0).getValor(),0.0,0.0,0.0,calculoInpedanciacapacitor(),
  calculoInpedanciaindutor());
  return(Math.cos(c6.Soma3polarangulo()));
  }
  public double mostraValor(double valor, int casasdecimais){
  DecimalFormat f = new DecimalFormat("###,###,##0.000000000");
  f.setRoundingMode(RoundingMode.DOWN);
  f.setMinimumFractionDigits(casasdecimais);
  return(Double.parseDouble(f.format(valor)));
  }
}
