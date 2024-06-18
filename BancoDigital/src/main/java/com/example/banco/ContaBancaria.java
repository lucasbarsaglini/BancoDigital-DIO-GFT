package com.example.banco;

public interface ContaBancaria {
    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, Conta destino);
}
