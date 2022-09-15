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

## APIs

# Restaurante:

  Metodo **GET** 
  
  URL : **/api/restaurante**
  
  Resposta : deve restornar todos os restaurantes cadastrados de forma paginada.
  
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
  
  
  
