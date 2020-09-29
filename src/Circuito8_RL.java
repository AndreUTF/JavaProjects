public class Circuito8_RL {
private double res;
private double ind;
private double tensao;
private double freq;
  public Circuito8_RL(double res, double ind,double tensao, double freq) {
  this.res = res;
  this.ind = ind;
  this.tensao = tensao;
  this.freq = freq;
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
  public double getTensao() {
  return tensao;
  }
  public void setTensao(double tensao) {
  this.tensao = tensao;
  }
  public double getFreq() {
  return freq;
  }
  public void setFreq(double freq) {
  this.freq = freq;
  }
  public double correntePrincipalmodulo(){
  Complexosr c2 = new Complexosr(res,0.0,0.0,(6.28*freq*ind));
  double modulo;
  modulo = (tensao/(c2.Somapolar2mod()));
  return(modulo);
  }
  public double correntePrincipalangulo(){
  Complexosr c2 = new Complexosr(res,0.0,0.0,(6.28*freq*ind));
  double modulo,angulo;
  modulo = (tensao/(c2.Somapolar2mod()));
  angulo = 0 - c2.Somapolar2angulo();
  if(angulo<0.0){
  return(-angulo);
  }
  else{
  return(+angulo);
  }
  }
  public double tensaoresmod(){
  Circuito8_RL c3 = new Circuito8_RL(res,ind,tensao,freq);
  return(c3.correntePrincipalmodulo()*res);
  }
  public double tensaoresangulo(){
  Circuito8_RL c3 = new Circuito8_RL(res,ind,tensao,freq);
  return(c3.correntePrincipalmodulo()+0.0);
  }
  public double tensaoindmod(){
  Circuito8_RL c3 = new Circuito8_RL(res,ind,tensao,freq);
  return(c3.correntePrincipalmodulo()*6.28*freq*ind);
  }
  public double tensaoindangulo(){
  Circuito8_RL c3 = new Circuito8_RL(res,ind,tensao,freq);
  return(c3.correntePrincipalangulo()+90);
  }
  public double calculofp(){
  Complexosr c2 = new Complexosr(res,0.0,0.0,(6.28*freq*ind));
  double angulo = Math.cos(c2.Somapolar2angulo());
  return(angulo);
  }
}
