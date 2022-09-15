# PrikkasApi
------------------------------------------------------------------------------
  Api para manipulação de dados do banco


## Descrição: 

O App será desenvolvido em React Native sendo compatível tanto para Android como 
para IOS que se comunicará com a Api via Json.
As APIs estarão em nuvem (Azure) e serão feitas em Java, as Api deverão enviar o 
comando para a Machine Learning.

Esta Api esta sendo feita apenas para manipulação de informações do Banco de Dados.
Ela deverá receber informções do App em React-native para realizar o cadastro e alterações de informações do banco de dados Oracle.

# APIs

## Restaurante:
### Retorno de informações :
  Metodo **GET** 
  
  URL : **/api/restaurante**
  
  Resposta : deve restornar todos os restaurantes cadastrados de forma paginada.
  
Exemplo de requisição :
  
  ```
    localhost:8080/api/restaurante/
  ```
  
<details>
<summary>Exemplo de reponse:</summary><br>
{
	"content": [
		{
			"nomeRestaurante": "pocahontas",
			"desEmail": "poc@fiap.com.br",
			"idRestaurante": 3,
			"cnpj": "11830861000553"
		},
		{
			"nomeRestaurante": "PRIKKAS",
			"desEmail": "prikkas@fiap.com.br",
			"idRestaurante": 1,
			"cnpj": "11830861000113"
		}
	],
	"pageable": {
		"sort": {
			"empty": true,
			"sorted": false,
			"unsorted": true
		},
		"offset": 0,
		"pageSize": 50,
		"pageNumber": 0,
		"unpaged": false,
		"paged": true
	},
	"last": true,
	"totalElements": 2,
	"totalPages": 1,
	"size": 50,
	"number": 0,
	"sort": {
		"empty": true,
		"sorted": false,
		"unsorted": true
	},
	"first": true,
	"numberOfElements": 2,
	"empty": false
}
</details>

---------------------------------------------------------------------------------------------------------

  Metodo **GET** 
  
  URL : **/api/restaurante/{id}**
  
  Resposta : deve restornar o retaurante desse do {id}
  
  Exemplo de requisição :
  
  ```
    localhost:8080/api/restaurante/1
  ```
  
  Exemplo de resposta :
  
  ```
  {"nomeRestaurante":"PRIKKAS","desEmail":"prikkas@fiap.com.br","idRestaurante":1,"cnpj":"11830861000113"}
  ```
  
  -----------------------------------------------------------------------------------------------------------
  ### Cadastro
  
  Metodo **POST** 
  
  URL : **/api/restaurante**
    
    
| Campo do Json  | Tipo |
| ------------- | ------------- |
| nomeRestaurante  | String  |
| desEmail  | String  |
| cnpj  | String  |


  Exemplo de requisição :
  
  ```
  {			
   "nomeRestaurante": "pocahontas",
   "desEmail": "poc@fiap.com.br",
   "cnpj": "11830861000553"
}
  ```
  
  Função : deve cadastrar com um novo id o restaurante.
  
  Exemplo de reposta :
  ```
  {
	"nomeRestaurante": "pocahontas",
	"desEmail": "poc@fiap.com.br",
	"idRestaurante": 3,
	"cnpj": "11830861000553"
}
  ```

  ------------------------------------------------------------------------------------
  
### Alteração
  **Função** : Deve alterar as informações cadastradas do restaurante.
  Deve passa a URL com o id do restaurante que se quer alterar, no json deve informa o json existem na criação com as alterações desejadas.
  
  Metodo **PUT** 
  
  URL : **/api/restaurante/{id}**
    
    
| Campo do Json  | Tipo |
| ------------- | ------------- |
| nomeRestaurante  | String  |
| desEmail  | String  |
| cnpj  | String  |


  Exemplo de requisição :

  
```
  {			
   "nomeRestaurante": "pocahontas",
   "desEmail": "pocahontas@fiap.com.br",
   "cnpj": "11830861000553"
}
```
    
  Exemplo de reposta :
  ```
  {
"nomeRestaurante": "pocahontas",
"desEmail": "pocahontas@fiap.com.br",
"idRestaurante": 3,
"cnpj": "11830861000553"
}
  ```
  ----------------------------------------------------------------------------------------------------------------------------------------------------------
  ### Apaga
  
  **Função** : remove algum restaurante cadastrado.
  Deve passa a URL com o ID do restaurante a ser apagado.
  
  Metodo : **DELETE**
  
  URL : **/api/restaurante/{id}**
  
  Exemplo de requisição :
  ```
  localhost:8080/api/restaurante/6
  ```
  
  Deve retornar um 204 se der certo.
  
  -----------------------------------------------------------------------------------------------------------------------------------------------------------
  -----------------------------------------------------------------------------------------------------------------------------------------------------------
  
## Clientes:
### Retorno de informações :

   Metodo **GET** 
  
  URL : **/api/cliente**
  
  Resposta : deve restornar todos os clientes cadastrados de forma paginada.
  
Exemplo de requisição :
  
  ```
    localhost:8080/api/cliente
  ```
  
  <details>
<summary>Exemplo de resposta:</summary><br>
{
	"content": [
		{
			"id": 1,
			"nome": "Richard Rich",
			"cpf": 24388521000,
			"email": "rich@fiap.com.br"
		},
		{
			"id": 2,
			"nome": "Homem aranha",
			"cpf": 99,
			"email": "spider@fiap.com.br"
		}
	],
	"pageable": {
		"sort": {
			"empty": false,
			"sorted": true,
			"unsorted": false
		},
		"offset": 0,
		"pageNumber": 0,
		"pageSize": 50,
		"paged": true,
		"unpaged": false
	},
	"last": true,
	"totalElements": 2,
	"totalPages": 1,
	"size": 50,
	"number": 0,
	"sort": {
		"empty": false,
		"sorted": true,
		"unsorted": false
	},
	"first": true,
	"numberOfElements": 2,
	"empty": false
}
</details>


----------------------------------------------------------------------------------------------------------------------
  ### Cadastro
  
  **Função** : Cadastrar um novo cliente
  
  Metodo **POST** 
  
  URL : **/api/cliente**
  
  | Campo do Json  | Tipo |
| ------------- | ------------- |
| nome  | String  |
| cpf  | Integer  |
| email  | String  |


  Exemplo de requisição :
  
  ```
{
"nome": "Homem aranha",
"cpf": 99,
"email": "spider@fiap.com.br"
}
  ```
  
  Exemplo de reposta :
  ```
 {
"id": 2,
"nome": "Homem aranha",
"cpf": 99,
"email": "spider@fiap.com.br"
}
  ```
 ---------------------------------------------------------------------------------------------------------------------------------------------------
 ### Alteração
  **Função** : Deve alterar as informações cadastradas do cliente.
  Deve passa a URL com o id do cliente que se quer alterar, no json deve informa o json existem na criação com as alterações desejadas.
  
  Metodo **PUT** 
  
  URL : **/api/cliente/{id}**
    
    
| Campo do Json  | Tipo |
| ------------- | ------------- |
| nome  | String  |
| cpf  | Long  |
| email  | String  |


  Exemplo de requisição :

  
```
{
"nome": "TiraGosto",
"cpf": 3,
"email": "tira@fiap.com.br"
}
```
    
  Exemplo de reposta :
  ```
 {
"id": 3,
"nome": "TiraGosto",
"cpf": 3,
"email": "tira@fiap.com.br"
}
  ```
  
  --------------------------------------------------------------------------------------------------------------------------------------------------------
  
  ### Apaga
  
  **Função** : remove algum cliente cadastrado.
  Deve passa a URL com o ID do cliente a ser apagado.
  
  Metodo : **DELETE**
  
  URL : **/api/cliente/{id}**
  
  Exemplo de requisição :
  ```
  localhost:8080/api/cliente/2
  ```
  
  Deve retornar um 204 se der certo.
  
  -----------------------------------------------------------------------------------------------------------------------------------------------------------
  -----------------------------------------------------------------------------------------------------------------------------------------------------------
  ## Cardapio:
### Retorno de informações :

   Metodo **GET** 
  
  URL : **/api/cliente**
  
  Resposta : deve restornar todos o cardapio do restaurante de forma paginada.
  
Exemplo de requisição :
  
  ```
    localhost:8080/api/cardapio
  ```
  
  <details>
<summary>Exemplo de resposta:</summary><br>
{
	"content": [
		{
			"idCardapio": 4,
			"idRetaurent": 1,
			"nomeItem": "macarrão",
			"preco": 5,
			"descricao": "sem gosto",
			"foto": null
		},
		{
			"idCardapio": 5,
			"idRetaurent": 1,
			"nomeItem": "pão com queijo",
			"preco": 5,
			"descricao": "pão e queijo",
			"foto": null
		}
	],
	"pageable": {
		"sort": {
			"empty": true,
			"sorted": false,
			"unsorted": true
		},
		"offset": 0,
		"pageSize": 50,
		"pageNumber": 0,
		"paged": true,
		"unpaged": false
	},
	"last": true,
	"totalElements": 2,
	"totalPages": 1,
	"size": 50,
	"number": 0,
	"sort": {
		"empty": true,
		"sorted": false,
		"unsorted": true
	},
	"first": true,
	"numberOfElements": 2,
	"empty": false
}
</details>


----------------------------------------------------------------------------------------------------------------------
  ### Cadastro
  
  **Função** : Cadastrar um novo prato no cardapio
  
  Metodo **POST** 
  
  URL : **/api/cardapio**
  
  | Campo do Json  | Tipo |
| ------------- | ------------- |
| idRetaurent  | Long  |
| nomeItem  | String  |
| preco  | Long  |
| descricao  | String  |
| foto  | blob  |


  Exemplo de requisição :
  
  ```
{
"idRetaurent": 1,
"nomeItem": "fejoada",
"preco": 5.3,
"descricao": "arroz e feijão",
"foto": null
}
  ```
  
  Exemplo de reposta :
  ```
{
"idCardapio": 9,
"idRetaurent": 1,
"nomeItem": "fejoada",
"preco": 5,
"descricao": "arroz e feijão",
"foto": null
}
  ```
 ---------------------------------------------------------------------------------------------------------------------------------------------------
 ### Alteração
  **Função** : Deve alterar as informações do cardapio do restaurante.
  Deve passa a URL com o id do cardapio que se quer alterar, no json deve informa o json existem na criação com as alterações desejadas.
  
  Metodo **PUT** 
  
  URL : **/api/cardapio/{id}**
    
    
 | Campo do Json  | Tipo |
| ------------- | ------------- |
| idRetaurent  | Long  |
| nomeItem  | String  |
| preco  | Long  |
| descricao  | String  |
| foto  | blob  |


  Exemplo de requisição :

  
```
{
"idRetaurent": 1,
"nomeItem": "fejoada",
"preco": 5.3,
"descricao": "arroz e feijão e bacon",
"foto": null
}
```
    
  Exemplo de reposta :
  ```
{
	"idCardapio": 9,
	"idRetaurent": 1,
	"nomeItem": "fejoada",
	"preco": 5,
	"descricao": "arroz e feijão",
	"foto": null
}
  ```
  
  --------------------------------------------------------------------------------------------------------------------------------------------------------
  
  ### Apaga
  
  **Função** : remove algum prato cadastrado.
  Deve passa a URL com o ID do cardapio a ser apagado.
  
  Metodo : **DELETE**
  
  URL : **/api/cardapio/{id}**
  
  Exemplo de requisição :
  ```
  localhost:8080/api/cardapio/2
  ```
  
  Deve retornar um 204 se der certo.
  
  -----------------------------------------------------------------------------------------------------------------------------------------------------------
  -----------------------------------------------------------------------------------------------------------------------------------------------------------
  ## Endereco:
### Retorno de informações :

   Metodo **GET** 
  
  URL : **/api/endereco**
  
  Resposta : deve restornar todos o endereços de forma paginada.
  
Exemplo de requisição :
  
  ```
    localhost:8080/api/endereco
  ```
  
  <details>
<summary>Exemplo de resposta:</summary><br>
{
	"content": [
		{
			"idEndereco": 2,
			"cep": "17120970",
			"logradouro": "RUA BOLA , N 3",
			"bairro": "2"
		},
		{
			"idEndereco": 1,
			"cep": "90842355",
			"logradouro": "RUA 3 , N 9",
			"bairro": "1"
		},
		{
			"idEndereco": 3,
			"cep": "6462999",
			"logradouro": "Rua José , número 71",
			"bairro": "2"
		}
	],
	"pageable": {
		"sort": {
			"empty": true,
			"sorted": false,
			"unsorted": true
		},
		"offset": 0,
		"pageNumber": 0,
		"pageSize": 50,
		"paged": true,
		"unpaged": false
	},
	"last": true,
	"totalElements": 3,
	"totalPages": 1,
	"size": 50,
	"number": 0,
	"sort": {
		"empty": true,
		"sorted": false,
		"unsorted": true
	},
	"first": true,
	"numberOfElements": 3,
	"empty": false
}
</details>
----------------------------------------------------------------------------------------------------------------------
  Metodo **GET** 
  
  URL : **/api/endereco/{id}**
  
  Resposta : deve restornar o retaurante desse do {id}
  
  Exemplo de requisição :
  
  ```
    localhost:8080/api/endereco/2
  ```
  
  Exemplo de resposta :
  
  ```
  {
"idEndereco": 2,
"cep": "17120970",
"logradouro": "RUA BOLA , N 3",
"bairro": "2"
}
  ```

----------------------------------------------------------------------------------------------------------------------
  ### Cadastro
  
  **Função** : Cadastrar um novo endereço.
  
  Metodo **POST** 
  
  URL : **/api/endereco**
  
  | Campo do Json  | Tipo |
| ------------- | ------------- |
| cep  | String  |
| logradouro  | String  |
| bairro  | Long  |


  Exemplo de requisição :
  
  ```
{
"cep": "06462909",
"logradouro": "Rua José , número 71",
"bairro": "2"
}
  ```
  
  Exemplo de reposta :
  ```
{
"idEndereco": 4,
"cep": "06462909",
"logradouro": "Rua José , número 71",
"bairro": "2"
}
  ```
 ---------------------------------------------------------------------------------------------------------------------------------------------------
 ### Alteração
  **Função** : Deve alterar as informações do endereço
  Deve passa a URL com o id do endereço que se quer alterar, no json deve informa o json existem na criação com as alterações desejadas.
  
  Metodo **PUT** 
  
  URL : **/api/endereco/{id}**
    
    
  | Campo do Json  | Tipo |
| ------------- | ------------- |
| cep  | String  |
| logradouro  | String  |
| bairro  | Long  |


  Exemplo de requisição :

  
```
{
"cep": "06462909",
"logradouro": "Rua José , número 71",
"bairro": "2"
}
```
    
  Exemplo de reposta :
  ```
{
"idEndereco": 4,
"cep": "06462909",
"logradouro": "Rua José , número 71",
"bairro": "2"
}
  ```
  
  --------------------------------------------------------------------------------------------------------------------------------------------------------
  
  ### Apaga
  
  **Função** : remove algum endereço.
  Deve passa a URL com o ID do endereço a ser apagado.
  
  Metodo : **DELETE**
  
  URL : **/api/endereco/{id}**
  
  Exemplo de requisição :
  ```
  localhost:8080/api/endereco/2
  ```
  
  Deve retornar um 204 se der certo.
  
  -----------------------------------------------------------------------------------------------------------------------------------------------------------
  -----------------------------------------------------------------------------------------------------------------------------------------------------------
  
  ## Telefone:
### Retorno de informações :

   Metodo **GET** 
  
  URL : **/api/telefone**
  
  Resposta : deve restornar todos o telefones de forma paginada.
  
Exemplo de requisição :
  
  ```
    localhost:8080/api/telefone
  ```
  
  <details>
<summary>Exemplo de resposta:</summary><br>
{
	"content": [
		{
			"idTelefone": 3,
			"nrTelefone": 11998877,
			"nrDDD": 11,
			"nrDDI": 55,
			"descricao": "CELULAR"
		},
		{
			"idTelefone": 1,
			"nrTelefone": 191,
			"nrDDD": 111,
			"nrDDI": 222,
			"descricao": "TIM"
		},
		{
			"idTelefone": 2,
			"nrTelefone": 97793821,
			"nrDDD": 11,
			"nrDDI": 55,
			"descricao": "CELULAR"
		},
		{
			"idTelefone": 4,
			"nrTelefone": 11991177,
			"nrDDD": 11,
			"nrDDI": 55,
			"descricao": "CELULAR"
		}
	],
	"pageable": {
		"sort": {
			"empty": true,
			"sorted": false,
			"unsorted": true
		},
		"offset": 0,
		"pageNumber": 0,
		"pageSize": 50,
		"paged": true,
		"unpaged": false
	},
	"last": true,
	"totalElements": 4,
	"totalPages": 1,
	"size": 50,
	"number": 0,
	"sort": {
		"empty": true,
		"sorted": false,
		"unsorted": true
	},
	"first": true,
	"numberOfElements": 4,
	"empty": false
}
</details>
----------------------------------------------------------------------------------------------------------------------
  Metodo **GET** 
  
  URL : **/api/telefone/{id}**
  
  Resposta : deve restornar o telefones desse do {id}
  
  Exemplo de requisição :
  
  ```
    localhost:8080/api/telefone/3
  ```
  
  Exemplo de resposta :
  
  ```
 {
	"idTelefone": 3,
	"nrTelefone": 11998877,
	"nrDDD": 11,
	"nrDDI": 55,
	"descricao": "CELULAR"
}
  ```

----------------------------------------------------------------------------------------------------------------------
  ### Cadastro
  
  **Função** : Cadastrar um novo telefone.
  
  Metodo **POST** 
  
  URL : **/api/telefone**
  
  | Campo do Json  | Tipo |
| ------------- | ------------- |
| nrTelefone  | Long  |
| nrDDD  | Long  |
| nrDDI  | Long  |
| descricao  | String  |


  Exemplo de requisição :
  
  ```
{	
"nrTelefone": 11991177,
"nrDDD": 11,
"nrDDI": 55,
"descricao": "CELULAR"
}
  ```
  
  Exemplo de reposta :
  ```
{
	"idTelefone": 4,
	"nrTelefone": 11991177,
	"nrDDD": 11,
	"nrDDI": 55,
	"descricao": "CELULAR"
}
  ```
 ---------------------------------------------------------------------------------------------------------------------------------------------------
 ### Alteração
  **Função** : Deve alterar as informações do telefone
  Deve passa a URL com o id do telefone que se quer alterar, no json deve informa o json existem na criação com as alterações desejadas.
  
  Metodo **PUT** 
  
  URL : **/api/telefone/{id}**
    
    
  | Campo do Json  | Tipo |
| ------------- | ------------- |
| nrTelefone  | Long  |
| nrDDD  | Long  |
| nrDDI  | Long  |
| descricao  | String  |


  Exemplo de requisição :

  
```
{	
"nrTelefone": 11991177,
"nrDDD": 11,
"nrDDI": 55,
"descricao": "CELULAR"
}
```
    
  Exemplo de reposta :
  ```
{
	"idTelefone": 4,
	"nrTelefone": 11991177,
	"nrDDD": 11,
	"nrDDI": 55,
	"descricao": "CELULAR"
}
  ```
  
  --------------------------------------------------------------------------------------------------------------------------------------------------------
  
  ### Apaga
  
  **Função** : remove algum telefone.
  Deve passa a URL com o ID do telefone a ser apagado.
  
  Metodo : **DELETE**
  
  URL : **/api/telefone/{id}**
  
  Exemplo de requisição :
  ```
  localhost:8080/api/telefone/2
  ```
  
  Deve retornar um 204 se der certo.
  
  -----------------------------------------------------------------------------------------------------------------------------------------------------------
  -----------------------------------------------------------------------------------------------------------------------------------------------------------
  ## Estado:
### Retorno de informações :

   Metodo **GET** 
  
  URL : **/api/estado**
  
  Resposta : deve restornar todos o estado de forma paginada.
  
Exemplo de requisição :
  
  ```
    localhost:8080/api/estado
  ```
  
  <details>
<summary>Exemplo de resposta:</summary><br>
{
	"content": [
		{
			"idEstado": 1,
			"nome": "ACRE",
			"sigle": "AC"
		},
		{
			"idEstado": 2,
			"nome": "ALAGOAS",
			"sigle": "AL"
		},
		{
			"idEstado": 3,
			"nome": "AMAPÁ",
			"sigle": "AP"
		},
		{
			"idEstado": 4,
			"nome": "AMAZONAS",
			"sigle": "AM"
		},
		{
			"idEstado": 5,
			"nome": "BAHIA",
			"sigle": "BA"
		},
		{
			"idEstado": 6,
			"nome": "CEARÁ",
			"sigle": "CE"
		},
		{
			"idEstado": 7,
			"nome": "DISTRITO FEDERAL",
			"sigle": "DF"
		},
		{
			"idEstado": 8,
			"nome": "ESPÍRITO SANTO",
			"sigle": "ES"
		},
		{
			"idEstado": 9,
			"nome": "GOIÁS",
			"sigle": "GO"
		},
		{
			"idEstado": 10,
			"nome": "MARANHÃO",
			"sigle": "MA"
		},
		{
			"idEstado": 11,
			"nome": "MATO GROSSO",
			"sigle": "MT"
		},
		{
			"idEstado": 12,
			"nome": "MATO GROSSO DO SUL",
			"sigle": "MS"
		},
		{
			"idEstado": 13,
			"nome": "MINAS GERAIS",
			"sigle": "MG"
		},
		{
			"idEstado": 14,
			"nome": "PARÁ",
			"sigle": "PA"
		},
		{
			"idEstado": 15,
			"nome": "PARAÍBA",
			"sigle": "PB"
		},
		{
			"idEstado": 16,
			"nome": "PARANÁ",
			"sigle": "PR"
		},
		{
			"idEstado": 17,
			"nome": "PERNAMBUCO",
			"sigle": "PE"
		},
		{
			"idEstado": 18,
			"nome": "PIAUÍ",
			"sigle": "PI"
		},
		{
			"idEstado": 19,
			"nome": "RIO DE JANEIRO",
			"sigle": "RJ"
		},
		{
			"idEstado": 20,
			"nome": "RIO GRANDE DO NORTE",
			"sigle": "RN"
		},
		{
			"idEstado": 21,
			"nome": "RIO GRANDE DO SUL",
			"sigle": "RS"
		},
		{
			"idEstado": 22,
			"nome": "RONDÔNIA",
			"sigle": "RO"
		},
		{
			"idEstado": 23,
			"nome": "RORAIMA",
			"sigle": "RR"
		},
		{
			"idEstado": 24,
			"nome": "SANTA CATARINA",
			"sigle": "SC"
		},
		{
			"idEstado": 25,
			"nome": "SÃO PAULO",
			"sigle": "SP"
		},
		{
			"idEstado": 26,
			"nome": "SERGIPE",
			"sigle": "SE"
		},
		{
			"idEstado": 27,
			"nome": "TOCANTINS",
			"sigle": "TO"
		}
	],
	"pageable": {
		"sort": {
			"empty": true,
			"sorted": false,
			"unsorted": true
		},
		"offset": 0,
		"pageNumber": 0,
		"pageSize": 50,
		"paged": true,
		"unpaged": false
	},
	"last": true,
	"totalElements": 27,
	"totalPages": 1,
	"size": 50,
	"number": 0,
	"sort": {
		"empty": true,
		"sorted": false,
		"unsorted": true
	},
	"first": true,
	"numberOfElements": 27,
	"empty": false
}
</details>
----------------------------------------------------------------------------------------------------------------------
  Metodo **GET** 
  
  URL : **/api/estado/{id}**
  
  Resposta : deve restornar o estado desse do {id}
  
  Exemplo de requisição :
  
  ```
    localhost:8080/api/estado/3
  ```
  
  Exemplo de resposta :
  
  ```
{
	"idEstado": 5,
	"nome": "BAHIA",
	"sigle": "BA"
}
  ```

----------------------------------------------------------------------------------------------------------------------
  ### Cadastro
  
  **Função** : Cadastrar um novo estado.
  
  Metodo **POST** 
  
  URL : **/api/estado**
  
  | Campo do Json  | Tipo |
| ------------- | ------------- |
| nome  | String  |
| sigle  | String  |


  Exemplo de requisição :
  
  ```
{
	"nome": "BAHIA",
	"sigle": "BA"
}
  ```
  
  Exemplo de reposta :
  ```
{
	"idEstado": 5,
	"nome": "BAHIA",
	"sigle": "BA"
}
  ```
 ---------------------------------------------------------------------------------------------------------------------------------------------------
 ### Alteração
  **Função** : Deve alterar as informações do estado
  Deve passa a URL com o id do estado que se quer alterar, no json deve informa o json existem na criação com as alterações desejadas.
  
  Metodo **PUT** 
  
  URL : **/api/estado/{id}**
    
    
  | Campo do Json  | Tipo |
| ------------- | ------------- |
| nome  | String  |
| sigle  | String  |


  Exemplo de requisição :

  
```
{
	"nome": "BAHIA",
	"sigle": "BA"
}
```
    
  Exemplo de reposta :
  ```
{
	"idEstado": 5,
	"nome": "BAHIA",
	"sigle": "BA"
}
  ```
  
  --------------------------------------------------------------------------------------------------------------------------------------------------------
  
  ### Apaga
  
  **Função** : remove algum estado.
  Deve passa a URL com o ID do estado a ser apagado.
  
  Metodo : **DELETE**
  
  URL : **/api/estado/{id}**
  
  Exemplo de requisição :
  ```
  localhost:8080/api/estado/2
  ```
  
  Deve retornar um 204 se der certo.
  
  -----------------------------------------------------------------------------------------------------------------------------------------------------------
  -----------------------------------------------------------------------------------------------------------------------------------------------------------
  ## Carrinho:
### Retorno de informações :

   Metodo **GET** 
  
  URL : **/api/carrinho**
  
  Resposta : deve restornar todos o carrinhos de forma paginada.
  
Exemplo de requisição :
  
  ```
    localhost:8080/api/carrinho
  ```
  
  <details>
<summary>Exemplo de resposta:</summary><br>
{
	"content": [
		{
			"idPagamento": 999,
			"idPedido": 122345,
			"pagamento": "1",
			"idEndereco": "1",
			"tpPagamento": "1"
		},
		{
			"idPagamento": 1,
			"idPedido": 122345,
			"pagamento": "1",
			"idEndereco": "1",
			"tpPagamento": "1"
		},
		{
			"idPagamento": 2,
			"idPedido": 122345,
			"pagamento": "1",
			"idEndereco": "1",
			"tpPagamento": "1"
		},
		{
			"idPagamento": 3,
			"idPedido": 122345,
			"pagamento": "1",
			"idEndereco": "1",
			"tpPagamento": "1"
		},
		{
			"idPagamento": 4,
			"idPedido": 122345,
			"pagamento": "1",
			"idEndereco": "1",
			"tpPagamento": "1"
		},
		{
			"idPagamento": 5,
			"idPedido": 122345,
			"pagamento": "1",
			"idEndereco": "1",
			"tpPagamento": "1"
		},
		{
			"idPagamento": 6,
			"idPedido": 6,
			"pagamento": "1",
			"idEndereco": "1",
			"tpPagamento": "2"
		}
	],
	"pageable": {
		"sort": {
			"empty": true,
			"sorted": false,
			"unsorted": true
		},
		"offset": 0,
		"pageNumber": 0,
		"pageSize": 50,
		"paged": true,
		"unpaged": false
	},
	"last": true,
	"totalElements": 7,
	"totalPages": 1,
	"size": 50,
	"number": 0,
	"sort": {
		"empty": true,
		"sorted": false,
		"unsorted": true
	},
	"first": true,
	"numberOfElements": 7,
	"empty": false
}
</details>
----------------------------------------------------------------------------------------------------------------------
  Metodo **GET** 
  
  URL : **/api/carrinho/{id}**
  
  Resposta : deve restornar o carrinho desse do {id}
  
  Exemplo de requisição :
  
  ```
    localhost:8080/api/carrinho/3
  ```
  
  Exemplo de resposta :
  
  ```
{
	"idPagamento": 3,
	"idPedido": 122345,
	"pagamento": "1",
	"idEndereco": "1",
	"tpPagamento": "1"
}
  ```

----------------------------------------------------------------------------------------------------------------------
  ### Cadastro
  
  **Função** : Cadastrar um novo carrinho.
  
  Metodo **POST** 
  
  URL : **/api/carrinho**
  
  | Campo do Json  | Tipo |
| ------------- | ------------- |
| idPagamento  | Long  |
| idPedido  | Long  |
| pagamento  | String  |
| idEndereco  | String  |
| tpPagamento  | String  |



  Exemplo de requisição :
  
  ```
{
	"idPagamento": 6,
	"idPedido": 122345,
	"pagamento": "1",
	"idEndereco": "1",
	"tpPagamento": "2"
}
  ```
  
  Exemplo de reposta :
  ```
{
	"idPagamento": 6,
	"idPedido": 6,
	"pagamento": "1",
	"idEndereco": "1",
	"tpPagamento": "2"
}
  ```
 ---------------------------------------------------------------------------------------------------------------------------------------------------
 ### Alteração
  **Função** : Deve alterar as informações do carrinho
  Deve passa a URL com o id do carrinho que se quer alterar, no json deve informa o json existem na criação com as alterações desejadas.
  
  Metodo **PUT** 
  
  URL : **/api/carrinho/{id}**
    
    
  | Campo do Json  | Tipo |
| ------------- | ------------- |
| idPagamento  | Long  |
| idPedido  | Long  |
| pagamento  | String  |
| idEndereco  | String  |
| tpPagamento  | String  |


  Exemplo de requisição :

  
```
{
	"idPagamento": 6,
	"idPedido": 122345,
	"pagamento": "1",
	"idEndereco": "1",
	"tpPagamento": "2"
}
```
    
  Exemplo de reposta :
  ```
{
	"idPagamento": 6,
	"idPedido": 122345,
	"pagamento": "1",
	"idEndereco": "1",
	"tpPagamento": "2"
}
  ```
  
  --------------------------------------------------------------------------------------------------------------------------------------------------------
  
  ### Apaga
  
  **Função** : remove algum carrinho.
  Deve passa a URL com o ID do carrinho a ser apagado.
  
  Metodo : **DELETE**
  
  URL : **/api/carrinho/{id}**
  
  Exemplo de requisição :
  ```
  localhost:8080/api/carrinho/2
  ```
  
  Deve retornar um 204 se der certo.
  
  -----------------------------------------------------------------------------------------------------------------------------------------------------------
  -----------------------------------------------------------------------------------------------------------------------------------------------------------
  
  ## Tipo de pagamento:
### Retorno de informações :

   Metodo **GET** 
  
  URL : **/api/tipopagamento**
  
  Resposta : deve restornar todos o tipo de pagamentos de forma paginada.
  
Exemplo de requisição :
  
  ```
    localhost:8080/api/tipopagamento
  ```
  
  <details>
<summary>Exemplo de resposta:</summary><br>
{
	"content": [
		{
			"idPagamento": 6,
			"descrição": "CRÉDITO"
		},
		{
			"idPagamento": 1,
			"descrição": "PIX"
		},
		{
			"idPagamento": 2,
			"descrição": "DEBITO"
		}
	],
	"pageable": {
		"sort": {
			"empty": true,
			"sorted": false,
			"unsorted": true
		},
		"offset": 0,
		"pageNumber": 0,
		"pageSize": 50,
		"paged": true,
		"unpaged": false
	},
	"last": true,
	"totalElements": 3,
	"totalPages": 1,
	"size": 50,
	"number": 0,
	"sort": {
		"empty": true,
		"sorted": false,
		"unsorted": true
	},
	"first": true,
	"numberOfElements": 3,
	"empty": false
}
</details>
----------------------------------------------------------------------------------------------------------------------
  Metodo **GET** 
  
  URL : **/api/tipopagamento/{id}**
  
  Resposta : deve restornar o tipo de pagamento desse do {id}
  
  Exemplo de requisição :
  
  ```
    localhost:8080/api/tipopagamento/2
  ```
  
  Exemplo de resposta :
  
  ```
{
	"idPagamento": 2,
	"descrição": "DEBITO"
}
  ```

----------------------------------------------------------------------------------------------------------------------
  ### Cadastro
  
  **Função** : Cadastrar um novo tipo de pagamento.
  
  Metodo **POST** 
  
  URL : **/api/tipopagamento**
  
  | Campo do Json  | Tipo |
| ------------- | ------------- |
| descrição  | String  |



  Exemplo de requisição :
  
  ```
{
"descrição": "Crédito"
}
  ```
  
  Exemplo de reposta :
  ```
{
"idPagamento": 6,
"descrição": "CRÉDITO"
}
  ```
 ---------------------------------------------------------------------------------------------------------------------------------------------------
 ### Alteração
  **Função** : Deve alterar as informações do tipo de pagamento
  Deve passa a URL com o id do tipo de pagamento que se quer alterar, no json deve informa o json existem na criação com as alterações desejadas.
  
  Metodo **PUT** 
  
  URL : **/api/tipopagamento/{id}**
    
    
  | Campo do Json  | Tipo |
| ------------- | ------------- |
| descrição  | String  |


  Exemplo de requisição :

  
```
{
"descrição": "Crédito"
}
```
    
  Exemplo de reposta :
  ```
{
"idPagamento": 6,
"descrição": "CRÉDITO"
}
  ```
  
  --------------------------------------------------------------------------------------------------------------------------------------------------------
  
  ### Apaga
  
  **Função** : remove algum tipo de pagamento.
  Deve passa a URL com o ID do tipo de pagamento a ser apagado.
  
  Metodo : **DELETE**
  
  URL : **/api/tipopagamento/{id}**
  
  Exemplo de requisição :
  ```
  localhost:8080/api/tipopagamento/2
  ```
  
  Deve retornar um 204 se der certo.
  
  -----------------------------------------------------------------------------------------------------------------------------------------------------------
  -----------------------------------------------------------------------------------------------------------------------------------------------------------
