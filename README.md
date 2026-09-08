# Exercícios de POO — Java
 
![Status](https://img.shields.io/badge/status-concluído-success)
![Linguagem](https://img.shields.io/badge/Java-SE-orange?logo=java)
![Licença](https://img.shields.io/badge/licença-MIT-green)
 
Repositório de exercícios práticos de **Programação Orientada a Objetos (POO) em Java**, composto por três domínios de problema independentes — aeroporto, banco e petshop — cada um explorando um conjunto específico de conceitos de POO: encapsulamento, herança, associação entre objetos e construtores.
 
Cada exercício foi desenvolvido em um dia, em sequência: **aeroporto** (05/09), **banco** (06/09) e **petshop** (07/09).
 
---
 
## Sumário
 
1. [Contexto Acadêmico](#contexto-acadêmico)
2. [Arquitetura e Estrutura do Repositório](#arquitetura-e-estrutura-do-repositório)
3. [Pré-requisitos e Dependências](#pré-requisitos-e-dependências)
4. [Guia de Instalação e Execução](#guia-de-instalação-e-execução)
5. [Exemplos de Uso](#exemplos-de-uso)
6. [Metodologia e Decisões de Design](#metodologia-e-decisões-de-design)
7. [Histórico de Desenvolvimento](#histórico-de-desenvolvimento)
8. [Licença e Contato](#licença-e-contato)
---
 
## Contexto Acadêmico
 
Este repositório reúne três exercícios independentes de fixação de POO em Java, cada um modelando um domínio de problema distinto para praticar um subconjunto específico de conceitos:
 
| Exercício | Conceitos praticados |
|---|---|
| `aeroporto` | Herança (`Pessoa` → `Piloto`/`Passageiro`), sobrescrita de método (`@Override`), associação entre objetos, encapsulamento |
| `banco` | Herança (`Transacao` → `Saque`/`Deposito`/`Pagamento`), modelagem de domínio sem implementação de regra de negócio |
| `petshop` | Herança (`Pessoa` → `Dono`/`Vet`), associação bidirecional entre pessoa e animal, encapsulamento |

---
 
## Arquitetura e Estrutura do Repositório
 
Cada exercício é um projeto Java independente, com seu próprio diretório `src/` (código-fonte) e `bin/` (artefatos compilados). Não há dependência de código entre os três diretórios.
 
```text
poo/
├── aeroporto/
│   ├── src/
│   │   ├── Pessoa.java          # Classe base (herança)
│   │   ├── Piloto.java          # Estende Pessoa
│   │   ├── Passageiro.java      # Estende Pessoa
│   │   ├── Aeronave.java
│   │   ├── Aeroporto.java
│   │   └── Principal.java       # Ponto de entrada (main) com demonstração
│   ├── bin/                     # Classes compiladas (.class)
│   ├── DiagramaClasse.md        # Diagrama de classes (Mermaid)
│   └── DiagramaStackHeap.md     # Diagrama de memória Stack/Heap (Mermaid)
│
├── banco/
│   ├── src/
│   │   ├── Conta.java
│   │   ├── Transacao.java       # Classe base (herança)
│   │   ├── Saque.java           # Estende Transacao
│   │   ├── Deposito.java        # Estende Transacao
│   │   ├── Pagamento.java       # Estende Transacao
│   │   └── CaixaEletronico.java
│   └── DiagramaClasse.md        # Diagrama de classes (Mermaid), conforme enunciado
│   # Sem classe Principal nesta versão — ver observação abaixo
│
└── petshop/
    ├── src/
    │   ├── Pessoa.java          # Classe base (herança)
    │   ├── Dono.java            # Estende Pessoa
    │   ├── Vet.java             # Estende Pessoa
    │   ├── Animal.java
    │   ├── Doenca.java
    │   └── Principal.java       # Ponto de entrada (main) com demonstração
    ├── bin/                     # Classes compiladas (.class)
    └── DiagramaClasse.md        # Diagrama de classes (Mermaid)
```
 
> **Observação sobre o escopo do exercício `banco`:** o enunciado deste exercício solicitava exclusivamente a criação das entidades e de seus relacionamentos em Java, conforme um diagrama de classes fornecido (reproduzido em `banco/DiagramaClasse.md`) — não solicitava a implementação da lógica de negócio dos métodos, nem uma classe `Principal` com demonstração executável. A ausência desses dois itens em `banco`, portanto, não representa uma lacuna em relação a `aeroporto`/`petshop`, e sim uma diferença de escopo entre os enunciados de cada exercício.
 
### Descrição dos domínios
 
**`aeroporto`** — Modela a relação entre pessoas (`Piloto`, `Passageiro`, ambos estendendo `Pessoa`), aeronaves e aeroportos. `Piloto` e `Passageiro` sobrescrevem o método `falar()` herdado de `Pessoa`, personalizando a mensagem conforme o papel de cada um. `Aeroporto` e os dois subtipos de `Pessoa` mantêm uma associação com `Aeronave`.
 
**`banco`** — Modela o domínio de operações bancárias: uma `Conta` realiza transações (`Saque`, `Deposito`, `Pagamento`), todas subclasses de `Transacao`. `CaixaEletronico` representa o ponto de autenticação de acesso à conta.
 
**`petshop`** — Modela a relação entre pessoas (`Dono`, `Vet`, ambos estendendo `Pessoa`), animais e doenças. `Dono` e `Vet` mantêm associação com `Animal`, e `Doenca` mantém associação com `Animal` para representar diagnósticos.
 
### Diagramas
 
Os três exercícios incluem diagramas de classe em formato Mermaid (`DiagramaClasse.md`). Em `aeroporto` e `petshop`, os diagramas foram elaborados como material de apoio ao design da solução; em `banco`, o diagrama corresponde à transcrição do próprio enunciado do exercício, que especificava a estrutura de classes a ser implementada. `aeroporto` inclui adicionalmente um diagrama de memória Stack/Heap (`DiagramaStackHeap.md`), ilustrando a alocação dos objetos instanciados em `Principal`.
 
> Os diagramas foram elaborados como material de apoio ao entendimento do design e podem apresentar pequenas divergências de nomenclatura de atributos em relação à versão final do código (ex.: nomes de campos ajustados durante a implementação). Em caso de divergência, o código-fonte é a referência correta.
 
---
 
## Pré-requisitos e Dependências
 
| Requisito | Especificação |
|---|---|
| JDK (Java Development Kit) | 25.0.4.1 |
| Bibliotecas externas | Nenhuma — utiliza exclusivamente a biblioteca padrão do Java (`java.time.LocalDate`, usada em `banco`) |
| Sistema de build | Não utilizado — compilação direta via `javac` |
 
---
 
## Guia de Instalação e Execução
 
Cada exercício é compilado e executado de forma independente. Os comandos abaixo assumem o terminal posicionado na raiz do repositório (`poo/`).
 
### Aeroporto
 
```bash
javac -d aeroporto/bin aeroporto/src/*.java
java -cp aeroporto/bin aeroporto.src.Principal
```
 
### Petshop
 
```bash
javac -d petshop/bin petshop/src/*.java
java -cp petshop/bin petshop.src.Principal
```
 
### Banco
 
```bash
javac -d banco/bin banco/src/*.java
```
 
> Não há comando de execução para `banco`: o enunciado deste exercício não solicitou uma classe `Principal` nem lógica de negócio funcional — apenas a criação das entidades e seus relacionamentos —, portanto apenas a compilação está disponível.
 
---
 
## Exemplos de Uso
 
### Aeroporto
 
A classe `Principal` instancia aeronaves, aeroportos, passageiros e pilotos, e invoca seus comportamentos:
 
```java
Aeronave aeronave1 = new Aeronave(150, "Boeing 737", 900.0);
Aeroporto aeroporto1 = new Aeroporto("Pista 1", "Portão A", "São Paulo", aeronave1);
Passageiro passageiro1 = new Passageiro("João", 123456789, 30, 2, aeronave1, "Rio de Janeiro", "12A");
Piloto piloto1 = new Piloto("Carlos", 111222333, 40, 12345, aeronave1, "Gol", 5);
 
aeroporto1.liberarPista();
aeronave1.decolar();
passageiro1.falar();
piloto1.pilotar();
```
 
**Saída esperada (trecho):**
 
```text
A Pista 1 do aeroporto da cidade de São Paulo está liberada para pouso e decolagem!
A aeronave Boeing 737 está decolando e atingindo a velocidade máxima de 900.0 km/h!
Olá, meu nome é João. Sou passageiro e estou viajando para Rio de Janeiro, no assento 12A, na aeronave Boeing 737
O piloto Carlos, cujo código ANAC é 12345, está pilotando a aeronave Boeing 737 em uma viagem de 5 horas de voo.
```
 
### Petshop
 
```java
Animal animal1 = new Animal("Rex", "cachorro", 20.5, 5, 0.6);
Doenca doenca1 = new Doenca(animal1, "raiva", "febre, agressividade", "vacinação", "alta", true);
Dono dono1 = new Dono(animal1, "João", "11122233344", 777777777, 30, "joao@email.com", "Rua Azul, 89", "engenheiro", "PetLovers", 1, 100.0);
 
dono1.informar();
doenca1.diagnosticar();
animal1.emitirSom();
```
 
**Saída esperada (trecho):**
 
```text
Eu sou João, tenho 30 anos.
Rex tem raiva, uma doença que apresenta os seguintes sintomas: febre, agressividade.
 O tratamento recomendado é: vacinação.
 A gravidade da doença é: alta.
 Transmissível: true
Rex, animal da espécie cachorro, está emitindo um som.
```
 
---
 
## Metodologia e Decisões de Design
 
**1. Herança para representar papéis distintos de uma mesma entidade base.**
Em `aeroporto` e `petshop`, `Pessoa` concentra os atributos comuns (`nome`, `cpf`, `idade`, e, em `petshop`, também `telefone` e `email`), enquanto `Piloto`/`Passageiro` e `Dono`/`Vet` adicionam atributos e comportamentos específicos de cada papel. Em `aeroporto`, `Piloto` e `Passageiro` sobrescrevem `falar()` — um exemplo direto de polimorfismo por sobrescrita, já que o mesmo método produz mensagens diferentes conforme o tipo concreto do objeto.
 
**2. Associação entre objetos, em vez de composição.**
`Aeroporto`, `Piloto` e `Passageiro` mantêm uma referência a `Aeronave` recebida via construtor, e não criam suas próprias instâncias — a `Aeronave` existe independentemente de quem a referencia. O mesmo padrão se repete em `petshop` (`Dono`/`Vet`/`Doenca` referenciando `Animal`) e seria o padrão esperado em `banco` (`Conta` referenciando `Transacao`, `CaixaEletronico` referenciando `Conta`).
 
**3. Inconsistência de encapsulamento entre atributos (observação técnica).**
Em `Aeronave`, o atributo `modelo` é `public`, enquanto `assentos` e `velocidadeMaxima` são `private` — o mesmo padrão se repete em `Animal.nome` (público) frente aos demais atributos (privados), e em `Passageiro.destino` (público). Essa inconsistência quebra o encapsulamento estrito nesses pontos específicos: qualquer classe externa pode ler e **alterar** `aeronave.modelo` diretamente, sem passar por um getter/setter. Como boa prática, o recomendável seria manter todos os atributos `private`, expondo acesso controlado via métodos, quando necessário.
 
**4. `banco` como exercício de modelagem estrutural fiel ao enunciado.**
O enunciado deste exercício (reproduzido em `banco/DiagramaClasse.md`) delimitava o escopo explicitamente à criação das entidades e de seus relacionamentos — não à implementação da lógica de negócio. A estrutura de classes, atributos, herança (`Transacao` → `Saque`/`Deposito`/`Pagamento`) e associações (`Conta` ◇— `Transacao[]`, `CaixaEletronico` → `Conta`) foi implementada em conformidade com o diagrama fornecido. Os métodos de `Conta` mantêm as assinaturas especificadas, com corpo mínimo (retorno fixo), consistente com o escopo solicitado.
 
**5. Adaptação pontual de tipo: `Date` → `LocalDate`.**
O diagrama do exercício `banco` especifica o tipo `Date` (`java.util.Date`) para os atributos e parâmetros de data. O código implementa `java.time.LocalDate` — a API de datas introduzida no Java 8 como substituta recomendada de `java.util.Date`, que é considerada legada (mutável, sem suporte nativo a fuso horário/imutabilidade). Essa é uma boa prática de implementação, ainda que represente uma pequena divergência literal em relação ao tipo indicado no diagrama.
 
---
 
## Histórico de Desenvolvimento
 
| Data | Exercício | Descrição |
|---|---|---|
| 05/09/2026 | `aeroporto` | Modelagem de aeroporto, aeronave, piloto e passageiro; herança a partir de `Pessoa`; sobrescrita de `falar()`; demonstração via `Principal`. |
| 06/09/2026 | `banco` | Modelagem das entidades e relacionamentos de conta bancária e transações (`Saque`, `Deposito`, `Pagamento`, herança de `Transacao`) em conformidade com o diagrama de classes do enunciado; escopo do exercício não incluía lógica de negócio nem demonstração executável. |
| 07/09/2026 | `petshop` | Modelagem de dono, veterinário, animal e doença; herança a partir de `Pessoa`; associação entre pessoa e animal; demonstração via `Principal`. |
 
---
 
## Licença e Contato
 
**Licença:** este projeto é distribuído sob a **Licença MIT**. Isso permite uso, cópia, modificação, fusão, publicação, distribuição, sublicenciamento e/ou venda de cópias do software, desde que o aviso de copyright e a nota de permissão sejam incluídos em todas as cópias ou partes substanciais do software. O software é fornecido "no estado em que se encontra", sem garantias de qualquer tipo. Recomenda-se a criação de um arquivo `LICENSE` na raiz do repositório com o texto oficial, disponível em [https://opensource.org/license/mit](https://opensource.org/license/mit).
 
**Autoria e manutenção:**
 
| Papel | Nome | Contato |
|---|---|---|
| Autoria | Emily Furtado | emyrhf.dev@gmail.com |
 
**Repositório:** https://github.com/emyrhf/Atividades-POO
