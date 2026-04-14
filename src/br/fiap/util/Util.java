package br.fiap.util;

import br.fiap.carga.Carga;
import br.fiap.cliente.Cliente;
import br.fiap.navio.Navio;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {
    public void menu(){
        int opcao;
        do {
            String aux = "Reserva de Cargas Boa Viagem";
            aux += "[1] Reservar \n";
            aux += "[2] Pesquisar \n";
            aux += "[3] Exibir \n";
            aux += "[4] Capacidade Reservada \n";
            aux += "[5] Cancelar \n";
            aux += "[6] Finalizar \n";
            opcao = parseInt(showInputDialog(aux));
            if (opcao < 1 || opcao > 6) {
                showMessageDialog(null, "Opção inválida");
            }
            else {
                switch (opcao){
                    case 1 -> reserva();
                    // case 2 -> pesquisar();
                    case 3 -> exibir();
                    //case 4 -> capacidade();
                    //case 5 -> cancelar();
                    case 6-> showMessageDialog(null,"Até breve!");
                }
            }
        } while (opcao != 6);
    }

    private void exibir() {
        Navio navio = new Navio();
        showMessageDialog(null,navio.getDados());
    }

    private void reserva() {
        int cnpj;
        String destino, nomeCliente;
        cnpj = parseInt(showInputDialog("CNPJ"));
        destino = showInputDialog("Destino");
        nomeCliente = showInputDialog("Cliente");
        Cliente cliente = new Cliente(cnpj, nomeCliente);
        Carga carga = new Carga(destino, cliente);
        if (navio.reservar(carga)){
            showMessageDialog(null,"Carga reservada com sucesso");
        } else {
            showMessageDialog(null,"Reserva não permitida");
        }
    }
}
