package Banco;

public class ContaCorrente extends Conta implements Tributavel{
    @Override
    public void atualiza(double taxa) {
      super.deposita(this.getSaldo() * taxa * 2);
      super.deposita(-1);
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
  }