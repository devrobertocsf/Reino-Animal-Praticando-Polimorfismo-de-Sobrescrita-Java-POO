# 🦁 Reino Animal - Praticando Polimorfismo de Sobrescrita (Java POO)

Este repositório foi criado para demonstrar a aplicação prática do **Polimorfismo de Sobrescrita (Dinâmico)** em Java, utilizando uma árvore de herança baseada no Reino Animal.

## 🎯 O que é Polimorfismo de Sobrescrita?

Ocorre quando uma subclasse substitui (redefine) um método herdado de uma superclasse. Para caracterizar a sobrescrita, o método na classe filha deve possuir **exatamente a mesma assinatura** (mesmo nome, mesma quantidade e tipos de parâmetros) do método da classe pai.

## 🚀 Conceitos Aplicados no Projeto

* **Classe Abstrata (`Animal`)**: Atua como a superclasse progenitora, definindo atributos protegidos (`peso`, `idade`, `membros`) e assinando as ações abstratas que todo animal é obrigado a fazer, mas sem ditar o *como*.
* **Anotação `@Override**`: Utilizada explicitamente nas subclasses para indicar ao compilador que os métodos herdados estão sendo intencionalmente redefinidos.
* **Polimorfismo de Segundo Nível**: Demonstração de especialização de subclasses já derivadas:
* `Canguru` estende `Mamifero` e sobrescreve `locomover()` para **Saltando...**
* `Tartaruga` estende `Reptil` e sobrescreve `locomover()` para **andando beeem devaaagaar....**
* `Cachorro` estende `Mamifero` e sobrescreve `emitirSom()` para **AU! AU! AU!**


* **Métodos Exclusivos**: Inclusão de comportamentos específicos que não pertencem à árvore geral (ex: `soltarBolhas()` em Peixe, `usarBolsa()` em Canguru e `enterrarOsso()` em Cachorro).

## 📂 Estrutura das Classes

* `Animal.java` *(Abstract)*: Raiz da hierarquia.
* `Mamifero.java`, `Reptil.java`, `Peixe.java`, `Ave.java`: Subclasses diretas (Primeiro nível de herança).
* `Canguru.java`, `Cachorro.java`, `Cobra.java`, `Goldfish.java`, `Arara.java`, `Tartaruga.java`: Classes especializadas (Segundo nível de herança).
* `Principal_12.java`: Ponto de entrada do sistema onde os objetos são instanciados e o comportamento polimórfico é disparado.

## 💻 Exemplo de Saída no Console

O polimorfismo garante que, mesmo chamando o método `.locomover()` em objetos diferentes, cada um responda conforme a sua natureza:

```text
======================
MAMIFERO: 
Correndo
Mamando
som de mamifero
======================
CANGURU - MAMIFERO: 
Saltando...
Mamando
som de mamifero
Usando bolsa...
======================
TARTARUGA - REPTIL:
andando beeem devaaagaar....

```

## 📄 Licença

Este projeto está sob a licença MIT. Sinta-se livre para clonar, estudar e utilizar o código!

---

*Projeto desenvolvido por Roberto como parte do portfólio de estudos em Ciência da Computação e Engenharia de Software com Java.*

---
