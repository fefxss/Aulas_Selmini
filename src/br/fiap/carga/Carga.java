package br.fiap.carga;

import br.fiap.cliente.Cliente;

import java.util.Random;

public class Carga {
    private int id;
    private String destino;
    private double peso;
    private Cliente cliente;


    public Carga (String destino, Cliente cliente) {
        Random random = new Random();
        this.destino = destino;
        this.cliente = cliente;
        this.id = random.nextInt(1000,9999);
        this.peso = random.nextDouble(1000,5000);
    }

    // =========== G E T =========== //

    public int getId() {
        return id;
    }

    public String getDestino() {
        return destino;
    }

    public double getPeso() {
        return peso;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // =========== S E T =========== //

    public void setId(int id) {
        this.id = id;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}


