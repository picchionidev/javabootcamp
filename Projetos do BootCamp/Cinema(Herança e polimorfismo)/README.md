🎟️ Sistema de Ingressos de Cinema
Projeto Java orientado a objetos que simula a compra de ingressos de cinema. O sistema lida com diferentes tipos de ingressos — Normal, Meia Entrada e Família —, cada um com regras específicas de cálculo de valor.

📌 Funcionalidades
Cadastro de informações do ingresso (nome do filme, valor, tipo de áudio).

Três tipos de ingressos:

🎫 Normal: valor fixo.

👨‍👩‍👧‍👦 Família: desconto de 5% se comprar mais de 3 ingressos.

🧒 Meia Entrada: 50% de desconto.

Impressão do valor total calculado para cada tipo.

📂 Estrutura de Pastas

projetoIngresso/
├── Main.java
└── ingresso/
    ├── Ingresso.java
    ├── IngressoNormal.java
    ├── IngressoFamilia.java
    └── IngressoMeia.java


💬 Exemplo de Uso

O seu ingresso é
[1] Normal
[2] Família
[3] Meia Entrada
> 2

Qual o nome do filme?
> Vingadores: Ultimato

Qual o valor do Ingresso?
> 20

O Filme é
[1] Dublado
[2] Legendado
> 1

Quantos Ingressos serão comprados?
> 4

O valor total a ser pago é 76.00

🧠 Conceitos Envolvidos

Herança e Polimorfismo

Classes Abstratas e Seladas (sealed)

Encapsulamento com getters e setters

Separação de responsabilidades por classe

