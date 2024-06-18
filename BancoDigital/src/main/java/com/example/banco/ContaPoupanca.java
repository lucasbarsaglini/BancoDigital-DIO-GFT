package com.example.banco;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero) {
        super(numero);
    }

    @Override
    public void transferir(double valor, Conta destino) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para a conta " + destino.numero + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para transferência.");
        }
    }
}