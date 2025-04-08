# 🚗 Simulador de Carro em Java

Projeto simples em Java que simula o funcionamento de um carro com controle de marcha, velocidade, direção e estado (ligado/desligado), seguindo regras semelhantes às da vida real.

## 📁 Estrutura de Pacotes


src/
├── app/            # Main.java (entrada do programa)
├── controller/     # MenuHandler.java (menu de controle)
├── model/          # Carro.java (estado e ações do carro)
└── rules/          # RegraDeFunc.java (validações de regras)

✅ Funcionalidades
🔑 Ligar o carro

🔒 Desligar o carro

💨 Acelerar (+1 km/h)

🛑 Frear (-1 km/h)

↩️ Virar à esquerda

↪️ Virar à direita

📊 Ver velocidade

🔼 Aumentar marcha

🔽 Reduzir marcha

⚙️ Regras Gerais
🔧 O carro começa desligado, em marcha 0 e com velocidade 0 km/h(Construtor)

🔒 Carro desligado não executa nenhuma ação (exceto ligar).

⛔ Acelerar só é permitido fora do ponto morto e respeitando a marcha atual.

🛑 Velocidade varia de 0 km/h a 120 km/h.

⚙️ O carro tem 6 marchas.Marcha e velocidade devem estar em conformidade:

Marcha	Velocidade Permitida
0	0 km/h (sem acelerar)
1	0–20 km/h
2	21–40 km/h
3	41–60 km/h
4	61–80 km/h
5	81–100 km/h
6	101–120 km/h
🔌 Só pode desligar com marcha 0 e velocidade 0.

↪️ Só pode virar com velocidade entre 1 e 40 km/h.

🧠 Aprendizados
Este projeto explora:

🧩 Lógica condicional maix complexa

🚦 Boas práticas de programação orientada a objetos(Encapsulamento Por Exemplo)

📁 Organização em pacotes

🧪 Simulação de regras reais com programação