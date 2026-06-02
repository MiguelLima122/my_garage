# Minha Garagem - API RESTful 🚗

Uma API RESTful completa e estruturada para o gerenciamento, cadastro e controle de veículos. Este projeto foi desenvolvido de forma autoral com o objetivo de consolidar conceitos avançados de persistência de dados, mapeamento objeto-relacional e boas práticas de arquitetura na plataforma Java.

## Tecnologias Utilizadas

*   **Java 21:** Versão moderna da linguagem para desenvolvimento com recursos atualizados.
*   **Spring Boot 3.x:** Framework base para a construção acelerada e configuração automática da aplicação.
*   **Spring Data JPA:** Abstração para facilitação e controle da camada de persistência de dados.
*   **Hibernate:** Mecanismo de ORM (Mapeamento Objeto-Relacional) para conversão das entidades Java em tabelas.
*   **H2 Database:** Banco de dados relacional em memória utilizado para agilidade no ambiente de desenvolvimento.
*   **Maven:** Gerenciador de dependências e automação do ciclo de vida da aplicação.

## Conceitos e Aprendizados Aplicados

*   **Arquitetura RESTful:** Implementação de endpoints organizados através dos métodos e padrões do protocolo HTTP (GET, POST, DELETE).
*   **Injeção de Dependências:** Desacoplamento de código utilizando as anotações nativas do ecossistema Spring (como `@Autowired` e `@RestController`).
*   **Estratégias de Carregamento (Eager e Lazy Loading):** Estudo de performance e impacto na aplicação para o carregamento imediato ou sob demanda de dados relacionados no JPA/Hibernate.
*   **Encapsulamento e Boas Práticas de Entidades:** Configuração manual e explícita de construtores e métodos seletores (Getters/Setters) para proteção das regras de negócio e controle do ID autogerado, evitando o uso indiscriminado de ferramentas de geração automática.

## Rotas da API

A API expõe os seguintes endpoints mapeados a partir da URL base `/api/carros`:

| Método | Endpoint | Descrição | Status de Sucesso |
| :--- | :--- | :--- | :--- |
| **GET** | `/api/carros` | Lista todos os veículos cadastrados na base. | `200 OK` |
| **POST** | `/api/carros` | Cadastra um novo veículo no banco de dados. | `201 Created` |
| **DELETE** | `/api/carros/{id}` | Remove um veículo específico através do ID informado. | `204 No Content` |

### Exemplo de Corpo JSON para Cadastro (POST):
```json
{
  "marca": "Fiat",
  "modelo": "Uno",
  "ano": 2007,
  "placa": "ABC1D23"
}
