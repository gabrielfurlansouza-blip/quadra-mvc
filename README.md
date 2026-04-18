# Sistema de Controle de Quadra (POO)

## Tabelas

### Cliente
- id
- nome
- telefone

### Horario
- id
- hora
- valor
- disponivel

### Aluguel
- id
- cliente
- lista de horarios
- valor total
- data

## Regras

- Não permitir cliente com nome vazio
- Não permitir horário com valor negativo
- Não permitir reservar horário já ocupado
- Calcular valor total automaticamente
- Permitir consulta de aluguéis por dia
