package exercicio04;

public class Movimentacao {
    String horaEntrada;
    String horaSaida;
    Veiculo veiculo;

    public Movimentacao(Veiculo veiculo, String horaEntrada) {
        this.veiculo = veiculo;
        this.horaEntrada = horaEntrada;
        this.horaSaida = null;
    }
}
