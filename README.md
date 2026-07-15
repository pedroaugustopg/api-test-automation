# API Test Automation

Projeto de automação de testes de API desenvolvido com Java utilizando Rest Assured, JUnit 5 e Maven. O objetivo é validar endpoints REST por meio de testes 
automatizados, verificando status HTTP, estrutura da resposta, cabeçalhos, parâmetros de consulta e desempenho.

Este projeto foi desenvolvido para automação de testes de APIs REST utilizando boas práticas de organização, validação de respostas HTTP e estruturação de 
testes com Rest Assured e JUnit 5.

---

## Tecnologias

* Java
* Maven
* JUnit 5
* Rest Assured
* Hamcrest

---

## Estrutura do Projeto

```text
src
├── test
│   └── java
│       ├── tests
│       │   ├── GetPostsTest.java
│       │   ├── HeadersTest.java
│       │   ├── NegativeTest.java
│       │   ├── PerformanceTest.java
│       │   └── QueryParamsTest.java 
│       
└── pom.xml
```

---

## Funcionalidades

* Validação de Status Code
* Validação de Response Body
* Validação de Headers
* Validação de Content-Type
* Validação da estrutura do JSON
* Testes com Query Parameters
* Testes negativos
* Validação do tempo de resposta
* Extração de dados da resposta

---

## API Utilizada

```
https://jsonplaceholder.typicode.com
```

---

## Executando os Testes

Clone o repositório:

```bash
git clone <https://github.com/pedroaugustopg/api-test-automation>
```

Acesse a pasta do projeto:

```bash
cd <RestAssuredTest>
```

Execute os testes:

```bash
mvn clean test
```

---

## Dependências

* Rest Assured
* JUnit Jupiter
* Maven Surefire Plugin
* Hamcrest
