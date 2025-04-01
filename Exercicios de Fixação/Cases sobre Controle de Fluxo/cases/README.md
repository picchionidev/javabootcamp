Prompt Case 1📌

1. Declarar um salário base de R$ 2000.
2. Pedir ao usuário para informar seu salário pretendido.
3. Comparar o salário informado com o salário base e imprimir uma mensagem com base na comparação:
- Se o salário pretendido for menor que o salário base, deve imprimir "Ligar para o Candidato!".
- Se o salário pretendido for igual ao salário base, deve imprimir "Ligar com Contra Proposta".
- Se o salário pretendido for maior que o salário base, deve imprimir "Aguardando demais Candidatos".

Prompt Contador📌

Vamos exercitar todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.

Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"

Crie o projeto DesafioControleFluxo

Dentro do projeto, crie a classe Contador.java para realizar toda a codificação do nosso programa.

Dentro do projeto, crie a classe ParametrosInvalidosException que representará a exceção de negócio no sistema.