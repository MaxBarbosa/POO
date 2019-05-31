class Conta{
  private String nomeCliente;
  private double saldo, limite;

  public Conta(String nomeCliente, double saldo, double limite){
    this.nomeCliente = nomeCliente;
    this.saldo = saldo;
    this.limite = limite;
  }

  public String getNomeCliente(){
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente){
    this.nomeCliente = nomeCliente;
  }

  public double getSaldo(){
    return saldo;
  }

  public void setSaldo(double saldo){
    this.saldo = saldo;
  }

  public double getLimite(){
    return limite;
  }

  public void setLimite(double limite){
    this.limite = limite;
  }

  public void Sacar(double valorSaque){
    if(valorSaque <= saldo){
        System.out.println("Saque realizado no valor de R$  "+  valorSaque+ "\n");
        saldo= saldo - valorSaque;
    }
    else
    {
      System.out.println("Não foi possível realizar saque! o valor informado é maior do que o saldo disponível");
    }
  }

  public void Depositar(double valorDeposito){
    if (valorDeposito > limite){
      System.out.println("Valor de deposito excede o limite, tente um valor menor.");
    }
    else
    {
      System.out.println("Depósito no valor de R$ "+valorDeposito+" realizado com sucesso!");

      saldo = saldo + valorDeposito;
    }
  }
}

class Main{
  public static void main(String[] args){
    Conta c = new Conta("Tiago", 2000.5, 2500.0);
    c.Sacar(1500.0);
    c.Depositar(300.0);
  }
}
