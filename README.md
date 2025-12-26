# 🚚 Sistema de Transportadora – Spring Boot

API REST desenvolvida em Java com Spring Boot para simular o funcionamento de uma transportadora, permitindo o cadastro de clientes, encomendas e o acompanhamento do status de entrega.

## 🧠 Objetivo do Projeto

Projeto criado com fins de **aprendizado**, focando em:
- Arquitetura em camadas
- Boas práticas com Spring Boot
- API REST
- Relacionamento entre entidades
- Versionamento com Git e GitHub

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Git & GitHub

## 🏗️ Arquitetura

O projeto segue o padrão de **arquitetura em camadas**:


- **Controller**: recebe as requisições HTTP
- **Service**: contém as regras de negócio
- **Repository**: acesso aos dados
- **Model**: entidades do sistema

## 📦 Funcionalidades

### 👤 Clientes
- Cadastrar cliente
- Listar clientes

### 📦 Encomendas
- Criar encomenda vinculada a um cliente
- Listar encomendas
- Atualizar status da encomenda
  - CRIADA
  - EM_TRANSPORTE
  - ENTREGUE

## 🌐 Endpoints Principais

### Clientes
- `POST /clientes`
- `GET /clientes`

### Encomendas
- `POST /encomendas`
- `GET /encomendas`
- `PUT /encomendas/{id}/status?status=EM_TRANSPORTE`

## 🧪 Exemplo de Requisição

### Criar Encomenda
```json
{
  "peso": 10.5,
  "origem": "São Paulo",
  "destino": "Recife",
  "cliente": {
    "id": 1
  }
}

```
## 📦 Como Executar o Projeto

```bash
# Clone o repositório
git clone [https://github.com/SEU_USUARIO/sistema-transportadora-springboot.git](https://github.com/SEU_USUARIO/sistema-transportadora-springboot.git)

# Entre na pasta do projeto
cd sistema-transportadora-springboot

# Execute a aplicação
./mvnw spring-boot:run
```
### disponível em: http://localhost:8080

### 🚀 Proximos Passos

    [ ] Implementar DTOs

    [ ] Adicionar validações

    [ ] Tratamento de exceções

    [ ] Migrar para PostgreSQL

    [ ] Autenticação com Spring Security

# 👨‍💻 Autor

Desenvolvido por Leonardo Góes

📌 Estudante de Engenharia de Software

☕ Focado em Java & Spring Boot
