# Funcionario Management System 🧑‍💼

Este é um sistema simples para gerenciar informações de funcionários, como aumento de salário, cálculo de bônus e exibição de dados. Ele utiliza conceitos de **herança**, **polimorfismo**, **encapsulamento** e **abstração** para demonstrar boas práticas de programação em Java.

## 🚀 Funcionalidades

- **Cadastro de Funcionários**: Criação de diferentes tipos de funcionários, como Gerente, Desenvolvedor e Estagiário.
- **Aumento Salarial**: Aplica um aumento percentual no salário de todos os funcionários.
- **Cálculo de Bônus**: Calcula o bônus individual de cada funcionário com base no tipo.
- **Exibição de Dados**: Exibe as informações dos funcionários, como nome, salário, departamento (para gerente), linguagem favorita (para desenvolvedor) e horas trabalhadas (para estagiário).

## 🛠️ Tecnologias

- **Java**: Linguagem principal usada para o desenvolvimento do sistema.
- **OOP (Programação Orientada a Objetos)**: Utilização de conceitos como herança, polimorfismo, encapsulamento e abstração.

## 🏗️ Estrutura do Projeto

O projeto está organizado em classes que representam diferentes tipos de funcionários. Cada tipo de funcionário possui uma implementação própria para o cálculo de bônus e exibição de dados.

### Classes:

- **Funcionario**: Classe abstrata que contém os campos e métodos básicos comuns a todos os funcionários, como nome, CPF e salário.
- **Gerente**: Subclasse de `Funcionario`, com um método específico para calcular bônus (20% do salário) e exibir o departamento.
- **Desenvolvedor**: Subclasse de `Funcionario`, com um método específico para calcular bônus (15% do salário) e exibir a linguagem de programação favorita.
- **Estagiario**: Subclasse de `Funcionario`, com um método específico para calcular bônus fixo (R$100) e exibir as horas trabalhadas.

### 📂 Estrutura de Pacotes

- **`model`**: Contém as classes de `Funcionario`, `Gerente`, `Desenvolvedor`, `Estagiario`.
- **`controller`**: Contém a classe `Rh`, que gerencia a lista de funcionários e operações como aumentar salário e exibir bônus.
