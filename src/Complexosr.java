public class Complexosr{
private double real1;
private double real2;
private double real3;
private double real4;
private double imaginario1;
private double imaginario2;
private double imaginario3;
private double imaginario4;
  public Complexosr(double real1, double imaginario1) {
  this.real1 = real1;
  this.imaginario1 = imaginario1;
  }
  public Complexosr(double real1, double real2, double imaginario1, double imaginario2) {
  this.real1 = real1;
  this.real2 = real2;
  this.imaginario1 = imaginario1;
  this.imaginario2 = imaginario2;
  }
  public Complexosr(double real1, double real2, double real3, double imaginario1, double imaginario2, double imaginario3) {
  this.real1 = real1;
  this.real2 = real2;
  this.real3 = real3;
  this.imaginario1 = imaginario1;
  this.imaginario2 = imaginario2;
  this.imaginario3 = imaginario3;
  }
  public Complexosr(double real1, double real2, double real3, double real4, double imaginario1, double imaginario2, double imaginario3, double imaginario4) {
  this.real1 = real1;
  this.real2 = real2;
  this.real3 = real3;
  this.real4 = real4;
  this.imaginario1 = imaginario1;
  this.imaginario2 = imaginario2;
  this.imaginario3 = imaginario3;
  this.imaginario4 = imaginario4;
  }
  public double getReal1() {
  return real1;
  }
  public void setReal1(double real1) {
  this.real1 = real1;
  }
  public double getReal2() {
  return real2;
  }
  public void setReal2(double real2) {
  this.real2 = real2;
  }
  public double getReal3() {
  return real3;
  }
  public void setReal3(double real3) {
  this.real3 = real3;
  }
  public double getReal4() {
  return real4;
  }
  public void setReal4(double real4) {
  this.real4 = real4;
  }
  public double getImaginario1() {
  return imaginario1;
  }
  public void setImaginario1(double imaginario1) {
  this.imaginario1 = imaginario1;
  }
  public double getImaginario2() {
  return imaginario2;
  }
  public void setImaginario2(double imaginario2) {
  this.imaginario2 = imaginario2;
  }
  public double getImaginario3() {
  return imaginario3;
  }
  public void setImaginario3(double imaginario3) {
  this.imaginario3 = imaginario3;
  }
  public double getImaginario4() {
  return imaginario4;
  }
  public void setImaginario4(double imaginario4) {
  this.imaginario4 = imaginario4;
  }
  public double Cpolarmodulo(){
  double modulo = Math.sqrt(real1*real1+imaginario1*imaginario1);
  return(modulo);
  }
  public double Cpolarangulo(){
  double modulo = Math.sqrt(real1*real1+imaginario1*imaginario1);
  double angulo = Math.acos(real1/modulo);
  return (angulo);
  }
  public double Somap(){
  return(real1+real2);
  }
  public double Somapi(){
  return(imaginario1+imaginario2);
  }
  public double Soma3p(){
  return(real1+real2+real3);
  }
  public double Somapolar2mod(){
  double modulo = Math.sqrt((real1+real2)*(real1+real2)+(imaginario1+imaginario2)*(imaginario1+imaginario2));
  double angulo = Math.acos((real1+real2)/(modulo));
  return(modulo);
  }
  public double Somapolar2angulo(){
  double modulo = Math.sqrt((real1+real2)*(real1+real2)+(imaginario1+imaginario2)*(imaginario1+imaginario2));
  double angulo = Math.acos((real1+real2)/(modulo));
  return(angulo);
  }
  public double Soma3pi(){
  return(imaginario1+imaginario2+imaginario3);
  }
  public double Soma3polarmodulo(){
  double modulo =Math.sqrt((real1+real2+real3)*(real1+real2+real3)+(imaginario1+imaginario2+imaginario3)*(imaginario1+imaginario2+imaginario3));
  double angulo = Math.acos((real1+real2+real3)/(modulo));
  return (modulo);
  }
  public double Soma3polarangulo(){
  double realt = real1+real2+real3;
  double imaginariot = imaginario1+imaginario2+imaginario3;
  double modulo = Math.sqrt((realt)*(realt)+(imaginariot)*(imaginariot));
  double ang = (realt)/(modulo);
  double angv = Math.acos(ang);
  if(imaginariot<0){
  return (-angv);
  }
  else
  return (angv);
  }
  public double Mult(){
  return(real1*real2-imaginario1*imaginario2);
  }
  public double Multi(){
  return(real1*imaginario2+imaginario1*real2);
  }
  public double Div(){
  return((real1*real2+imaginario1*imaginario2)/(real1*real1+imaginario2*imaginario2));
  }
  public double Divi(){
  return((imaginario1*real2-real1*imaginario2)/(real1*real1+imaginario2*imaginario2));
  }
}
