
# Avaliação Alunos

Programa feito como forma de estudo, é um cadastro de alunos Simples feito na linguagem Java



## Autores

- [@PabloVinicius](https://www.github.com/PabloViniciusSS)


## Rodando localmente

Clone o projeto

```bash
  git clone https://github.com/PabloViniciusSS/dados-alunos
```

É necessario ter o JDK instalado, foi utilizado o Maven para gerenciar os pacotes.
## Stack utilizada

**Back-end:** Java, Spring Data JPA, Spring Framework, Postgresql.



## 🛠 Habilidades
Java, Api Rest, Banco de Dados, Postgresql...


## Aprendizados

O que você aprendeu construindo esse projeto? Quais desafios você enfrentou e como você superou-os?

Absorve melhor como utilizar o JPA, como dividir as pastas do projeto para ficar mais coeso e facilitar o entendimento, Os desafios foi superados com estudo e testes.
## Documentação da API (Obs: onde tem a {id} coloca o id do aluno ou as avaliacoes ou matriculas, que deseja procurar).

#### Retorna todos os Alunos:

```http
  GET: /alunos
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `nome` | `string` | **Obrigatório**. Nome do Aluno|
| `cpf` | `string` | **Obrigatório**. CPF valido do Aluno|
| `bairro` | `string` | **Obrigatório**. Bairro do Aluno|
| `dataDeNascimento` | `string` | **Obrigatório**. Data de nascimento em pt-br |

#### Retorna um cliente especifico:

```http
  GET: /alunos/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do Aluno que você quer |




#### Retorna todas as avaliações:

```http
  GET: /avaliacoes
``` 


#### Para criar nova avaliação fisica:

```http
  POST: /avaliacoes
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `alunoId`      | `int` | **Obrigatório**. O Id do aluno que fez a avaliação |
| `peso`      | `double` | **Obrigatório**. O peso do aluno que fez a avaliação |
| `altura`      | `double` | **Obrigatório**. O altura do aluno que fez a avaliação |



#### Retorna todas as matricula:

```http
  GET: /matricula
```

#### Para criar nova matricula fisica:

```http
  POST: /matricula
```


| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `alunoId`      | `int` | **Obrigatório**. O Id do aluno |











## Variáveis de Ambiente

Para rodar esse projeto, você vai precisar adicionar o caminho do banco na pasta resource application.yml.


