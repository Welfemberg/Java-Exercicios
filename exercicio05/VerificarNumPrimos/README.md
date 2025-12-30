# Verificador de Números Primos (Java)

Este projeto implementa um **verificador simples de números primos em Java**, utilizando apenas estruturas básicas da linguagem, sem criação de métodos auxiliares.

O objetivo do exercício é praticar:
- Estruturas condicionais (`if`, `else if`, `else`)
- Laço de repetição `for`
- Uso do `break`
- Variáveis de controle
- Entrada de dados com `Scanner`
- Saída formatada com `System.out.printf`

---

## 🧠 Lógica utilizada

Um número é considerado primo quando:
- É maior que 1
- É divisível apenas por 1 e por ele mesmo

A lógica aplicada no programa segue os passos abaixo:

1. Se o número for menor ou igual a 1 → **não é primo**
2. Se o número for igual a 2 → **é primo** (caso especial)
3. Se o número for divisível por 2 → **não é primo**
4. Caso contrário:
    - O programa percorre possíveis divisores usando um `for`
    - Se encontrar algum divisor com resto 0, o número **não é primo**
    - Se nenhum divisor for encontrado, o número **é primo**

A variável `divisorEncontrado` é usada como controle para indicar se algum divisor foi encontrado durante o laço.

---

## 📁 Estrutura do projeto

src/
└── VerificarNumPrimos.java

