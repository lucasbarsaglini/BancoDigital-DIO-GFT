# Projeto Banco Digital com Java do Bootcamp da DIO e GFT

<img src="http://img.shields.io/static/v1?label=STATUS&message=CONCLUIDO&color=GREEN&style=for-the-badge"/>
<br/>

# Descrição
Este repositório contém a implementação de um desafio proposto para aplicar conceitos de Orientação a Objetos em Java, focado no domínio bancário. O objetivo é criar uma solução que simule um banco com contas correntes e poupanças, permitindo operações comuns como depósito, saque e transferência entre contas.

<br/>

# Cenário
Um banco oferece aos seus clientes dois tipos de contas:

- Conta Corrente
- Conta Poupança
  
Ambos os tipos de contas devem suportar as seguintes funcionalidades:

- Depósito: Adicionar uma quantia especificada ao saldo da conta.
- Saque: Retirar uma quantia especificada do saldo da conta, caso haja saldo suficiente.
- Transferência: Transferir uma quantia especificada entre contas da mesma instituição.

<br/>

# Estrutura do Projeto
O projeto foi desenvolvido utilizando os princípios de Orientação a Objetos, com as seguintes classes principais:

- Conta: Classe abstrata que define as operações básicas (depósito, saque, transferência) e os atributos comuns (número da conta, saldo, etc.).
- ContaCorrente: Classe que herda de Conta e representa uma conta corrente.
- ContaPoupanca: Classe que herda de Conta e representa uma conta poupança.

<br/>

# Funcionalidades Implementadas
- Depósito: Método para adicionar fundos à conta.
- Saque: Método para retirar fundos da conta, verificando a disponibilidade de saldo.
- Transferência: Método para transferir fundos entre contas da mesma instituição.

<br/>

# Como Executar
Clone o repositório para sua máquina local.
Importe o projeto em sua IDE Java de preferência.
Compile e execute a aplicação.

<br/>

# Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para melhorias e correções.
