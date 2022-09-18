# PrikkasApi
- Api para manipulação de dados do banco
---------------------------------------------------------------------------------------------------------------------------------------------------- 

## Descrição: 
- O App será desenvolvido em React Native sendo compatível tanto para Android como para IOS que se comunicará com a Api via Json.

- As APIs estarão na nuvem (Azure) e serão feitas em Java, as Api deverão enviar o comando para a Machine Learning.

- Esta Api está sendo feita apenas para manipulação de informações do Banco de Dados.

- Ela deverá receber informações do App em React-native para realizar o cadastro e alterações de informações do banco de dados Oracle.

---------------------------------------------------------------------------------------------------------------------------------------------------- 

# EndPoints

  | Método  | EndPoint | Função |
| ------------- | ------------- | ------------- |
|GET  |http://localhost:8080/api/tipopagamento                | Retona todo os tipos de pagamentos cadastrados |
|POST |http://localhost:8080/api/tipopagamento                | Cadastra um novo tipo de pagamento |
|GET  |http://localhost:8080/api/tipopagamento/{id}           | Retona um  tipo de pagamento  |
|PUT |http://localhost:8080/api/tipopagamento/{id}            | Altera um tipo de pagamento |
|DELETE |http://localhost:8080/api/tipopagamento/{id}         | Agaga um tipo de pagamento |
|GET  |http://localhost:8080/api/cardapio                     | Retona todo os cardapio cadastrados |
|POST |http://localhost:8080/api/cardapio                     | Cadastra um novo cardapio |
|GET  |http://localhost:8080/api/cardapio/{id}                | Retona um  cardapio  |
|PUT |http://localhost:8080/api/cardapio/{id}                 | Altera um cardapio |
|DELETE |http://localhost:8080/api/cardapio/{id}              | Agaga um cardapio |
|GET  |http://localhost:8080/api/cliente                      | Retona todo os cliente cadastrados |
|POST |http://localhost:8080/api/cliente                      | Cadastra um novo cliente |
|GET  |http://localhost:8080/api/cliente/{id}                 | Retona um  cliente  |
|PUT |http://localhost:8080/api/cliente/{id}                  | Altera um cliente |
|DELETE |http://localhost:8080/api/cliente/{id}               | Agaga um cliente |
|GET  |http://localhost:8080/api/carrinho                     | Retona todo os carrinho cadastrados |
|POST |http://localhost:8080/api/carrinho                     | Cadastra um novo carrinho |
|GET  |http://localhost:8080/api/carrinho/{id}                | Retona um   carrinho |
|PUT |http://localhost:8080/api/carrinho/{id}                 | Altera um carrinho |
|DELETE |http://localhost:8080/api/carrinho/{id}              | Agaga um carrinho |
|GET  |http://localhost:8080/api/endereco                     | Retona todo os endereços |
|POST |http://localhost:8080/api/endereco                     | Cadastra um novo endereço |
|GET  |http://localhost:8080/api/endereco/{id}                | Retona um  endereço  |
|PUT |http://localhost:8080/api/endereco/{id}                 | Altera um endereço |
|DELETE |http://localhost:8080/api/endereco/{id}              | Agaga um endereço |
|GET  |http://localhost:8080/api/enderecoRestaurante          | Retona todo os vinculos endereços / restaurante |
|POST |http://localhost:8080/api/enderecoRestaurante          | Cadastra vincula o restaurante a um endereço |
|GET  |http://localhost:8080/api/enderecoRestaurante/{id}     | Retona um endereço vinculado a um restaurante|
|PUT |http://localhost:8080/api/enderecoRestaurante/{id}      | Altera um endereço vinculado no restaurante |
|DELETE |http://localhost:8080/api/enderecoRestaurante/{id}   | desvincula endereço do restaurante |
|GET    |http://localhost:8080/api/pedido           | Retona todo os pedido  |
|POST   |http://localhost:8080/api/pedido           | Cadastra um novo pedido  |
|GET    |http://localhost:8080/api/pedido/{id}      | Retona um  pedido   |
|PUT    |http://localhost:8080/api/pedido/{id}      | Altera um pedido  |
|DELETE |http://localhost:8080/api/pedido/{id}      | Agaga um pedido  |
|GET    |http://localhost:8080/api/restaurante           | Retona todo os restaurante  |
|POST   |http://localhost:8080/api/restaurante           | Cadastra um novo restaurante  |
|GET    |http://localhost:8080/api/restaurante/{id}      | Retona um  restaurante   |
|PUT    |http://localhost:8080/api/restaurante/{id}      | Altera um restaurante  |
|DELETE |http://localhost:8080/api/restaurante/{id}      | Agaga um restaurante  |
|GET    |http://localhost:8080/api/estado           | Retona todo os estado  |
|POST   |http://localhost:8080/api/estado           | Cadastra um novo estado  |
|GET    |http://localhost:8080/api/estado/{id}      | Retona um  estado   |
|PUT    |http://localhost:8080/api/estado/{id}      | Altera um estado  |
|DELETE |http://localhost:8080/api/estado/{id}      | Agaga um estado  |
|GET    |http://localhost:8080/api/telefone           | Retona todo os telefone  |
|POST   |http://localhost:8080/api/telefone           | Cadastra um novo telefone  |
|GET    |http://localhost:8080/api/telefone/{id}      | Retona um  telefone   |
|PUT    |http://localhost:8080/api/telefone/{id}      | Altera um telefone  |
|DELETE |http://localhost:8080/api/telefone/{id}      | Agaga um telefone  |
|GET    |http://localhost:8080/api/telefoneCliente/          | Retona todo os vinculos telefone / cliente |
|POST   |http://localhost:8080/api/telefoneCliente/          | Cadastra vincula o cliente a um telefone |
|GET    |http://localhost:8080/api/telefoneCliente/{id}      | Retona um telefone vinculado a um cliente|
|PUT    |http://localhost:8080/api/telefoneCliente/{id}      | Altera um telefone vinculado no cliente |
|DELETE |http://localhost:8080/api/telefoneCliente/{id}      | desvincula telefone do cliente |
|GET    |http://localhost:8080/api/telefoneRestaurante/          | Retona todo os vinculos telefone / restaurante |
|POST   |http://localhost:8080/api/telefoneRestaurante/          | Cadastra vincula o restaurante a um telefone |
|GET    |http://localhost:8080/api/telefoneRestaurante/{id}      | Retona um telefone vinculado a um restaurante|
|PUT    |http://localhost:8080/api/telefoneRestaurante/{id}      | Altera um telefone vinculado no restaurante |
|DELETE |http://localhost:8080/api/telefoneRestaurante/{id}      | desvincula telefone do restaurante |
|GET    |http://localhost:8080/api/enderecoCliente/          | Retona todo os vinculos endereço / cliente |
|POST   |http://localhost:8080/api/enderecoCliente/          | Cadastra vincula o cliente a um endereço |
|GET    |http://localhost:8080/api/enderecoCliente/{id}      | Retona um endereço vinculado a um cliente|
|PUT    |http://localhost:8080/api/enderecoCliente/{id}      | Altera um endereço vinculado no cliente |
|DELETE |http://localhost:8080/api/enderecoCliente/{id}      | desvincula endereço do cliente |
|GET    |http://localhost:8080/api/bairro/          | Retona todo os bairros  |
|POST   |http://localhost:8080/api/bairro/          | Cadastra um novo bairro  |
|GET    |http://localhost:8080/api/bairro/{id}      | Retona um  bairro   |
|PUT    |http://localhost:8080/api/bairro/{id}      | Altera um bairro  |
|DELETE |http://localhost:8080/api/bairro/{id}      | Agaga um bairro  |
|GET    |http://localhost:8080/api/cidade/          | Retona todas as cidades  |
|POST   |http://localhost:8080/api/cidade/          | Cadastra uma nova cidade  |
|GET    |http://localhost:8080/api/cidade/{id}      | Retona uma cidade  |
|PUT    |http://localhost:8080/api/cidade/{id}      | Altera uma cidade  |
|DELETE |http://localhost:8080/api/cidade/{id}      | Agaga uma cidade  |
|GET    |http://localhost:8080/api/pedidoitem/          | Retona todo os vinculos pedido / item |
|POST   |http://localhost:8080/api/pedidoitem/          | Cadastra vincula o item a um pedido |
|GET    |http://localhost:8080/api/pedidoitem/{id}      | Retona um pedido vinculado a um item|
|PUT    |http://localhost:8080/api/pedidoitem/{id}      | Altera um pedido vinculado no item |
|DELETE |http://localhost:8080/api/pedidoitem/{id}      | desvincula pedido do item |

---------------------------------------------------------------------------------------------------------------------------------------------------- 

## Arquitetura

<img src="/arquitetura.png" alt="My cool logo"/>

---------------------------------------------------------------------------------------------------------------------------------------------------- 

COMANDOS:

EXECUTAR:
```
./mvnw spring-boot:run
```

EMPACOTAR:
```
./mvnw package
```


CRIAR IMAGEM NO DOCKER:
  precisar esta logado no docker
```
docker build -t prikkas -f Dockerfile .
```


Executar o docker :
```
docker container run -it -p 8080:8080 --name prikkaApi prikkas
```

---------------------------------------------------------------------------------------------------------------------------------------------------- 

Api esta disponível para teste no heroku até o dia 27 de Novembro :

EX:
[API no Heroku](https://testeprikkas.herokuapp.com/api/cliente/)
