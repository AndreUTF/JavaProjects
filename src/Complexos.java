public class Complexos {
  //Angulos em radianos
  public static void Conversaoretpolar(double partereal,double parteimaginaria){
  double angulo,modulo;
  modulo = Math.sqrt(Math.pow(partereal,2)+Math.pow(parteimaginaria,2));
  angulo = Math.acos(partereal/modulo);
  System.out.printf("%.5f<%.5f\n",modulo,angulo);
  }
  public static void Conversaopolarret(double modulo,double angulo){
  double partereal,parteimaginaria;
  partereal = Math.cos(angulo)*modulo;
  parteimaginaria = Math.sin(angulo)*modulo;
  System.out.printf("%.5f+i*%.5f\n",partereal,parteimaginaria);
  }
  public static void Somaret(double partereal1,double parteimaginaria1,double partereal2,double parteimaginaria2){
  System.out.printf("%.5f+i*%.5f\n",partereal1+partereal2,parteimaginaria1+parteimaginaria2);
  }
  public static void Somapolar(double modulo1,double angulo1,double modulo2,double angulo2){
  double parterealt,parteimaginariat,modulot,angulot;
  parterealt = Math.cos(angulo1)*modulo1+Math.cos(angulo2)*modulo2;
  parteimaginariat = Math.sin(angulo1)*modulo1+Math.sin(angulo2)*modulo2;
  modulot = Math.sqrt(parterealt*parterealt+parteimaginariat*parteimaginariat);
  angulot = Math.acos(parterealt/modulot);
  System.out.printf("%.5f<%.5f\n",modulot,angulot);
  }
  public static void Subtracaoret(double partereal1,double parteimaginaria1,double partereal2,double parteimaginaria2){
  System.out.printf("%.5f+i*%.5f\n",partereal1-partereal2,parteimaginaria1-parteimaginaria2);
  }
  public static void Subtracaopolar(double modulo1,double angulo1,double modulo2,double angulo2){
  double parterealt,parteimaginariat,modulot,angulot;
  parterealt = Math.cos(angulo1)*modulo1-Math.cos(angulo2)*modulo2;
  parteimaginariat = Math.sin(angulo1)*modulo1-Math.sin(angulo2)*modulo2;
  modulot = Math.sqrt(parterealt*parterealt+parteimaginariat*parteimaginariat);
  angulot = Math.acos(parterealt/modulot);
  System.out.printf("%.5f<%.5f\n",modulot,angulot);
  }
  public static void Multiplicacaoret(double partereal1,double parteimaginaria1,double partereal2,double parteimaginaria2){
  System.out.printf("%.5f+i*%.5f\n",partereal1*partereal2,parteimaginaria1*parteimaginaria2);
  }
  public static void Multiplicacaopolar(double modulo1,double angulo1,double modulo2,double angulo2){
  double parterealt,parteimaginariat,modulot,angulot;
  parterealt = Math.cos(angulo1)*modulo1*Math.cos(angulo2)*modulo2;
  parteimaginariat = Math.sin(angulo1)*modulo1*Math.sin(angulo2)*modulo2;
  modulot = Math.sqrt(parterealt*parterealt+parteimaginariat*parteimaginariat);
  angulot = Math.acos(parterealt/modulot);
  System.out.printf("%.5f<%.5f\n",modulot,angulot);
  }
  public static void Divisaoret(double partereal1,double parteimaginaria1,double partereal2,double parteimaginaria2){
  System.out.printf("%.5f+i*%.5f\n",(partereal1/partereal2),(parteimaginaria1/parteimaginaria2));
  }
  public static void Divisaopolar(double modulo1,double angulo1,double modulo2,double angulo2){
  double parterealt,parteimaginariat,modulot,angulot;
  parterealt = ((Math.cos(angulo1)*modulo1)/(Math.cos(angulo2)*modulo2));
  parteimaginariat = ((Math.sin(angulo1)*modulo1)/(Math.sin(angulo2)*modulo2));
  modulot = Math.sqrt(parterealt*parterealt+parteimaginariat*parteimaginariat);
  angulot = Math.acos(parterealt/modulot);
  System.out.printf("%.5f<%.5f\n",modulot,angulot);
  }
}
