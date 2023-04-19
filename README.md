# Sistema_Controle_Locacao_PampaLoca
## Trabalho Avaliativo I: Locadora de Veículos
## 1. Definição
A empresa PampaLoca & Cia LTDA contratou uma equipe de programadores para criar um programa, na linguagem Java, e com interface de terminal, para o controle da locação de carros que atenda aos seguintes requisitos:

- Clientes:
  - Operações: incluir um cliente, excluir um cliente, editar dados de um cliente e listar todos os clientes;
  - Dados: nome, CNH, telefone e CPF;
  - Exemplo: 
    - Nome: João da Silva Tedesco;
    - CNH: 5482156;
    - Telefone: (55)3325-2525;
    - CPF: 02408925469.
  - Restrições:
    - Não deve ser possível excluir um cliente atrelado à uma locação, ou seja, se a um cliente estiver atrelado a um veículo locado;
    - A chave para buscar um cliente deve ser o seu CPF;
    - A listagem deve ser possível em ambos os sentidos, isto é, do início para o final da lista e vice-versa.
  - Observações
    - Não é necessário implementar validações nos dados, por exemplo, se um CPF é válido ou não. 

- Veículos:
  - Operações: incluir um veículo, excluir um veículo, editar dados de um veículo e listar todos os veículos;
  - Dados: placa, modelo, marca, ano, potencia, número de lugares, categoria
  - Exemplo 1:
    - Placa: IVI-5T72;
    - Modelo: Camaro;
    - Ano: 2012;
    - Potência: 450;
    - Lugares: 4;
    - Marca: Chevrolet;
    - Categoria: esportivo;
  - Exemplo 2:
    - Placa: IVJ-5B65;
    - Modelo: Civic;
    - Ano: 2020;
    - Potência: 155;
    - Lugares: 5;
    - Marca: Honda
    - Categoria: sedan médio;
  - Restrições:
    - Não deve ser possível excluir um veículo atrelado à uma locação;
    - A chave para buscar um veículo deve ser a sua placa;
    - A listagem deve ser possível em ambos os sentidos, isto é, do início para o final da lista e vice-versa;
    - A categoria deve ser definida a partir de uma lista de categorias previamente cadastradas no sistema (veja exemplos logo abaixo).
- Categorias:
  - Operações: incluir categoria, editar categoria, excluir categoria, listar categorias;
  - Dados: nome, identificador;
  - Exemplo 1:
    - Nome: esportivo;
    - Identificador: 1010;
  - Exemplo 2:
    - Nome: sedan compacto;
    - Identificador: 1011;
  - Exemplo 3:
    - Nome: sedan médio;
    - Identificador: 1012;
  - Restrições:
      - Não deve ser possível excluir categorias às quais existam veículos atrelados;
      - A chave para buscar uma categoria deve ser o seu identificador;
- Locações:
  - Operações: locar veículo (incluir locação), devolver veículo (excluir locação), listar todas as locações ativas;
  - Dados: CNH do cliente locador, a placa do veículo disponível para locação, data da retirada, data de devolução, valor a ser pago;
  - Restrições:
    - Para devolver um veículo (excluir locação), informar a placa de veículo;
    - Deve ser possível consultar os veículos não locados (disponíveis) antes de iniciar a locação, ou seja, todos aqueles que não constam na lista de locações. Ainda, o programa deve possibilitar um filtro por potência, número de lugares e/ou categoria desses veículos disponíveis e esses veículos devem ser exibidos em ordem decrescente ou crescente de acordo com a escolha do usuário;
    
## Grupo: Danielly C. N. do Carmo, Milena S. Ferreira e Sabrina R. Fernandes
