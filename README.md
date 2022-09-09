# prikkasApi
------------------------------------------------------------------------------
  Api para manipulação de dados do banco


## Descrição: 

O App será desenvolvido em React Native sendo compatível tanto para Android como 
para IOS que se comunicará com a Api via Json.
As APIs estarão em nuvem (Azure) e serão feitas em Java, as Api deverão enviar o 
comando para a Machine Learning.
Assim que obter uma resposta da Machine Learning a Api deverá decidir se precisa usar 
o banco de dados. Essa comunicação com o banco de dados será feita por NodeJS assim 
que o banco devolver as informações para as APIs, ela deve enviar para o Watson 
Assistant criar uma mensagem de voz e a Api deve devolver para o usuário.
Caso a resposta da Machine Learning não precise de acesso ao banco de dados a Api deve 
enviar para o Watson Assistant criar uma resposta e a Api deve devolver para o usuário
