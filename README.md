# Parking Control API 🚗

## Sobre o Projeto 📋

Gerenciar vagas de estacionamento em tempo real é um desafio comum, especialmente em áreas urbanas movimentadas ou grandes estabelecimentos. A falta de visibilidade sobre a disponibilidade de vagas frequentemente resulta em filas, atrasos e insatisfação dos usuários.

A **Parking Control API** é uma solução desenvolvida com **Spring Boot** para otimizar o controle de vagas de estacionamento. Com uma abordagem eficiente e automatizada, a API permite monitorar e gerenciar espaços de estacionamento de forma prática.

## Endpoints disponíveis 📡
Todos os endpoints estão sob /parking-spot
- POST /parking-spot
  - Descrição: Cria uma nova vaga de estacionamento
  - Permissão: role ROLE_ADMIN
  - Body: ParkingSpotDto (JSON)
- GET /parking-spot
  - Descrição: Lista todas as vagas de estacionamento (paginado)
  - Permissão: roles ROLE_ADMIN, ROLE_USER
  - Query params: page, size, sort
- GET /parking-spot/{id}
  - Descrição: Consulta uma vaga específica pelo ID
  - Permissão: roles ROLE_ADMIN, ROLE_USER
  - Path param: id (UUID)
- PUT /parking-spot/{id}
  - Descrição: Atualiza os dados de uma vaga pelo ID
  - Permissão: role ROLE_ADMIN
  - Body: ParkingSpotDto (JSON)
- DELETE /parking-spot/{id}
  - Descrição: Remove uma vaga de estacionamento
  - Permissão: role ROLE_ADMIN
  - Path param: id (UUID)

## Segurança 🔒

- A API utiliza autenticação e controle de acesso por papéis de usuário. O gerenciamento das permissões garante que apenas usuários adequados possam acessar, modificar ou remover informações do sistema.
