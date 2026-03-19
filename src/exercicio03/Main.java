package exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static BilheteUnico[] bilhete = new BilheteUnico[3];
    static Scanner entrada = new Scanner(System.in);
    static int index = 0;

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("[1] Cadastrar bilhete");
            System.out.println("[2] Carregar bilhete");
            System.out.println("[3] Consultar saldo");
            System.out.println("[4] Passar na catraca");
            System.out.println("[5] Finalizar");
            opcao = entrada.nextInt();

            switch(opcao) {
                case 1 -> cadastrar();
                case 2 -> carregar();
                case 3 -> consultarSaldo();
                case 4 -> passarNaCatraca();
                case 5 -> System.out.println("Finalizado.");
                default -> System.out.println("Opção inválida!");
            }
            System.out.println("\n===================");

        } while(opcao != 5);

    }


    //PASSAR NA CATRACA =============================
    private static void passarNaCatraca() {
        BilheteUnico bilheteUnico = pesquisar();
        if (bilheteUnico != null){
            if (bilheteUnico.passarNaCatraca() == false){
                System.out.println("Saldo insuficiente. Recarregue o bilhete.");
            }
            System.out.println("Saldo atual: R$" + bilheteUnico.saldo);
        }
    }


    //CONSULTAR SALDO ===============================
    private static void consultarSaldo() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        BilheteUnico bilheteUnico = pesquisar();
        if (bilheteUnico != null){
            System.out.println("Saldo atual: R$"+df.format(bilheteUnico.saldo));
        }
    }

    //Static NÃO tem objeto -> Se não fosse static ai teria que ser
    // Main = new m... || BilheteUnico bilheteUnico = m.pesquisar()

    //CARREGAR - PARA CRIAR METODO PODE USAR ALT + ENTER
    private static void carregar() {
        double valor;
        BilheteUnico bilheteUnico = pesquisar();
        if (bilheteUnico != null){
            System.out.print("Valor da recarga: ");
            valor = entrada.nextDouble();
            bilheteUnico.carregar(valor);
        }
    }


    //CADASTRAR =====================================
    private static void cadastrar() {
        String nome;
        long cpf;
        String tipoTarifa;

        if(index < bilhete.length) {
            System.out.print("Nome do usuário: ");
            nome = entrada.next();
            System.out.print("CPF: ");
            cpf = entrada.nextLong();
            System.out.print("Tipo de tarifa (estudante | professor | comum): ");
            tipoTarifa = entrada.next();
            bilhete[index] = new BilheteUnico(new Usuario(nome, cpf, tipoTarifa));
            index++;
        }
        else {
            System.out.println("Erro ao gerar o bilhete! Procure um posto de atendimento");
        }
    }



    //PESQUISAR =====================================
    public static BilheteUnico pesquisar() {
        long cpf;
        System.out.print("Qual o CPF para pesquisa? ");
        cpf = entrada.nextLong();
        for(int i = 0; i < index; i++) {
            if(bilhete[i].usuario.cpf == cpf) {
                return bilhete[i];
            }
        }
        System.out.println("CPF não encontrado");
        return null;
    }
}