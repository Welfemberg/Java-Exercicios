
---

# 📗 README — Verificador de Número Primo (Retorno `String`)


# Verificador de Número Primo com Retorno String (Java)

Este projeto implementa um verificador de números primos em **Java**, utilizando **métodos com retorno `String`**, como forma alternativa ao retorno booleano.

O objetivo é comparar abordagens e entender quando cada tipo de retorno pode ser utilizado.

---

## 🧠 Lógica utilizada

A lógica para verificar se um número é primo segue os mesmos critérios matemáticos.


A diferença deste projeto é que o método retorna diretamente uma **mensagem em texto**, como:
- `"é primo"`
- `"não é primo"`

---

## 📁 Estrutura do projeto

src/
├── ClasseMetodo.java


O projeto contém duas classes no mesmo arquivo para fins didáticos.

---

## 🔹 Classe `ClasseM`

Responsável pela regra.

Método principal:
```java
public static String isPrimo(int numero)
```

Esse método:

Avalia se o número é primo

Retorna uma String com o resultado

Não realiza nenhuma impressão direta no console


## 🔹 Classe ClasseMetodo

Classe principal do programa.

Responsável por:

Ler o número informado pelo usuário

Chamar o método isPrimo

Imprimir o número junto com o resultado retornado