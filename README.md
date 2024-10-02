# 🧑‍💼 Sistema de Gerenciamento de Pessoas

Este projeto é uma implementação básica de herança em Java, onde modelamos dois tipos de pessoas: **Pessoa Física** e **Pessoa Jurídica**. Ele demonstra conceitos fundamentais como encapsulamento, herança e polimorfismo.

## 🚀 Funcionalidades

### **1. Classe Pessoa**
A classe base que contém os atributos comuns a todas as pessoas:
- `nome`
- `sobrenome`

### **2. Classe Fisica**
Esta classe herda de **Pessoa** e adiciona o atributo exclusivo para pessoa física:
- `CPF` (Cadastro de Pessoa Física)

### **3. Classe Juridico**
Herda de **Pessoa** e adiciona o atributo:
- `CNPJ` (Cadastro Nacional da Pessoa Jurídica)

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem principal utilizada.
- **Orientação a Objetos**: Com uso de herança e encapsulamento.

## 📋 Estrutura do Projeto

- **Pessoa**: A classe pai que armazena informações gerais.
- **Fisica**: Herda de **Pessoa** e adiciona o campo de CPF.
- **Juridico**: Herda de **Pessoa** e adiciona o campo de CNPJ.
- **Main**: O ponto de entrada do projeto, onde ocorre a criação dos objetos e a exibição de seus dados.

---

Este projeto é um exemplo simples, mas essencial, para entender como as hierarquias de classes funcionam em Java e como podemos criar sistemas mais organizados e reutilizáveis.
