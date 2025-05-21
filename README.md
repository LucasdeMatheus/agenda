# agenda
O intuito projeto é criar uma agenda que possa servir tanto para uso empreserial quanto para uso pessoal.

## Estrutura do Projeto 🗂️
```
src/
└── main/
    └── java/
        └── com.myproject.agenda/<br>
            ├── config/
            │   └── ConfigCors.java
            │   → Configurações de CORS para permitir requisições de diferentes origens.
            │
            ├── controller/
            │   ├── AgendaController.java
            │   ├── ClientController.java
            │   └── UserController.java
            │   → Camada responsável por receber requisições HTTP e encaminhá-las para os serviços.
            │
            ├── infra/
            │   └── springdoc/
            │       ├── DadosTokenJWT.java
            │       ├── SecurityConfigurations.java
            │       ├── SecurityFilter.java
            │       └── TokenService.java
            │   → Camada de infraestrutura, contendo configurações de segurança e manipulação de tokens JWT.
            │
            ├── main/
            │   └── AgendaApplication.java
            │   → Classe principal responsável por inicializar a aplicação.
            │
            ├── calendar/
            │   ├── Calendar.java
            │   └── CalendarRepository.java
            │   → Entidade de calendário e seu repositório JPA.
            │
            ├── client/
            │   ├── Client.java
            │   └── ClientRepository.java
            │   → Entidade de cliente e seu repositório JPA.
            │
            ├── event/
            │   ├── Event.java
            │   └── EventRepository.java
            │   → Entidade de evento e seu repositório JPA.
            │
            └── user/
                ├── User.java
                └── UserRepository.java
                → Entidade de usuário e seu repositório JPA.
```
## 1 🗂️ Entidades do Sistemas

### 👤 User
```json
{
  "id": "long",
  "name": "string",
  "email": "string",
  "password": "string"
}
```
### 👥 Client
```json
{
  "id": "long",
  "name": "string",
  "email": "string",
  "phone": "string",
  "notes": "string"
}
```
### 📌 Event
```json
{
  "id": "long",
  "title": "string",
  "description": "string",
  "date": "YYYY-MM-DD",
  "time": "HH:MM",
  "duration": "number (minutes)",
  "status": "pending | confirmed | cancelled",
  "user_id": "string",
  "client_id": "string"
}
```
### 📚 Calendar
```json
{
  "year": 2025,
  "month": 5,
  "days": [
    {
      "day": 1,
      "events": [ ... ]
    },
    {
      "day": 2,
      "events": [ ... ]
    }
  ]
}
```
## 2 🃏 Funcionalidades

### 2.1 Login com senha (autenticação)
- **Endpoint**: `POST (/login)`
- **Corpo da requisição (JSON)**
```json
{
  "login": "user",
  "password": "********"
}
```

### 2.2 Cadastro de compromisso
- **Endpoint**: `POST (/events)`
- **Corpo da requisição (JSON)**:
```json
{
  // json a definir
}
```

### 2.3 Edição de eventos/agendamentos
- **Endpoint**: `PUT (/events/:id)`
- **Corpo da requisição (JSON)**:
```json
{
  // json a definir
}
```

### 2.4 Cancelamento de eventos/agendamentos
- **Endpoint**: `DELETE (/events/:id)`

### 2.5 Filtro por data, tipo, status
- **Endpoint**: `GET (/events?date=...&type=...&status=...)`
- Retornará uma lista dos dias consultados de acordo com o filtro.

### 2.6 Visualização em formato de calendário (semana/mês)
- **Endpoint**: `GET (/calendar)`
- Retornará um JSON estruturado em ano, meses e semanas.

### 2.7 Painel com lista de agendamentos
- **Endpoint**: `GET (/dashboard)`
- Retornará uma lista de todos os agendamentos.

### 2.8 Notas e tarefas 
- **Endpoint**: `POST (/notes)`
- **Corpo da requisição (JSON)**:
```json
{
  // json a definir
}
```

### 2.9 Cadastro de clientes
- **Endpoint**: `POST (/clients)`
- **Corpo da requisição (JSON)**:
```json
{
  // json a definir
}
```

### 2.10 Exportar dados para Excel
- **Endpoint**: `GET (/export)`
- Retornará um arquivo Excel contendo uma consulta.

### 2.11 Cadastro de feriados e indisponibilidades
- **Endpoint**: `POST (/holidays)`
- **Corpo da requisição (JSON)**:
```json
{
  // json a definir
}
```

-- isso é uuma prévia do projeto, pode haver futuras modificações.

## 🛠️ Ferramentas
- Intellij
- Java/SpringBoot
- Mysql WorkBench
- Insomnia(postman)
