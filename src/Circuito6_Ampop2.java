public class Circuito6_Ampop2 {
private double ri1;
private double ri2;
private double ri3;
private double vi1;
private double vi2;
private double vi3;
private double rf;
  public Circuito6_Ampop2(double ri1, double ri2, double ri3, double vi1, double vi2, double vi3, double rf) {
  this.ri1 = ri1;
  this.ri2 = ri2;
  this.ri3 = ri3;
  this.vi1 = vi1;
  this.vi2 = vi2;
  this.vi3 = vi3;
  this.rf = rf;
  }
  public double getRi1() {
  return ri1;
  }
  public void setRi1(double ri1) {
  this.ri1 = ri1;
  }
  public double getRi2() {
  return ri2;
  }
  public void setRi2(double ri2) {
  this.ri2 = ri2;
  }
  public double getRi3() {
  return ri3;
  }
  public void setRi3(double ri3) {
  this.ri3 = ri3;
  }
  public double getVi1() {
  return vi1;
  }
  public void setVi1(double vi1) {
  this.vi1 = vi1;
  }
  public double getVi2() {
  return vi2;
  }
  public void setVi2(double vi2) {
  this.vi2 = vi2;
  }
  public double getVi3() {
  return vi3;
  }
  public void setVi3(double vi3) {
  this.vi3 = vi3;
  }
  public double getRf() {
  return rf;
  }
  public void setRf(double rf) {
  this.rf = rf;
  }
  public double Ampopsomadorinv(){
  return (-(((rf/ri1)*vi1)+((rf/ri2)*vi2)+((rf/ri3)*vi3)));
  }  
}
