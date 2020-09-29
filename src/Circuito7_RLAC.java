public class Circuito7_RLAC {
private double res;
private double ind;
private double cap;
private double freq;
private double tensao;
  public Circuito7_RLAC(double res, double ind, double cap, double freq, double tensao) {
  this.res = res;
  this.ind = ind;
  this.cap = cap;
  this.freq = freq;
  this.tensao = tensao;
  }
  public double getRes() {
  return res;
  }
  public void setRes(double res) {
  this.res = res;
  }
  public double getInd() {
  return ind;
  }
  public void setInd(double ind) {
  this.ind = ind;
  }
  public double getCap() {
  return cap;
  }
  public void setCap(double cap) {
  this.cap = cap;
  }
  public double getFreq() {
  return freq;
  }
  public void setFreq(double freq) {
  this.freq = freq;
  }
  public double getTensao() {
  return tensao;
  }
  public void setTensao(double tensao) {
  this.tensao = tensao;
  }
  public double calculoInd(){
  return(6.28*freq*ind);
  }
  public double calculoCap(){
  return(-1/(6.28*freq*ind));
  }
  public double calculoCorrentemodulo(){
  Complexosr c2 = new Complexosr(res,0.0,0.0,0.0,(-1/(6.28*freq*cap)),(6.28*freq*ind));
  double modulo = (tensao/c2.Soma3polarmodulo());
  return(modulo);
  }
  public double calculoCorrenteangulo(){
  Complexosr c2 = new Complexosr(res,0.0,0.0,0.0,(-1/(6.28*freq*cap)),(6.28*freq*ind));
  double modulo = (tensao/c2.Soma3polarangulo());
  double angulo = (0-c2.Soma3polarangulo());
  return(angulo);
  }
  public double calculoTensaoresmod(){
  Complexosr c2 = new Complexosr(res,0.0,0.0,0.0,(-1/(6.28*freq*cap)),(6.28*freq*ind));
  double modulo = res*calculoCorrentemodulo();
  return (modulo);
  }
  public double calculoTensaoresangulo(){
  Complexosr c2 = new Complexosr(res,0.0,0.0,0.0,(-1/(6.28*freq*cap)),(6.28*freq*ind));
  double modulo = res*calculoCorrentemodulo();
  double angulo = (0+calculoCorrenteangulo());
  return(angulo);
  }
  public double calculoTensaoindmod(){
  Complexosr c2 = new Complexosr(res,0.0,0.0,0.0,(-1/(6.28*freq*cap)),(6.28*freq*ind));
  double modulo = (6.28*freq*ind)*calculoCorrentemodulo();
  return (modulo);
  }
  public double calculoTensaoindangulo(){
  Complexosr c2 = new Complexosr(res,0.0,0.0,0.0,(-1/(6.28*freq*cap)),(6.28*freq*ind));
  double modulo = res*calculoCorrentemodulo();
  double angulo = (90+calculoCorrenteangulo());
  return(angulo);
  }
  public double calculoFp(){
  Complexosr c2 = new Complexosr(res,0.0,0.0,0.0,(-1/(6.28*freq*cap)),(6.28*freq*ind));
  return(Math.cos(c2.Soma3polarangulo()));
  }
}