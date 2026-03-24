package exercicio04;
import java.util.Scanner;

public class Main {

    static Scanner entrada = new Scanner(System.in);
    static Veiculo[] veiculo = new Veiculo[5];
    static Movimentacao[] movimentacao = new Movimentacao[5];
    static int indexVeiculo;
    static int indexRegistro;

    public static void main(String[] args) {
        int opcao;

        do{
            System.out.println("""
                    #### Estacionamento ParkEasy ####
                    [1] Entrada de veículo
                    [2] Saída de veículo
                    [3] Imprimir veículos estacionados
                    [4] Imprimir a receita
                    [5] Finalizar""");
            opcao = entrada.nextInt();

            switch (opcao){
                    case 1 -> registrarEntrada();
                    case 2 -> registrarSaida();
                    case 3 -> imprimirEstacionado();
                    case 4 -> imprimirReceita();
                    default -> System.out.println("Opção Inválida");
            }
        } while(opcao != 5);{
            System.out.println("aaa");
        }
    }

    private static void imprimirReceita() {
    }

    private static void imprimirEstacionado() {
    }

    private static void registrarSaida() {
    }

    private static void registrarEntrada() {
        String nome;
        String marca, modelo, placa;
        long cpf;
        String horaEntrada;

        Veiculo veiculoEncontrado = pesquisar();

        if (veiculoEncontrado == null){
            System.out.println("Nome do proprietario: ");
            nome = entrada.next();
            System.out.println("Digite o CPF: ");
            cpf = entrada.nextLong();
            System.out.println("Digite a Placa do veículo: ");
            placa = entrada.next().toUpperCase();
            System.out.println("Digite a Marca do veículo: ");
            marca = entrada.next().toUpperCase();
            System.out.println("Digite o Modelo do veículo: ");
            modelo = entrada.next().toUpperCase();

            Proprietario proprietario = new Proprietario(nome, cpf);
            veiculo[indexVeiculo] = new Veiculo(placa, modelo, marca, proprietario);
            indexVeiculo++;
        } else {
            System.out.println("Hora de entrada: ");
            horaEntrada = entrada.next();
            movimentacao[indexRegistro] = new Movimentacao(veiculoEncontrado, horaEntrada);
            indexRegistro++;
        }
    }

    private static Veiculo pesquisar() {
        String placa;

        System.out.println("Placa para pesquisa: ");
        placa = entrada.next().toUpperCase();

        for (int i = 0; i < indexVeiculo; i++) {

            if (veiculo[i].placa.equals(placa)){
                return veiculo[i];
            }
        }
        System.out.println("Veículo não encontrado");
        return null;
    }
}