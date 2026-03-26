package exercicio04;

import java.time.Duration;
import java.time.LocalTime;

public class Movimentacao {
    String horaEntrada;
    String horaSaida;
    Veiculo veiculo;

    public Movimentacao(Veiculo veiculo, String horaEntrada) {
        this.veiculo = veiculo;
        this.horaEntrada = horaEntrada;
        this.horaSaida = null;
    }

    public double calcularValor() {
        LocalTime inicio, fim;
        double valor;
        long minutos;

        inicio = LocalTime.parse(horaEntrada);
        fim = LocalTime.parse(horaSaida);
        minutos = Duration.between(inicio, fim).toMinutes();

        valor = minutos * 0.75;

        return valor;
    }
}
