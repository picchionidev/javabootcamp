# 💰 Simulador de Conta Bancária em Java

Este é um projeto simples de console em Java que simula o funcionamento básico de uma **conta bancária**. O usuário pode interagir com a conta por meio de um menu, realizando ações como consultar saldo, sacar, depositar, pagar boletos e verificar o uso do cheque especial.

---

## 🧠 Funcionalidades

✔️ Criar conta com saldo inicial definido pelo usuário  
✔️ Calcular automaticamente o valor do cheque especial  
✔️ Consultar o saldo total da conta (considerando o limite)  
✔️ Realizar depósitos e saques  
✔️ Simular o pagamento de um boleto  
✔️ Verificar se o cheque especial está sendo utilizado  
✔️ Menu interativo via terminal

---

## 🛠️ Estrutura do Projeto

O projeto é dividido em dois arquivos:

- `Main.java` → Contém o menu e a lógica de interação com o usuário  
- `ContaBancaria.java` → Responsável pelas operações da conta (depósito, saque, etc.)

💡 Lógica do Cheque Especial
Se o saldo inicial for menor ou igual a R$500, o limite do cheque especial é fixo em R$50.

Caso contrário, o limite do cheque especial é igual à metade do saldo inicial.

O sistema detecta automaticamente quando o usuário está utilizando o cheque especial.
