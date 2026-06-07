# Projeto de Software

Aplicação base para atividades da disciplina e projeto

### 🔗 Endereços Úteis

- [Swagger](http://localhost:8080/swagger-ui/index.html)
- [H2 Console](http://localhost:8080/h2-console)

### Descrição das User Stories

#### US01: Buscar usuários por nome

> **Como** usuário do sistema  
> **Quero** pesquisar usuários informando parte ou a totalidade de um nome  
> **Para** localizar rapidamente usuários cadastrados.

**Critérios de aceitação:**
- A busca deve retornar todos os usuários cujo nome contenha o termo informado.
- A busca não deve diferenciar letras maiúsculas e minúsculas.
- Caso não existam usuários correspondentes, uma lista vazia deve ser retornada.

---

#### US02: Buscar usuários por endereço

> **Como** usuário do sistema  
> **Quero** pesquisar usuários informando parte ou a totalidade de um endereço  
> **Para** localizar usuários residentes em uma determinada localidade.

**Critérios de aceitação:**
- A busca deve retornar todos os usuários cujo endereço contenha o termo informado.
- A busca não deve diferenciar letras maiúsculas e minúsculas.
- Caso não existam usuários correspondentes, uma lista vazia deve ser retornada.

---

#### US03: Ordenar resultados da busca por nome

> **Como** usuário do sistema  
> **Quero** que os resultados de uma busca sejam apresentados em ordem alfabética pelo nome do usuário  
> **Para** facilitar a localização e visualização das informações.

**Critérios de aceitação:**
- Todos os resultados retornados por uma busca devem estar ordenados alfabeticamente pelo atributo nome.
- A ordenação deve ocorrer independentemente do critério utilizado na busca (nome ou endereço).