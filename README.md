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
