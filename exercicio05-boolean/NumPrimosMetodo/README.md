# Verificador de Número Primo (Java)

Este projeto implementa um verificador de números primos utilizando **Java**, com foco no uso de **métodos**, **retorno booleano** e **organização em múltiplas classes**.

O objetivo do exercício é praticar:
- Estruturas condicionais (`if / else`)
- Laços de repetição (`for`)
- Criação e chamada de métodos
- Retorno de valores booleanos (`true` / `false`)
- Separação de responsabilidades entre classes

---

## 🧠 Lógica utilizada

Um número é considerado primo quando:
- É maior que 1
- Possui apenas dois divisores: 1 e ele mesmo

A verificação segue os passos:
1. Elimina números menores ou iguais a 1
2. Trata o caso especial do número 2
3. Elimina números pares
4. Testa divisores ímpares até a raiz quadrada do número

---

## 📁 Estrutura do projeto

src/ ├── NumPrimosMetodo.java

└── VerificarPrimos.java


### 🔹 `VerificarPrimos.java`
Responsável pela regra.  
Contém o método:

```java
public static boolean isPrimo(int numero)

Esse método retorna:

true → se o número for primo

false → caso contrário
```

### 🔹 NumPrimosMetodo.java

Classe principal do programa.
Responsável por:

Ler o número digitado pelo usuário

Chamar o método isPrimo

Exibir o resultado no console

