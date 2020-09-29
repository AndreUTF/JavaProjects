public class Pessoa {
  private String nome;
  private char sexo;
  private Data dtNasc;
  public Pessoa(String nome, char sexo, Data dtNasc) {
    this.nome = nome;
    this.sexo = sexo;
    this.dtNasc = dtNasc;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public char getSexo() {
    return sexo;
  }
  public void setSexo(char sexo) {
    this.sexo = sexo;
  }
  public Data getDtnasc() {
    return dtNasc;
  }
  public void setDtnasc(Data dtNasc) {
    this.dtNasc = dtNasc;
  }
  @Override
  public String toString() {
    return "Nome......: " + nome + "\nSexo......: " + sexo + "\nNascimento: " + 
      dtNasc.mostrarData(1) + " (" + dtNasc.calculaIdade() + " anos)";
  }
  
}