# 🛒 Sistema de Gerenciamento de Produtos em Java

Este projeto é um sistema de gerenciamento de produtos, desenvolvido em **Java**, utilizando **Programação Orientada a Objetos (POO)**.  
Ele permite cadastrar produtos comuns, importados ou usados, e gerar **etiquetas de preço automaticamente**, incluindo taxas e datas de fabricação.

---

## 📋 Funcionalidades

- Cadastro de produtos **comuns**, **importados** e **usados**.  
- Para produtos importados: cálculo do preço final incluindo **taxa alfandegária**.  
- Para produtos usados: exibição da **data de fabricação** na etiqueta de preço.  
- Geração de **etiquetas de preço** formatadas para todos os produtos.  
- Armazenamento dos produtos em uma **lista dinâmica** (`ArrayList`).  
- Uso de **herança e polimorfismo** para diferenciar o comportamento das subclasses.  

---

## 🔹 Classes Principais

| Classe | Descrição |
|--------|-----------|
| `Produto` | Classe base com atributos `nome` e `preço`. Contém o método `etiquetaPreco()`. |
| `ProdutoImportado` | Subclasse de `Produto`. Adiciona `taxaAlfandega` e calcula o preço total. |
| `ProdutoUsado` | Subclasse de `Produto`. Adiciona `dataFabricacao` e exibe na etiqueta de preço. |
| `ProgramaPrincipal` | Classe principal. Lê dados do usuário e exibe as etiquetas de preço. |

---

## ⚙️ Tecnologias e Conceitos Aplicados

- Java SE 24+  
- Programação Orientada a Objetos (POO)  
- Herança e Polimorfismo (`@Override`)  
- Encapsulamento de atributos e métodos  
- Manipulação de listas (`ArrayList`)  
- Tratamento de datas (`SimpleDateFormat`)  
- Entrada de dados via console (`Scanner`)  

---

## 💡 Exemplo de Execução

**Entrada:**

Insira o número de produtos: 3

Dados do 1 produto:

Produto comum, usado ou importado (C/U/I)? C

Nome: Notebook

Preco: 3500
---

Dados do 2 produto:

Produto comum, usado ou importado (C/U/I)? I

Nome: Celular

Preco: 2000

Taxa alfandega: 150
---

Dados do 3 produto:

Produto comum, usado ou importado (C/U/I)? U

Nome: Tablet

Preco: 1200

Data fabricacao (DD/MM/YYYY): 15/03/2020

**Saída:**

ETIQUETA PRECOS:

Notebook $ 3500.00

Celular $ 2150.00 (Taxa alfandegaria: $ 150.00)

Tablet (used) $ 1200.00 (Data fabricacao: 15/03/2020)
