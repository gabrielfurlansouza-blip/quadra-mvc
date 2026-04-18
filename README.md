# Sistema de Controle de Aluguel de Quadra (MVC)

## Descrição
Sistema desenvolvido utilizando o padrão arquitetural MVC (Model-View-Controller) para controle de aluguel de quadra esportiva.

## Tabelas (Entidades)

### Cliente
- nome
- telefone

### Horario
- hora
- valor
- disponivel

### Aluguel
- cliente
- lista de horarios
- valor total
- data

## Regras de Negócio

- Não permitir cadastrar cliente com nome vazio
- Não permitir cadastrar horário com valor negativo
- Não permitir reservar horário já ocupado
- Calcular automaticamente o valor total do aluguel
- Permitir múltiplos horários no mesmo aluguel
- Permitir consulta de aluguéis por data

## Arquitetura MVC

### Model
Responsável pelos dados e regras de negócio:
- Cliente
- Horario
- Aluguel

### Controller
Responsável por controlar o fluxo da aplicação:
- AluguelController

Funções:
- Adicionar aluguel
- Buscar aluguéis por data

### View
Responsável pela exibição das informações:
- AluguelView

## Funcionamento

O sistema separa responsabilidades:
- Model: lógica e dados
- Controller: controle das ações
- View: exibição

## Execução

Executar a classe Main para simular um aluguel utilizando o padrão MVC.
