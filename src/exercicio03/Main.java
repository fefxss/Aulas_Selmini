package exercicio03;

import java.util.Scanner;

public class Main {
    static BilheteUnico[] bilhete = new BilheteUnico[10];

    static Scanner entrada = new Scanner(System.in);

    static int indice = 0;

    public static void main(String[] args) {
        int opcao;

        do{
            System.out.print("==== Escolha uma das opções abaixo ====");
            System.out.print("1. Cadastrar Bilhete");
            System.out.print("2. Carregar Bilhete");
            System.out.print("3. Consultar saldo");
            System.out.print("4. Passar na catraca");
            System.out.print("5. Finalizar");

            opcao=entrada.nextInt();
        } while(opcao != 5);

        switch (opcao){
            case 1 -> cadastrar();
        }
    }

    private static void cadastrar() {
        String nome;
        long cpf;
        String tipoTarifa;

        if (indice < bilhete.length){
            System.out.print("Nome do usuário: ");
            nome = entrada.next();
            System.out.print("CPF: ");
            cpf = entrada.nextLong();
            System.out.print("Tipo de Tarifa: [estudante | professor | comum]");
            tipoTarifa = entrada.next();
        }
    }

    public BilheteUnico pesquisar(){
        long cpf;
        System.out.print("Qual o CPF para pesquisa? ");
        cpf = entrada.nextLong();
        for (int i = 0; i < indice; i++) {
            if (bilhete[i].usuario.cpf == cpf){
                return bilhete[i];
            }
        }
        System.out.print("CPF não encontrado");
        return null;
    }
}
