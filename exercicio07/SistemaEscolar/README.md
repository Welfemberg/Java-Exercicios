📚 Sistema Escolar em Java

Este projeto é um Sistema Escolar simples, desenvolvido em Java, com o objetivo de praticar e consolidar os principais conceitos de Programação Orientada a Objetos (POO).

O sistema permite o cadastro de pessoas em uma escola, diferenciando Alunos e Professores, utilizando herança, polimorfismo e coleções.

🎯 Objetivos do Projeto

Praticar criação de classes em arquivos separados

Utilizar atributos e métodos

Trabalhar com construtores

Aplicar herança

Explorar polimorfismo

Utilizar listas (List e ArrayList)

Organizar um projeto Java utilizando Maven

🧱 Estrutura do Projeto

O projeto é composto pelas seguintes classes:

🔹 Pessoa (classe base)

Atributos: nome, idade

Métodos:

apresentar()

getNome()

getIdade()

getTipo()

🔹 Aluno (herda de Pessoa)

Atributo adicional: media

Métodos:

aprovado() → retorna se o aluno está aprovado

apresentar() (sobrescrito)

getTipo()

🔹 Professor (herda de Pessoa)

Atributo adicional: disciplina

Métodos:

apresentar() (sobrescrito)

getTipo()

🔹 Escola

Responsável por gerenciar uma lista de pessoas (List<Pessoa>)

Métodos:

adicionarPessoa(Pessoa pessoa)

listarPessoas()

🔹 main

Classe principal que instancia objetos

Adiciona alunos e professores à escola

Executa a listagem usando polimorfismo