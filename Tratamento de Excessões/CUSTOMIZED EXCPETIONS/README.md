README - Simulador de Saque Bancário

📌 Descrição

    Este projeto é um simples simulador de saque bancário desenvolvido em Java, sem o uso de Programação Orientada a Objetos (POO). Ele solicita ao usuário o saldo atual da conta e o valor do saque, verificando se há saldo suficiente antes de completar a transação.

    Foi Realizado para Fixar a Customização de Excessões durante Meu aprendizado de java

🚀 Funcionalidades

    Solicitação do saldo bancário.

    Solicitação do valor a ser sacado.

    Verificação de saldo suficiente.

    Exceção personalizada para saldo insuficiente.

    Uso de try-catch-finally para tratamento de erros.

🛠️ Tecnologias Utilizadas

    Linguagem: Java

📦 Estrutura do Código

    O código possui três partes principais:

    Entrada de Dados: O usuário informa o saldo e o valor do saque.

    Processamento: O programa verifica se há saldo suficiente.

    Saída: Exibe o saldo restante ou um erro se o saldo for insuficiente.

⚠️ Tratamento de Erros

    Se o usuário tentar sacar mais do que tem na conta, uma exceção SaldoInsuficienteException será lançada e exibirá uma mensagem de erro.