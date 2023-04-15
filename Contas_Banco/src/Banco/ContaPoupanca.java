package Banco;

public class ContaPoupanca extends Conta {
  @Override
  public void atualiza(double taxa) {
    super.deposita(this.getSaldo() * taxa * 3);
  }
}