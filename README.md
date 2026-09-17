# Java — Repositório Educacional

Este repositório possui **caráter exclusivamente educacional** e foi criado com o objetivo de reunir exemplos, exercícios, testes e projetos desenvolvidos em **Java**.

O conteúdo é voltado ao estudo da linguagem, de sua sintaxe, bibliotecas, orientação a objetos, organização de projetos e utilização prática do ecossistema Java.

---

## Sobre o Java

Java é uma linguagem de programação de propósito geral, fortemente tipada e orientada a objetos.

Seu desenvolvimento começou no início da década de 1990 na **Sun Microsystems**, tendo **James Gosling** como um de seus principais criadores.

O projeto inicialmente utilizava o nome **Oak** e fazia parte de uma iniciativa voltada ao desenvolvimento de software para dispositivos eletrônicos.

Em **1995**, a linguagem foi oficialmente apresentada como **Java**.

Com o tempo, tornou-se uma das linguagens mais utilizadas no desenvolvimento de aplicações corporativas, sistemas web, aplicações desktop, servidores, ferramentas de infraestrutura e diversos outros tipos de software.

---

## Propósito do Java

Um dos principais objetivos do Java foi permitir que programas pudessem ser executados em diferentes sistemas operacionais sem que fosse necessário recompilar o código especificamente para cada plataforma.

Esse conceito ficou conhecido pela expressão:

> **Write Once, Run Anywhere — WORA**

O código-fonte Java é normalmente compilado para **bytecode**, que posteriormente é executado pela **Java Virtual Machine — JVM**.

Fluxo básico:

```text
Código Java (.java)
        ↓
      javac
        ↓
Bytecode (.class)
        ↓
       JVM
        ↓
Sistema Operacional
```

A JVM funciona como uma camada intermediária entre o programa e o sistema operacional.

---

## Objetivos deste repositório

Este repositório poderá conter materiais relacionados a:

* Sintaxe da linguagem Java;
* Tipos primitivos;
* Variáveis e constantes;
* Operadores;
* Estruturas condicionais;
* Estruturas de repetição;
* Métodos;
* Arrays;
* Strings;
* Classes e objetos;
* Encapsulamento;
* Herança;
* Polimorfismo;
* Interfaces;
* Classes abstratas;
* Exceptions;
* Collections;
* Generics;
* Packages;
* Manipulação de arquivos;
* Entrada e saída de dados;
* Threads;
* Concorrência;
* Recursos da biblioteca padrão;
* Compilação por linha de comando;
* Utilização do OpenJDK;
* Criação e utilização de arquivos `.jar`;
* Desenvolvimento de pequenos projetos acadêmicos.

---

## Compilação

Um arquivo Java pode ser compilado diretamente pelo console utilizando:

```bash
javac Programa.java
```

O compilador gera o respectivo bytecode:

```text
Programa.class
```

---

## Execução

Para executar:

```bash
java Programa
```

---

## Packages

Para compilar respeitando a estrutura de packages:

```bash
javac -d . Programa.java
```

Também é possível definir outro diretório de destino:

```bash
javac -d bin Programa.java
```

---

## Arquivos JAR

Arquivos `.jar` permitem agrupar classes, recursos e outros arquivos relacionados a uma aplicação Java.

Exemplo de criação de um JAR:

```bash
jar cf programa.jar *.class
```

Para um JAR executável:

```bash
jar cfe programa.jar Main *.class
```

Execução:

```bash
java -jar programa.jar
```

---

## Bibliotecas externas

Bibliotecas Java também podem ser utilizadas diretamente através de arquivos `.jar`.

Exemplo de compilação:

```bash
javac -cp "biblioteca.jar" Programa.java
```

No Windows:

```bash
java -cp ".;biblioteca.jar" Programa
```

Em Linux e macOS:

```bash
java -cp ".:biblioteca.jar" Programa
```

---

## OpenJDK

Os exemplos deste repositório podem ser desenvolvidos utilizando o **OpenJDK**, implementação aberta da plataforma Java.

O OpenJDK disponibiliza as principais ferramentas utilizadas durante o desenvolvimento, incluindo:

```text
java
javac
jar
javap
javadoc
jshell
jdb
```

---

## Estrutura sugerida

Uma organização possível para os projetos deste repositório:

```text
Java/
│
├── fundamentos/
├── condicionais/
├── repeticao/
├── arrays/
├── strings/
├── metodos/
├── classes/
├── heranca/
├── interfaces/
├── exceptions/
├── collections/
├── generics/
├── arquivos/
├── threads/
├── packages/
├── bibliotecas/
└── projetos/
```

Cada diretório poderá conter exemplos independentes destinados ao estudo de determinado recurso da linguagem.

---

## Finalidade acadêmica

Este projeto não pretende substituir a documentação oficial da linguagem Java.

Seu objetivo é funcionar como:

* material de estudo;
* repositório de exemplos;
* laboratório de programação;
* registro de experimentos;
* referência acadêmica;
* ambiente para aperfeiçoamento técnico.

Os códigos poderão apresentar diferentes abordagens para um mesmo problema com o objetivo de demonstrar características específicas da linguagem.

---

## Referências

* OpenJDK
* Java Language Specification
* Java Virtual Machine Specification
* Documentação oficial da plataforma Java

---

## Licença e utilização

Os exemplos produzidos especificamente para este repositório destinam-se ao estudo, pesquisa e desenvolvimento acadêmico.

Eventuais bibliotecas externas utilizadas permanecem submetidas às respectivas licenças de seus autores e mantenedores.
