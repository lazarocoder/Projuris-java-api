# projuris-teste-Lázaro
Segue o teste com seu escopo.

Coleção de testes via:POSTMAN

https://www.getpostman.com/collections/9999ee2ca6064088ed3f

Documentação das requisições realizadas

https://documenter.getpostman.com/view/4029859/RzZCFdqd

Recursos Disponíveis

### Funcionário

Listar todos os funcionários (Lista padrão enviada no documento de teste)
GET - http://localhost:8080/funcionarios
Exemplo de requisição:

```javascript
var settings = {
  "async": true,
  "crossDomain": true,
  "url": "http://localhost:8080/funcionarios",
  "method": "GET",
  "headers": {
    "Accept": "application/json",
    "Content-Type": "application/json"
  }
}

$.ajax(settings).done(function (response) {
  console.log(response);
});
```

Buscar funcionrio pelo índice no array listado acima
GET - http://localhost:8080/funcionarios/{index}
Exemplo de requisição:
```javascript
var settings = {
  "async": true,
  "crossDomain": true,
  "url": "http://localhost:8080/funcionarios/7",
  "method": "GET",
  "headers": {
    "Accept": "application/json",
    "Content-Type": "application/json"
  }
}

$.ajax(settings).done(function (response) {
  console.log(response);
});
```

### Array
Buscar ocorrência de uma subarray em uma outro array
POST - http://localhost:8080/busca_sub_array
Exemplo:
```javascript
var settings = {
  "async": true,
  "crossDomain": true,
  "url": "http://localhost:8080/busca_sub_array",
  "method": "POST",
  "headers": {
    "Accept": "application/json",
    "Content-Type": "application/json"
  },
  "processData": false,
  "data": "{\n\t\"mainArray\": [4, 9, 3, 7, 8],\n\t\"subArray\": [3, 7]\n}"
}

$.ajax(settings).done(function (response) {
  console.log(response);
});
```

### Char
Busca a primeira letra única em uma palavra
POST - http://localhost:8080/busca_letra_unica
Exemplo:
```javascript
var settings = {
  "async": true,
  "crossDomain": true,
  "url": "http://localhost:8080/busca_letra_unica",
  "method": "POST",
  "headers": {
    "Accept": "application/json",
    "Content-Type": "application/json"
  },
  "processData": false,
  "data": "{\n\t\"word\": \"stress\"\n}"
}

$.ajax(settings).done(function (response) {
  console.log(response);
});
```

### Cálculo
Busca o custo total por Cargo
GET - http://localhost:8080/calculo/cargo 
Exemplo:
```javascript
var settings = {
  "async": true,
  "crossDomain": true,
  "url": "http://localhost:8080/calculo/cargo",
  "method": "GET",
  "headers": {
    "Accept": "application/json",
    "Content-Type": "application/json"
  }
}

$.ajax(settings).done(function (response) {
  console.log(response);
});
```

Busca o custo total por Departamento
GET - http://localhost:8080/calculo/departamento 
Exemplo:
```javascript
var settings = {
  "async": true,
  "crossDomain": true,
  "url": "http://localhost:8080/calculo/departamento",
  "method": "GET",
  "headers": {
    "Accept": "application/json",
    "Content-Type": "application/json"
  }
}

$.ajax(settings).done(function (response) {
  console.log(response);
});
```
